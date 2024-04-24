package com.scaler.bookmyshow1.Model;

import com.scaler.bookmyshow1.Enum.BookingStatus;
import com.scaler.bookmyshow1.Enum.PaymentMethod;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;


@Entity
public class Payment extends BaseModel {
    private User user;

    @Enumerated
    private PaymentMethod paymentMethod;

    @Enumerated
    private BookingStatus bookingStatus;

}
