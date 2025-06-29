package org.gaurav;

public class WeatherService {

    private final WeatherApiClient api;

    public WeatherService(WeatherApiClient api) {
        this.api = api;
    }

    public String getWeatherReport(String city) {
        String weather = api.getWeather(city);
        return "Weather in " + city + ": " + weather;
    }
}
