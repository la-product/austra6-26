package cz.vsb.austra.dto;

public class WeatherDto {
    private String location;
    private String timestamp;
    private Double temp_celsius;
    private String weather_descriptions;
    private Double wind_speed_mps;
    private String wind_direction;
    private Integer rel_humidity;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Double getTemp_celsius() {
        return temp_celsius;
    }

    public void setTemp_celsius(Double temp_celsius) {
        this.temp_celsius = temp_celsius;
    }

    public String getWeather_descriptions() {
        return weather_descriptions;
    }

    public void setWeather_descriptions(String weather_descriptions) {
        this.weather_descriptions = weather_descriptions;
    }

    public Double getWind_speed_mps() {
        return wind_speed_mps;
    }

    public void setWind_speed_mps(Double wind_speed_mps) {
        this.wind_speed_mps = wind_speed_mps;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public Integer getRel_humidity() {
        return rel_humidity;
    }

    public void setRel_humidity(Integer rel_humidity) {
        this.rel_humidity = rel_humidity;
    }
}
