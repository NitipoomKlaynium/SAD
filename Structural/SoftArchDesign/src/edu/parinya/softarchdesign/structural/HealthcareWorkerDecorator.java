package edu.parinya.softarchdesign.structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker {

    protected HealthcareWorker worker;

    public HealthcareWorkerDecorator(HealthcareWorker healthcareWorker) {
        super(healthcareWorker);
        worker = healthcareWorker;
    }

    @Override
    public void service() {
        worker.service();
    }

    @Override
    public double getPrice() {
        return worker.getPrice();
    }
}
