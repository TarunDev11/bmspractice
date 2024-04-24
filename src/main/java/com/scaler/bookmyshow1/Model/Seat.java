package com.scaler.bookmyshow1.Model;

import com.scaler.bookmyshow1.Enum.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;

@Entity
public class Seat extends BaseModel {
    private String row;
    private int col;

    @Enumerated
    private SeatType seatType;

}
