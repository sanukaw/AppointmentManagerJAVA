package org.iit;

public class XmlRepositoryFactory extends RepositoryFactory {
    @Override
    public AppointmentRepository createRepository() {
        return new XmlRepository();
    }
}
