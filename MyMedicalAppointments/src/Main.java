import java.util.Date;

import static UI.UIMenus.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor doctorJesus = new Doctor("Jesus Velazquez", "Psychiatrist");
        doctorJesus.addAvailableAppointment(new Date(), "6:00 PM");
        doctorJesus.addAvailableAppointment(new Date(), "3:00 PM");
        doctorJesus.addAvailableAppointment(new Date(), "8:00 PM");

        for (Doctor.AvailableAppointment availableAppointment : doctorJesus.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        Patient patient = new Patient("Michel Ortiz", "someEmail@gmail.com");
        patient.setWeight(59.5);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("11223344");
    }
}