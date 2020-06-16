package br.com.senac.model.dao;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;
import java.net.URL;

import br.com.senac.model.api.Weather;
import br.com.senac.model.vo.Cidade;

public class WeatherServerAPI {

    private static String URL_PREFIX = "http://api.openweathermap.org/data/2.5/weather?q=";
    private static String URL_PARAM_APP_ID = "&appid=";
    private static String URL_APP_ID = "a229614ea2dc0d9e7e48d2384b4d0779";

    private static Weather getOkHttp(Cidade cidade) throws IOException {
        Weather weather = new Weather();
        Gson gson = new Gson();

        String chave = cidade.getChaveAPI();
        URL url = new URL(URL_PREFIX + chave + URL_PARAM_APP_ID + URL_APP_ID);

        OkHttpClient httpClient = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        builder.url(url);
        builder.addHeader("Accept", "application/json");
        builder.addHeader("content-type", "application/json");
        builder.get();
        Request request = builder.build();
        ResponseBody responseBody = httpClient.newCall(request).execute().body();

        weather = gson.fromJson(responseBody.string(), Weather.class);
        return weather;
    }

    public static Weather get(Cidade cidade) throws IOException {
        return getOkHttp(cidade);
    }
}
