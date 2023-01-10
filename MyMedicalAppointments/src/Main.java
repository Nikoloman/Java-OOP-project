import static UI.UIMenus.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        //With one constructor
        Doctor doctorJesus = new Doctor("Jesus Velazquez", "psychiatrist");
        doctorJesus.showName();
        doctorJesus.showSpeciality();
        //With another constructor
        Doctor doctorMax = new Doctor();

        Patient patient = new Patient("Michel Ortiz", "someEmail@gmail.com");
    }
}