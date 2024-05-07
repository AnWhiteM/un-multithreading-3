public class AverageTask implements Runnable {
    private Resource resource;

    public AverageTask(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        double avg = resource.average();
        System.out.println("Average: " + avg);
    }
}