package edu.parinya.softarchdesign.structural;

import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {

    Set<HealthcareServiceable> members;

    public HealthcareWorkerTeam() {

    }

    void addMember(HealthcareWorker worker) {

    }

    void removeMember() {

    }

    @Override
    public void service() {

    }

    @Override
    public double getPrice() {
        return 0;
    }
}
