package org.iit;

public class Main {
    public static void main(String[] args) {

        // --------- Application chooses a factory, not a concrete repository directly ---------------
        RepositoryFactory factory = new CsvRepositoryFactory();
//         RepositoryFactory factory = new XmlRepositoryFactory();

        DiaryService diaryService = new DiaryService(factory);

        Appointment appt1 = new Appointment("A001", "John Silva", "2026-04-25", "09:00");
        Appointment appt2 = new Appointment("A002", "Mary Perera", "2026-04-25", "09:00");
        Appointment appt3 = new Appointment("A003", "Nimal Fernando", "2026-04-25", "10:00");

        System.out.println("Adding appointment 1 - " + diaryService.addAppointment(appt1));
        System.out.println("Adding appointment 2 (same slot) - " + diaryService.addAppointment(appt2));
        System.out.println("Adding appointment 3 - " + diaryService.addAppointment(appt3));

        System.out.println("\nFinding appointment at 09:00 - ");
        System.out.println(diaryService.findAppointment("2026-04-25", "09:00"));

        System.out.println("\nDeleting appointment at 09:00 - ");
        System.out.println(diaryService.deleteAppointment("2026-04-25", "09:00"));

        System.out.println("\nFinding appointment again at 09:00 - ");
        System.out.println(diaryService.findAppointment("2026-04-25", "09:00"));
    }
}
