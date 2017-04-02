package FindDistance;


public class FindDistance {

    public static void main(String[] args) {
        final int[] NUM = {23, 45, 34, 12, 45, 4, 38, 56, 2, 49, 100};
        System.out.println(findDistance(NUM));
    }

    public static int findDistance(int[] nums) {

        int minNumber1 = nums[0];
        int minNumber2 = nums[1];
        int minIndex1 = 0;
        int minIndex2 = 1;

        for (int i = 0; i < nums.length; i++) {
            if (minNumber1 > nums[i] && minIndex2 != i) {
                minNumber1 = nums[i];
                minIndex1 = i;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (minNumber2 > nums[j] && minIndex1 != j) {
                minNumber2 = nums[j];
                minIndex2 = j;
            }
        }

        return Math.abs(minIndex1 - minIndex2);
    }
}
