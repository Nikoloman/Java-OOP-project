package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Properties
    String speciality;

    //Constructor

    /**
     *
     * @param name The name of the doctor
     */
    public Doctor(String name, String email){
        super(name, email);
    }

    //Methods
    public  void showSpeciality(){
        System.out.println("The speciality of the doctor is: " + speciality);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Speciality: " + speciality + "\n" +
                "Available: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Employee of the hospital: San Juan de Dios");
        System.out.println("Department: Psychiatry");
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments\n" +
                    "Date: " + date + "\n" +
                    "Time: " + time + "\n";
        }
    }
}
