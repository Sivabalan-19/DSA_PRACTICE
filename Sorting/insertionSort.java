public class insertionSort {
    public static void main(String[] args) {

        int[] nums = { 6, 5, 2, 8, 3, 7 };
        int n = nums.length;
        System.out.println("Array Before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }

        System.out.println();
        System.out.println("Array After sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
