package com.datajpa.practice;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DataJpaProjectApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(DataJpaProjectApplication.class, args);

        // Get Spring Data JPA repository bean
        FitnessRepository repo =
                context.getBean(FitnessRepository.class);

        Service service = new Service();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n==============================");
            System.out.println("     FITNESS TRAINER CRUD");
            System.out.println("==============================");
            System.out.println("1. Save Trainer");
            System.out.println("2. Find Trainer By ID");
            System.out.println("3. Find All Trainers");
            System.out.println("4. Update Trainer");
            System.out.println("5. Delete Trainer");
            System.out.println("6. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

            case 1:

                System.out.println("\n--- Save Trainer ---");

                System.out.print("Enter trainer name: ");
                String name = scanner.next();

                System.out.print("Enter trainer age: ");
                int age = scanner.nextInt();

                System.out.print("Enter trainer experience: ");
                int experience = scanner.nextInt();

                FitnessTrainer trainer = new FitnessTrainer();

                trainer.setName(name);
                trainer.setAge(age);
                trainer.setExperience(experience);

                service.save(trainer, repo);

                break;

            case 2:

                System.out.println("\n--- Find Trainer By ID ---");

                System.out.print("Enter trainer ID: ");
                int findId = scanner.nextInt();

                service.findById(repo, findId);

                break;

            case 3:

                System.out.println("\n--- All Trainers ---");

                service.findAll(repo);

                break;

            case 4:

                System.out.println("\n--- Update Trainer ---");

                System.out.print("Enter trainer ID: ");
                int updateId = scanner.nextInt();

                System.out.print("Enter new name: ");
                String updateName = scanner.next();

                System.out.print("Enter new age: ");
                int updateAge = scanner.nextInt();

                System.out.print("Enter new experience: ");
                int updateExperience = scanner.nextInt();

                service.update(
                        repo,
                        updateId,
                        updateName,
                        updateAge,
                        updateExperience
                );

                break;

            case 5:

                System.out.println("\n--- Delete Trainer ---");

                System.out.print("Enter trainer ID: ");
                int deleteId = scanner.nextInt();

                service.deleteById(repo, deleteId);

                break;

            case 6:

                System.out.println("Application closed.");

                scanner.close();

                return;

            default:

                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}