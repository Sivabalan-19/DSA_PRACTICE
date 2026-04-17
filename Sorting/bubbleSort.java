class bubbleSort {

    public static void main(String[] args) {

        int temp = 0;
        int[] nums = { 6, 5, 2, 8, 9, 4 };
        int n = nums.length;
        System.out.println("Array Before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array After sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}