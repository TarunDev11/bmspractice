package com.scaler.bookmyshow1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Theatre extends BaseModel{

    private String theatreName;
    private String Address;

    @OneToMany
    List<Show> show = new ArrayList<>();


}
