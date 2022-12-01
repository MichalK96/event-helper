package com.codecool.CodeCoolProjectGrande.data.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "city",
        "street",
        "defined"
})
@Generated("jsonschema2pojo")
public class Address__1 implements Serializable {

    @JsonProperty("city")
    public String city;
    @JsonProperty("street")
    public String street;
    @JsonProperty("defined")
    public Boolean defined;
    private final static long serialVersionUID = -4007386846625308988L;

}