public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        Resource resource = new Resource(array);

        Thread thread1 = new Thread(new IncrementTask(resource));
        Thread thread2 = new Thread(new MultiplyTask(resource));
        Thread thread3 = new Thread(new AverageTask(resource));

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}