package br.com.senac.control.controllers;

import br.com.senac.R;
import br.com.senac.model.vo.Consulta;
import br.com.senac.util.UtilNumberFormat;
import br.com.senac.view.ResultadoActivity;

public class ResultadoControl {

    private ResultadoActivity activity;

    public ResultadoControl(ResultadoActivity activity) {
        this.activity = activity;
        receberDadosDaMain();
    }


    public void receberDadosDaMain() {
        Consulta consulta = (Consulta) activity.getIntent().getSerializableExtra("consulta");
        mostrarDadosNaView(consulta);
    }

    public void mostrarDadosNaView(Consulta consulta) {
        activity.getTvTemp().setText(UtilNumberFormat.deDecimalParaCelciusFormatado(consulta.getTemperatura()));
        activity.getTvCidade().setText(consulta.getCidade().getNome());
        activity.getTvUmidade().setText("Umidade: " + consulta.getUmidade().toString() +"%");
        activity.getImgClima().setImageResource(verificarQualOIconeDaConsulta(consulta.getIcon()));
        activity.getTvClimaDesc().setText(consulta.getDescricao());
    }


    public int verificarQualOIconeDaConsulta(String nomeDaImagem) {
        if (nomeDaImagem.endsWith("01d")) {
            return R.drawable.i01d;
        }
        if (nomeDaImagem.endsWith("01n")) {
            return R.drawable.i01n;
        }
        if (nomeDaImagem.endsWith("02d")) {
            return R.drawable.i02d;
        }
        if (nomeDaImagem.endsWith("02n")) {
            return R.drawable.i02n;
        }
        if (nomeDaImagem.endsWith("03d")) {
            return R.drawable.i03d;
        }
        if (nomeDaImagem.endsWith("03n")) {
            return R.drawable.i03n;
        }
        if (nomeDaImagem.endsWith("04d")) {
            return R.drawable.i04d;
        }
        if (nomeDaImagem.endsWith("04n")) {
            return R.drawable.i04n;
        }
        if (nomeDaImagem.endsWith("09d")) {
            return R.drawable.i09d;
        }
        if (nomeDaImagem.endsWith("09n")) {
            return R.drawable.i09n;
        }
        if (nomeDaImagem.endsWith("10d")) {
            return R.drawable.i10d;
        }
        if (nomeDaImagem.endsWith("10n")) {
            return R.drawable.i10n;
        }
        if (nomeDaImagem.endsWith("11d")) {
            return R.drawable.i11d;
        }
        if (nomeDaImagem.endsWith("11n")) {
            return R.drawable.i11n;
        }
        if (nomeDaImagem.endsWith("13d")) {
            return R.drawable.i13d;
        }
        if (nomeDaImagem.endsWith("13n")) {
            return R.drawable.i13n;
        }
        if (nomeDaImagem.endsWith("50d")) {
            return R.drawable.i50d;
        }
        if (nomeDaImagem.endsWith("50n")) {
            return R.drawable.i50n;
        }
        return 0;
    }


}
