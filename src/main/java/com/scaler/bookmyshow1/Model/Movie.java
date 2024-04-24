package com.scaler.bookmyshow1.Model;

import com.scaler.bookmyshow1.Enum.Genre;
import com.scaler.bookmyshow1.Enum.Language;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie extends BaseModel{
    private String MovieName;
    @Enumerated
    private Genre genre;
    private String description;
    private Double rating;
    private Time duration;

    @Enumerated
    private List<Language> language = new ArrayList<>();

}
