package com.datajpa.practice;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;

public class Service {

    // Save trainer
    public void save(FitnessTrainer trainer, FitnessRepository repo) {

        FitnessTrainer savedTrainer = repo.save(trainer);

        System.out.println("Trainer saved successfully.");
        System.out.println("Generated ID: " + savedTrainer.getId());
    }

    // Find trainer by ID
    public void findById(FitnessRepository repo, int id) {

        Optional<FitnessTrainer> optional = repo.findById(id);
       

        if (optional.isPresent()) {

            FitnessTrainer trainer = optional.get();

            System.out.println(trainer);

        } else {

            System.out.println("Trainer not available.");
        }
    }

    // Find all trainers
    public void findAll(FitnessRepository repo) {

        List<FitnessTrainer> trainers = repo.findAll();

        if (trainers.isEmpty()) {

            System.out.println("No trainers available.");

        } else {

            for (FitnessTrainer trainer : trainers) {

                System.out.println(trainer);
            }
        }
    }

    // Update trainer
    public void update(FitnessRepository repo, int id,
                       String name, int age, int experience) {

        Optional<FitnessTrainer> optional = repo.findById(id);

        if (optional.isPresent()) {

            FitnessTrainer trainer = optional.get();

            trainer.setName(name);
            trainer.setAge(age);
            trainer.setExperience(experience);

            repo.save(trainer);

            System.out.println("Trainer updated successfully.");

        } else {

            System.out.println("Trainer not available.");
        }
    }

    // Delete trainer
    public void deleteById(FitnessRepository repo, int id) {

        Optional<FitnessTrainer> optional = repo.findById(id);

        if (optional.isPresent()) {

            repo.deleteById(id);

            System.out.println("Trainer deleted successfully.");

        } else {

            System.out.println("Trainer not available.");
        }
    }
}