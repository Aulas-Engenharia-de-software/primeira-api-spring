package com.task.spring_boot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "discipline")
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    private String class_hours;
    private String course;
    private String teacher;
}
