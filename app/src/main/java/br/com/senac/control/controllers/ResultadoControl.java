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
        activity.getTvUmidade().setText("Umidade: " + consulta.getUmidade().toString() + "%");
        activity.getImgClima().setImageResource(verificarQualOIconeDaConsulta(consulta.getIcon()));
        activity.getTvClimaDesc().setText(verificaQualADescricaoDaConsulta(consulta.getDescricaoID()));
    }

    public int verificaQualADescricaoDaConsulta(Integer descricaoID) {
        if (descricaoID.equals(200)) {
            return R.string.d200;
        }
        if (descricaoID.equals(201)) {
            return R.string.d201;
        }
        if (descricaoID.equals(202)) {
            return R.string.d202;
        }
        if (descricaoID.equals(210)) {
            return R.string.d210;
        }
        if (descricaoID.equals(211)) {
            return R.string.d211;
        }
        if (descricaoID.equals(212)) {
            return R.string.d212;
        }
        if (descricaoID.equals(221)) {
            return R.string.d221;
        }
        if (descricaoID.equals(230)) {
            return R.string.d230;
        }
        if (descricaoID.equals(231)) {
            return R.string.d231;
        }
        if (descricaoID.equals(232)) {
            return R.string.d232;
        }
        if (descricaoID.equals(300)) {
            return R.string.d300;
        }
        if (descricaoID.equals(301)) {
            return R.string.d301;
        }
        if (descricaoID.equals(302)) {
            return R.string.d302;
        }
        if (descricaoID.equals(310)) {
            return R.string.d310;
        }
        if (descricaoID.equals(311)) {
            return R.string.d311;
        }
        if (descricaoID.equals(312)) {
            return R.string.d312;
        }
        if (descricaoID.equals(313)) {
            return R.string.d313;
        }
        if (descricaoID.equals(314)) {
            return R.string.d314;
        }
        if (descricaoID.equals(321)) {
            return R.string.d321;
        }
        if (descricaoID.equals(500)) {
            return R.string.d500;
        }
        if (descricaoID.equals(501)) {
            return R.string.d501;
        }
        if (descricaoID.equals(502)) {
            return R.string.d502;
        }
        if (descricaoID.equals(503)) {
            return R.string.d503;
        }
        if (descricaoID.equals(504)) {
            return R.string.d504;
        }
        if (descricaoID.equals(511)) {
            return R.string.d511;
        }
        if (descricaoID.equals(520)) {
            return R.string.d520;
        }
        if (descricaoID.equals(521)) {
            return R.string.d522;
        }
        if (descricaoID.equals(522)) {
            return R.string.d522;
        }

        if (descricaoID.equals(531)) {
            return R.string.d531;
        }
        if (descricaoID.equals(600)) {
            return R.string.d601;
        }
        if (descricaoID.equals(602)) {
            return R.string.d602;
        }
        if (descricaoID.equals(611)) {
            return R.string.d611;
        }
        if (descricaoID.equals(612)) {
            return R.string.d612;
        }
        if (descricaoID.equals(613)) {
            return R.string.d613;
        }
        if (descricaoID.equals(615)) {
            return R.string.d615;
        }
        if (descricaoID.equals(616)) {
            return R.string.d616;
        }
        if (descricaoID.equals(620)) {
            return R.string.d620;
        }
        if (descricaoID.equals(621)) {
            return R.string.d621;
        }
        if (descricaoID.equals(622)) {
            return R.string.d622;
        }
        if (descricaoID.equals(701)) {
            return R.string.d701;
        }
        if (descricaoID.equals(711)) {
            return R.string.d711;
        }
        if (descricaoID.equals(721)) {
            return R.string.d721;
        }
        if (descricaoID.equals(731)) {
            return R.string.d731;
        }
        if (descricaoID.equals(741)) {
            return R.string.d741;
        }
        if (descricaoID.equals(751)) {
            return R.string.d751;
        }
        if (descricaoID.equals(761)) {
            return R.string.d761;
        }
        if (descricaoID.equals(762)) {
            return R.string.d762;
        }
        if (descricaoID.equals(771)) {
            return R.string.d771;
        }
        if (descricaoID.equals(781)) {
            return R.string.d781;
        }
        if (descricaoID.equals(800)) {
            return R.string.d800;
        }
        if (descricaoID.equals(801)) {
            return R.string.d801;
        }
        if (descricaoID.equals(802)) {
            return R.string.d802;
        }
        if (descricaoID.equals(803)) {
            return R.string.d803;
        }
        if (descricaoID.equals(804)) {
            return R.string.d804;
        }
        return 0;
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
