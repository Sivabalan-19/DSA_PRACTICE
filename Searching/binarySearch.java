package Searching;

public class binarySearch {

    public static int binSearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int target = 50;
        int ind = binSearch(arr, target);
        if (ind == -1) {
            System.out.println("Element not found in the Array");
        } else {
            System.out.println("Element found in the Array " + ind);
        }
    }

}
