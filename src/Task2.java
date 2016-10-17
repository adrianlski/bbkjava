public class Task2 {
    public static void main(String[] args){
        double[] doubleArray = new double[] {8,4,5,21,7,9,18,2,100};
        System.out.println(doubleArray.length);
        System.out.println(doubleArray[0]);
        System.out.println(doubleArray[8]);
        System.out.println(doubleArray[doubleArray.length - 1]);

        for(int i = 0; i < doubleArray.length; i++){
            System.out.println(doubleArray[i]);
        }

        for(int i = 0; i < doubleArray.length; i++){
            System.out.println(i +":"+ doubleArray[i]);
        }

        for (double item : doubleArray) {
            System.out.println(item);
        }
    }

}
