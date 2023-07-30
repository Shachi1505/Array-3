public class MissingNumber {
    public static int findMissingNumber(int[] arr, int N) {
        int totalSum = N * (N + 1) / 2;
        int arraySum = 0;

        // Calculate the sum of elements in the given array
        for (int num : arr) {
            arraySum += num;
        }

        // Calculate the missing number
        int missingNumber = totalSum - arraySum;
        return missingNumber;
    }

    public static void main(String[] args) {
        int N = 6; // Size of the array should be N-1, where N is the first N integers (e.g., 1 to N)
        int[] arr = { 4, 2, 1, 6, 3 }; // Example input array with N-1 elements

        int missingNumber = findMissingNumber(arr, N);
        System.out.println("The missing number is: " + missingNumber);
    }
}
