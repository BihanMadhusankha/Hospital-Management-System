package edu.iuhs.crm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String nic;
    private String address;
    private String bloodGroup;
    private String category;
    private String contact;
    private String note;
    private String age;
    private String allergies;

}
