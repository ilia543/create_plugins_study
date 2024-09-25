import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array1 = new int[15];
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();


        int result = obs(x) + obs(y) + obs(z);
        System.out.println(result);



        sigmafor(array1);
    }
    private static void sigmafor(int[] arr) {
        for (int s = 0; s < arr.length / 2; s++) {
            System.out.print(arr[s] + " ");
        }
    }
    private static int obs(int n) {
        if (n > 0) {
            return n;
        } else {
            return -n;
        }
    }
}