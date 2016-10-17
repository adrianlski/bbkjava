public class Task3 {
    public static void main(String[] args) {
        double[] x = {1,2,3,4,5,6,7};
        System.out.println("Before rotation: ==============================");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]: " + x[i]);
        }
        x = rotate(x, 3);
        System.out.println("After rotation: ==============================");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]: " + x[i]);
        }
    }

    private static double[] rotate(double[] x, int i) {
        double[] temp = new double[x.length];
        int counter = i;
        for (int j = 1; j <= i; j++) {
            temp[x.length-j] = x[i-j];
        }
        for (int j = 0; j < x.length - i; j++) {
            temp[j] = x[counter];
            counter++;
        }

        return temp;
    }
}
