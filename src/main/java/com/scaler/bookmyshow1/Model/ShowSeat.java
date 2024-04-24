package com.scaler.bookmyshow1.Model;

import com.scaler.bookmyshow1.Enum.SeatStatus;
import com.scaler.bookmyshow1.Enum.SeatType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ShowSeat extends BaseModel{

    @OneToMany
    private List<Seat> seat = new ArrayList<>();

    @Enumerated
    private SeatStatus seatStatus;



}
