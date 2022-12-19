package day24_;

public class T12 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 3, 6, 4};
        for (int i = 1; i < arr.length-1; i++) {  // i is index number
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {  // j is the last index number on the left
                leftSum += arr[j];
            }
            for (int k = arr.length - 1; k > i; k--) {  // k is the first index number on the right
                rightSum += arr[k];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                break;
            }
        }
    }
}
