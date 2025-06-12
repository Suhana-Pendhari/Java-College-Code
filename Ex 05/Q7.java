import hospital.Doctor;
import hospital.Patient;
import hospital.Appointment;

public class Q7 {
    public static void main(String[] args) {
        Doctor doc = new Doctor(101, "Dr. Suhu", "Cardiologist");
        Patient pat = new Patient(201, "Shinchan Nohara", 45);

        Appointment app = new Appointment(doc, pat, "2025-05-12", "Take BP tablet daily after food");

        app.showDetails();
    }
}
