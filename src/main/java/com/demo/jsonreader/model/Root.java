package com.demo.jsonreader.model;

import lombok.Data;

@Data
public class Root {
    private int id;
    private String uid;
    private String password;
    private String first_name;
    private String last_name;
    private String username;
    private String email;
    private String avatar;
    private String gender;
    private String phone_number;
    private String social_insurance_number;
    private String date_of_birth;
    private EventType event_type;
    private Address address;
    private CreditCard credit_card;
    private Subscription subscription;
}
