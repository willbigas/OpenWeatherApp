package br.com.senac.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.Window;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.senac.R;
import br.com.senac.control.services.CidadeService;
import br.com.senac.control.services.ConversorDeTemperatura;
import br.com.senac.model.api.Weather;
import br.com.senac.model.dao.WeatherServerAPI;
import br.com.senac.model.vo.Cidade;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        CidadeService cidadeService  = new CidadeService(this);
        List<Cidade> cidades = new ArrayList<>();
        try {
            cidadeService.persistirCidadesIniciais();
            cidades = cidadeService.buscarTodos();
            System.out.println(cidades);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            Weather weather = WeatherServerAPI.get(cidades.get(0));
            System.out.println("Temperatura da Palhoça " + ConversorDeTemperatura.deKelvinParaCelcius(weather.getMain().getTemp()));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}