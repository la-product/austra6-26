package cz.vsb.austra.connector;

import cz.vsb.austra.dto.WeatherApiDto;
import org.jspecify.annotations.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;

@Component
public class WeatherConnector {
    //https://api.weatherapi.com/v1/current.json?key=2f3d5a0c8d0a4dd7986132149232003&q=Ostrava

    String baseURl = "https://api.weatherapi.com/v1/current.json?key=";
    String ApiKey = "2f3d5a0c8d0a4dd7986132149232003";
    String urlParams = "&q=";

    public @Nullable WeatherApiDto getWeatherForCity(String city){
        RestTemplate template = new RestTemplate();
        URI uri = null;
        try {
             uri = new URI(baseURl+ApiKey+urlParams+city);
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        ResponseEntity<WeatherApiDto> response = template.getForEntity(uri, WeatherApiDto.class);
        return response.getBody();
    }

}
