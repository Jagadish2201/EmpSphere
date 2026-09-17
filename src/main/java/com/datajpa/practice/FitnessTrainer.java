package com.datajpa.practice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "trainer_db")
@Data
@NoArgsConstructor
public class FitnessTrainer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trainerId")
    private int id;

    @Column(name = "trainerName")
    private String name;

    @Column(name = "trainerAge")
    private int age;

    @Column(name = "trainerExperience")
    private int experience;
}