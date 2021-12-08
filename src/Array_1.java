import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        int even =0;
        int odd =0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter an element for index"+i+":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 ==0) {
                even+=1;
            }
                else
                odd+=1;
            }
        System.out.println("number of array is" +even);
        System.out.println("number of array is"  +odd);
    }
}

