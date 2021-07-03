package com.example.jazS_18629nbp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "currencytable")
public class CurrencyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String currency;

    @JsonFormat(pattern = "YYYY-MM-DD")
    private LocalDate firstDate;

    @JsonFormat(pattern = "YYYY-MM-DD")
    private LocalDate secondDate;

    @JsonFormat(pattern = "YYYY-MM-DD HH:MM:SS")
    private Timestamp dateOfQuerry;

    private Double averageCurrency;

}
