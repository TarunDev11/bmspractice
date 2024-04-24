package com.scaler.bookmyshow1.Model;

import com.scaler.bookmyshow1.Enum.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "BMSUser")
public class User extends BaseModel{
    private String username;
    @Enumerated
    private Gender gender;
    private String PhoneNumber;
    private String emailId;
}
