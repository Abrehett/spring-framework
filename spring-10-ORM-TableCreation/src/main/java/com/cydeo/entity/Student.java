package com.cydeo.entity;

import com.cydeo.enums.Gender;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="students") // to change the name of the table
public class Student {


    @Id // to specify the primary key of the table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // if we want postgrass to gernerate id for us
    private Long id;

    @Column(name="studentFirstName") // to change name of the columns
    private String firstName;  //first_name
    @Column(name="studentLastName")
    private String lastName;
    private String email;

    @Transient // to exclude this specific which is city column from our table
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthdate;
    @Column(columnDefinition = "TIME")
    private LocalDate birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birtDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;



}
