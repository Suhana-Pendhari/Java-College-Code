package hospital;

public class Appointment {
    public Doctor doctor;
    public Patient patient;
    public String date;
    public String prescription;

    public Appointment(Doctor doctor, Patient patient, String date, String prescription) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.prescription = prescription;
    }

    public void showDetails() {
        System.out.println("---- Appointment Details ----");
        System.out.println("Doctor: " + doctor.name + " (" + doctor.specialization + ")");
        System.out.println("Patient: " + patient.name + ", Age: " + patient.age);
        System.out.println("Date: " + date);
        System.out.println("Prescription: " + prescription);
        System.out.println("-----------------------------");
    }
}
