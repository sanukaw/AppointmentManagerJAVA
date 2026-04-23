package org.iit;

import java.util.HashMap;
import java.util.Map;

public class XmlRepository implements AppointmentRepository {
    private Map<String, Appointment> appointments = new HashMap<>();

    private String makeKey(String date, String timeSlot) {
        return date + "_" + timeSlot;
    }

    @Override
    public boolean save(Appointment appointment) {
        String key = makeKey(appointment.getDate(), appointment.getTimeSlot());

        if (appointments.containsKey(key)) {
            System.out.println("XML Repository: Slot already booked.");
            return false;
        }

        appointments.put(key, appointment);
        System.out.println("XML Repository: Saved " + appointment);
        return true;
    }

    @Override
    public boolean remove(String date, String timeSlot) {
        String key = makeKey(date, timeSlot);

        if (appointments.remove(key) != null) {
            System.out.println("XML Repository: Deleted appointment for " + key);
            return true;
        }

        System.out.println("XML Repository: No appointment found for " + key);
        return false;
    }

    @Override
    public Appointment find(String date, String timeSlot) {
        String key = makeKey(date, timeSlot);
        return appointments.get(key);
    }
}
