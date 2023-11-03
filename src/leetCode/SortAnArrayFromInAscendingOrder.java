package leetCode;

import java.util.Arrays;

public class SortAnArrayFromInAscendingOrder {
    public static int[] ascendingSort(int[] nums){
        int temp = 0;
        for (int index = 0; index < nums.length; index++) {
            for (int item = index; item < nums.length-1; item++) {
                if (nums[index] > nums[item + 1]){
                     temp = nums[index];
                    nums[index] = nums[item + 1];
                    nums[item +1] = temp;

            }
        }
        }
    return nums;
    }

    public static void main(String[] args) {
      int []  the_list  = {5,4,7,2,8,1};
        System.out.println(Arrays.toString(ascendingSort(the_list)));
    }


}
