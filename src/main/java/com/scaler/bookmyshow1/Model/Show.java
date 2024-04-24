package com.scaler.bookmyshow1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shows")
public class Show extends BaseModel{
    @OneToMany
    List<ShowSeat> ShowSeat = new ArrayList<>();
    @OneToOne
    private Movie movie;
    private LocalDateTime movieStartTime;
    private Integer Duration;



}
