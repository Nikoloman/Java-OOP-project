public class Main {
    public static void main(String[] args) {
        Doctor doctorJesus = new Doctor("Jesus Orozco"); //Passing the name just as reference to the constructor
        doctorJesus.showName(); //Gives null because it was never really assigned to the object
        doctorJesus.name = "Jesus Velazquez"; //Assigning the name properly to the object
        doctorJesus.showName(); //Gives the name of the object
    }
}