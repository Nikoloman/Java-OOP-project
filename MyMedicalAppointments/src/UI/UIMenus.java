package UI;

import model.Doctor;
import model.Patient;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class UIMenus {
    
    public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June",
                                    "July", "August", "September", "October", "November", "December"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Chose an option");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response) {
                case 1 -> {
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                }

                case 2 -> {
                    response = 0;
                    authUser(2);
                }
                case 0 -> System.out.println("Thank you for you visit");
                default -> System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Jesus Velazquez", "JesusV@hospital.com"));
        doctors.add(new Doctor("Andrea Azul", "AndreaA@hospital.com"));
        doctors.add(new Doctor("Oscar Cabrales", "OscarC@hospital.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Maximiliano Ledesma", "MaxL@hospital.com"));
        patients.add(new Patient("Michel Ortiz", "MichelO@hospital.com"));
        patients.add(new Patient("Santiago Gutierrez", "SantiG@hospital.com"));

        boolean emailCorrect = false;

        do{
            System.out.println("Insert your email: [a@a.com]");
            Scanner scanner = new Scanner(System.in);
            String email = scanner.nextLine();

            if (userType == 1){
                for (Doctor d : doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        doctorLogged = d;
                    }
                }
            }

            if (userType == 2){
                for (Patient p : patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                        showPatientMenu();
                    }
                }
            }
        } while(!emailCorrect);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n");
            System.out.println("Patient");
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
