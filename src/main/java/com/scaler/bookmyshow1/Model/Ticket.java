package com.scaler.bookmyshow1.Model;

import com.scaler.bookmyshow1.Enum.BookingStatus;
import com.scaler.bookmyshow1.Enum.PaymentMethod;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Ticket extends BaseModel{

    private User user;

    @ManyToOne
    private Show show;

    @Enumerated
    private BookingStatus bookingStatus;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookedAt;
    private Double Amount;

    private List<PaymentMethod> paymentmethod = new ArrayList<>();
    @OneToMany
    private List<ShowSeat> seatBooked = new ArrayList<>();
}
