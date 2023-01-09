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
    Doctor(String name){
        System.out.println("The assigned name is: " + name);
        id++;
    }

    //Methods
    public void showName(){
        System.out.println("The name of the doctor is: " + name);
    }

    public void showIdDoctor(){
        System.out.println("The doctor's id is: " + id);
    }
}
