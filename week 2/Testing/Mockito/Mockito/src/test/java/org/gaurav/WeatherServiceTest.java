package org.gaurav;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class WeatherServiceTest {

    @Test
    public void testWeatherReportUsingMockedApi() {

        WeatherApiClient mockApiClient = mock(WeatherApiClient.class);

        when(mockApiClient.getWeather("Delhi")).thenReturn("Sunny 32°C");

        WeatherService service = new WeatherService(mockApiClient);

        String report = service.getWeatherReport("Delhi");
        System.out.println(report);
        
        assertEquals("Weather in Delhi: Sunny 32°C", report);
    }
}
