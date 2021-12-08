import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        int sum=0;
        int avg=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter an element for index"+i+":");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum=sum + arr[i];
            avg= sum/arr[i];
        }
        System.out.println("sum :"+sum);
        System.out.println("avg:"+avg);
    }
}
