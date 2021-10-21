package edu.parinya.softarchdesign.structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker {

    HealthcareWorker worker;

    public HealthcareWorkerDecorator(HealthcareWorker healthcareWorkerworker) {

    }

    @Override
    public void service() {

    }

    @Override
    public double getPrice() {
        return 0;
    }
}
