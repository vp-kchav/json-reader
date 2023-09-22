package com.demo.jsonreader.model;

import lombok.Data;

@Data
public class Address {
    private String city;
    private String street_name;
    private String street_address;
    private String zip_code;
    private String state;
    private String country;
    private Coordinates coordinates;
}
