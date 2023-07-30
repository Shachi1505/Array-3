import java.util.Scanner;

// print no. of times x comes
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i : arr) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no x");
        int x = sc.nextInt();
        int count = 0;
        for (int i : arr) {
            if (arr[i] == x)
                count++;
        }
        System.out.println(count);
    }

}
