package cz.vsb.austra.dto;

import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Condition {

    private String text;
    private String icon;
    private Integer code;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
