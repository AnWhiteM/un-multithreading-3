public class MultiplyTask implements Runnable {
    private Resource resource;

    public MultiplyTask(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        int product = resource.multiplyValues();
        System.out.println("Multiplied values: " + product);
    }
}