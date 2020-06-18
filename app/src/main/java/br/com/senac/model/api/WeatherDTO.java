package br.com.senac.model.api;

import java.util.List;

public class WeatherDTO {

    private Main main;
    private List<Weather> weather;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "main=" + main +
                '}';
    }

}
