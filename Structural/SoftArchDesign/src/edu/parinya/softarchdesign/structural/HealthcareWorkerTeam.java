package edu.parinya.softarchdesign.structural;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {

    private Set<HealthcareServiceable> members;

    public HealthcareWorkerTeam() {
        members = new LinkedHashSet<HealthcareServiceable>();
    }

    void addMember(HealthcareServiceable member) {
        members.add(member);
    }

    void removeMember(HealthcareWorker member) {
        members.remove(member);
    }

    @Override
    public void service() {
        for (HealthcareServiceable member : members) {
            member.service();
        }
    }

    @Override
    public double getPrice() {
        double sum = 0;
        for (HealthcareServiceable member : members) {
            sum += member.getPrice();
        }
        return sum;
    }
}
