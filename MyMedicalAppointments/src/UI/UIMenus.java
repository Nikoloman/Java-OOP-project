package UI;

import java.util.Scanner;

public class UIMenus {
    
    public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June",
                                    "July", "August", "September", "October", "November", "December"};

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Chose an option");

        int response = 0;
        do {
            System.out.println("1. model.Doctor");
            System.out.println("2. model.Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response) {
                case 1 -> System.out.println("model.Doctor");
                case 2 -> {
                    response = 0;
                    showPatientMenu();
                }
                case 0 -> System.out.println("Thank you for you visit");
                default -> System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response) {
                case 1 -> {
                    System.out.println("----- Book an appointment -----");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + ".- " + MONTHS[i]);
                    }
                }
                case 2 -> System.out.println("----- My appointments -----");
                case 0 -> showMenu();
            }
        }while (response != 0);
    }
}
