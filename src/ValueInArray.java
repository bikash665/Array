import java.util.Scanner;

public class ValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter an element for index" + i + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Search value ");
        int index = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (index == arr[i]) {
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("Found");
        else
            System.out.println("not found");
    }
}
