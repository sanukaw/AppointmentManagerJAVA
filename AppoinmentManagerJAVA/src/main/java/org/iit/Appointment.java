package org.iit;

public class Appointment {
    private String appointmentId;
    private String patientName;
    private String date;
    private String timeSlot;

    public Appointment(String appointmentId, String patientName, String date, String timeSlot) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.date = date;
        this.timeSlot = timeSlot;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDate() {
        return date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    @Override
    public String toString() {
        return "Appointment{id='" + appointmentId + "', patient='" + patientName +
                "', date='" + date + "', timeSlot='" + timeSlot + "'}";
    }
}
