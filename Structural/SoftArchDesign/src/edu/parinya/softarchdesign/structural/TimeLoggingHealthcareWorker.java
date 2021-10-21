package edu.parinya.softarchdesign.structural;

import java.util.Date;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {

    Date date;

    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        date = new Date();
        System.out.println("Decorate " + worker.getName() + " with TimeLogging.");
    }

    @Override
    public void service() {
        System.out.print(date + ": ");
        worker.service();
    }
}
