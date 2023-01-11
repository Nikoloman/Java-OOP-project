import model.Doctor;
import model.Nurse;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor doctorJesus = new Doctor("Jesus Velazquez", "Psychiatrist");
        doctorJesus.addAvailableAppointment(new Date(), "6:00 PM");
        doctorJesus.addAvailableAppointment(new Date(), "3:00 PM");
        doctorJesus.addAvailableAppointment(new Date(), "8:00 PM");

        System.out.println(doctorJesus);

        User user = new Doctor("Max Ledesma", "someOtherEmail@gmail.com");
        user.showDataUser();

        User user2 = new Patient("Oscar Carbrales", "SomeEmail@gmail.com");
        user2.showDataUser();

        User user3 = new Nurse("Andrea Azul", "OtherEmail@gmail.com");
        user3.showDataUser();

        /*
        for (model.Doctor.AvailableAppointment availableAppointment : doctorJesus.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }


        Patient patient = new Patient("Michel Ortiz", "someEmail@gmail.com");
        System.out.println(patient);
        */
    }
}