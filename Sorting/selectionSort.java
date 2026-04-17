public class selectionSort {

    public static void main(String[] args) {

        int temp = 0;
        int[] nums = { 6, 5, 2, 8, 3, 7 };
        int n = nums.length;
        System.out.println("Array Before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        for (int i = 0; i < n ; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;

        }

        System.out.println();
        System.out.println("Array After sorting");
        for (int i = 0; i < n; i++) {
        System.out.print(nums[i] + " ");
        }
    }
}