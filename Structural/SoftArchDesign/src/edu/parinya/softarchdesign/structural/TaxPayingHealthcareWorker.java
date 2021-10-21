package edu.parinya.softarchdesign.structural;

public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator {

    public TaxPayingHealthcareWorker(HealthcareWorker healthcareWorker) {
        super(healthcareWorker);
        System.out.println("Decorate " + worker.getName() + " with TaxPaying.");
    }

    @Override
    public void service() {
        worker.service();
    }

    @Override
    public double getPrice() {
        return worker.getPrice() * 1.1;
    }
}
