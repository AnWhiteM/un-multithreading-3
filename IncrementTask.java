public class IncrementTask implements Runnable {
    private Resource resource;

    public IncrementTask(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.incrementValues();
        System.out.println("Incremented values: " + java.util.Arrays.toString(resource.getArray()));
    }
}