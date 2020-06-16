package br.com.senac.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.Window;

import java.io.IOException;

import br.com.senac.R;
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

        Cidade cidade = new Cidade();
        cidade.setChaveAPI("palhoca,br");

        try {
            Weather weather = WeatherServerAPI.get(cidade);
            System.out.println("Temperatura da Palhoça " + ConversorDeTemperatura.deKelvinParaCelcius(weather.getMain().getTemp()));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}