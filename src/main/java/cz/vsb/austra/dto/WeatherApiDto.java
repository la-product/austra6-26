package cz.vsb.austra.dto;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class WeatherApiDto {

    private Location location;
    private Current current;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

}
