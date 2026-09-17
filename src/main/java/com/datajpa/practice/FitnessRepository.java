package com.datajpa.practice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FitnessRepository extends JpaRepository<FitnessTrainer, Integer> {

}