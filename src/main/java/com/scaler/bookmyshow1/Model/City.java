package com.scaler.bookmyshow1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity

public class City extends BaseModel{

    private String cityName;

    @OneToMany
    private List<Theatre> theatre;


}
