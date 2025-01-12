package com.vic.io.covidvaccination.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Document(collection = "UserDetails")
public class User {
    @Id
    private String id;
    private String userName;
    private String phoneNo;
    private String district_id;
    private String Fee;
    private int age;
    private int dosageType;
    private String vaccine;
    private int Pincode;
    private List<Centers> AvailableCenters;
    private boolean enable;
    private String from;
    private String to;

    public User(String userName, String phoneNo, String district_id, String fee, int age, int dosageType,String vaccine,int pincode) {
        this.userName = userName;
        this.phoneNo = phoneNo;
        this.district_id = district_id;
        this.Fee = fee;
        this.age = age;
        this.dosageType = dosageType;
        this.vaccine=vaccine;
        this.Pincode=pincode;
        this.AvailableCenters=new ArrayList<>();
        this.enable=true;
    }
}
