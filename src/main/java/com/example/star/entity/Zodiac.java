package com.example.star.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="zodiac")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Zodiac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num;
    private String name;
    private String content;
    private String startdate;
    private String enddate;
}
