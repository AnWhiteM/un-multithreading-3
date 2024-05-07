public class Resource {
    private int[] array;

    public Resource(int[] array) {
        this.array = array;
    }

    public synchronized void incrementValues() {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }

    public synchronized int multiplyValues() {
        int product = 1;
        for (int num : array) {
            product *= num;
        }
        return product;
    }

    public synchronized double average() {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public int[] getArray() {
        return array;
    }
}
