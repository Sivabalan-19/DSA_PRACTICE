public class mergeSort {

    public static void conquer(int[] nums, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftarr[i] = nums[i + left];
        }
        for (int i = 0; i < n2; i++) {
            rightarr[i] = nums[i + mid + 1];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            if (leftarr[i] >= rightarr[j]) {
                nums[k] = rightarr[j++];
            } else {
                nums[k] = leftarr[i++];
            }
            k++;
        }

        while (i < n1) {
            nums[k++] = leftarr[i++];
        }
        while (j < n2) {
            nums[k++] = rightarr[j++];
        }

    }

    public static void divide(int[] nums, int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;
            divide(nums, left, mid );
            divide(nums, mid + 1, right);

            conquer(nums, left, mid, right);
        }

    }

    public static void main(String[] args) {

        int[] nums = { 6, 5, 2, 8, 3, 7 };
        int n = nums.length;
        System.out.println("Array Before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        divide(nums, 0, nums.length - 1);

        System.out.println();
        System.out.println("Array After sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}