package org.iit;

public class CsvRepositoryFactory extends RepositoryFactory {
    @Override
    public AppointmentRepository createRepository() {
        return new CsvRepository();
    }
}
