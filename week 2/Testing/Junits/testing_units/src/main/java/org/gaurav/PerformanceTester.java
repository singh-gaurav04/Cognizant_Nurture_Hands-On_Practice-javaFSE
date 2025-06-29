package org.gaurav;

public class PerformanceTester {

    public void performTask() {
        try {
            // Simulate a task (e.g., processing)
            Thread.sleep(200); // sleep for 200 milliseconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
