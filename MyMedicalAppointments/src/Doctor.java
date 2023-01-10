import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Properties
    static int id = 0;
    String name;
    String speciality;

    //Constructor
    Doctor(){
        System.out.println("The object Doctor has been constructed");
        id++;
    }

    /**
     *
     * @param name The name of the doctor
     */
    Doctor(String name, String speciality){
        System.out.println("The assigned name is: " + name);
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    //Methods
    public void showName(){
        System.out.println("The name of the doctor is: " + name);
    }

    public  void showSpeciality(){
        System.out.println("The speciality of the doctor is: " + speciality);
    }

    public void showIdDoctor(){
        System.out.println("The doctor's id is: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
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
    }
}
