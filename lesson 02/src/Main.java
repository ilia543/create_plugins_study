public class Main {
    public static void main(String[] args) {
        int a = 1;
        while (a < 10) {
            System.out.println(a);
            a += 1;
        }
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }
        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = 6;
        }
        for (int m = 0; m < array1.length; m++) {
            System.out.println(array1[m]);
        }
        for (int s = 0; s < array1.length / 2; s++) {
            System.out.print(array1[s] + " ");
        }







    }
}