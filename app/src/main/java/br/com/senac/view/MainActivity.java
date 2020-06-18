package br.com.senac.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.senac.R;
import br.com.senac.control.controllers.MainControl;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerCidades;
    private ListView lvCidades;
    private Button btnHistorico;

    private TextView selecioneCidade;

    private MainControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        control = new MainControl(this);
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

    public void initialize() {
        inicializaComponentes();
        initializeClickListeners();
    }

    private void initializeClickListeners() {
        btnHistorico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.chamarTelaHistorico();
            }
        });
    }


    private void inicializaComponentes() {
        spinnerCidades = findViewById(R.id.spinnerCidades);
        lvCidades = findViewById(R.id.lvCidades);
        btnHistorico = findViewById(R.id.btnHistorico);
        selecioneCidade = findViewById(R.id.selecioneCidade);
        String test= "d" + "200";
        selecioneCidade.setText(getString(Integer.parseInt(test)));
    }

    public Spinner getSpinnerCidades() {
        return spinnerCidades;
    }

    public void setSpinnerCidades(Spinner spinnerCidades) {
        this.spinnerCidades = spinnerCidades;
    }

    public ListView getLvCidades() {
        return lvCidades;
    }

    public void setLvCidades(ListView lvCidades) {
        this.lvCidades = lvCidades;
    }

    public Button getBtnHistorico() {
        return btnHistorico;
    }

    public void setBtnHistorico(Button btnHistorico) {
        this.btnHistorico = btnHistorico;
    }
}