public class Doctor {
    //Properties
    int id;
    String name;
    String speciality;

    //Constructor
    Doctor(){
        System.out.println("The object Doctor has been constructed");
    }

    /**
     *
     * @param name The name of the doctor
     */
    Doctor(String name){
        System.out.println("The assigned name is: " + name);
    }

    //Methods
    public void showName(){
        System.out.println("The name of the doctor is: " + name);
    }
}
