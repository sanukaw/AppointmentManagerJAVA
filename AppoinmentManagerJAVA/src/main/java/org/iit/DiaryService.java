package org.iit;

public class DiaryService {
    private AppointmentRepository repository;

    public DiaryService(RepositoryFactory factory) {
        this.repository = factory.createRepository();
    }

    public boolean addAppointment(Appointment appointment) {
        return repository.save(appointment);
    }

    public boolean deleteAppointment(String date, String timeSlot) {
        return repository.remove(date, timeSlot);
    }

    public Appointment findAppointment(String date, String timeSlot) {
        return repository.find(date, timeSlot);
    }
}
