package org.iit;

public interface AppointmentRepository {
    boolean save(Appointment appointment);
    boolean remove(String date, String timeSlot);
    Appointment find(String date, String timeSlot);
}
