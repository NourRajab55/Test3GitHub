import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        boolean flag = false;
        System.out.println("enter the size:");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("enter the array:");

        for(int i = 0; i < a.length; ++i) {
            a[i] = s.nextInt();
            sum += a[i];
        }

        System.out.println("sum:" + sum);
        System.out.println("enter the number you search :");
        int x = s.nextInt();

        for(int i = 0; i < a.length; ++i) {
            if (a[i] == x) {
                flag = true;
                System.out.println("the number\t" + x + "\tis exist");
                break;
            }
        }

        if (!flag) {
            System.out.println("the number\t" + x + "\tis not exist");
        }

    }
}
