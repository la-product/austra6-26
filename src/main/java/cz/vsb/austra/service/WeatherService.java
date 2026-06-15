package cz.vsb.austra.service;

import cz.vsb.austra.connector.WeatherConnector;
import cz.vsb.austra.dto.WeatherApiDto;
import cz.vsb.austra.dto.WeatherDto;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    private WeatherConnector weatherConnector;

    @Autowired
    public WeatherService(WeatherConnector weatherConnector) {
        this.weatherConnector = weatherConnector;
    }


    public @Nullable WeatherDto getWeatherForCity(String city){
        WeatherApiDto weatherApiDto = weatherConnector.getWeatherForCity(city);
        return transformDto(weatherApiDto);
    }

    private @Nullable WeatherDto transformDto(WeatherApiDto weatherApiDto) {
        WeatherDto wdto = new WeatherDto();
        wdto.setLocation(weatherApiDto.getLocation().getName() + ", " + weatherApiDto.getLocation().getCountry());
        wdto.setRel_humidity(weatherApiDto.getCurrent().getHumidity());
        wdto.setTimestamp(weatherApiDto.getCurrent().getLastUpdated());
        wdto.setWeather_descriptions(weatherApiDto.getCurrent().getCondition().getText());
        wdto.setTemp_celsius(weatherApiDto.getCurrent().getTempC());
        wdto.setWind_speed_mps(Math.floor(weatherApiDto.getCurrent().getWindKph()/3.6));
        wdto.setWind_direction(weatherApiDto.getCurrent().getWindDir());
        return wdto;
    }
}
