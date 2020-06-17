package br.com.senac.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import br.com.senac.R;
import br.com.senac.control.controllers.MainControl;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerCidades;
    private ListView lvCidades;

    private MainControl control;
    private MainActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializaComponentes();
        control = new MainControl(this.activity);
//        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
//        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        StrictMode.setThreadPolicy(policy);
//
//        CidadeService cidadeService = new CidadeService(this);
//        List<Cidade> cidades = new ArrayList<>();
//        try {
//            cidadeService.persistirCidadesIniciais();
//            cidades = cidadeService.buscarTodos();
//            System.out.println(cidades);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//        try {
//            Weather weather = WeatherServerAPI.get(cidades.get(0));
//            System.out.println("Temperatura da Palhoça " + ConversorDeTemperatura.deKelvinParaCelcius(weather.getMain().getTemp()));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


    private void inicializaComponentes() {
        spinnerCidades = findViewById(R.id.spinnerCidades);
        lvCidades = findViewById(R.id.lvCidades);
    }

    public void chamarTelaHistorico(View view) {
        Intent intent = new Intent(MainActivity.this, HistoricoActivity.class);
        startActivity(intent);
    }

}