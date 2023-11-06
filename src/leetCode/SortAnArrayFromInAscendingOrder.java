package leetCode;

import java.util.Arrays;

public class SortAnArrayFromInAscendingOrder {
    public static int[] ascendingSort(int[] nums){
        int [] newArray = new int[nums.length];
        int temp = 0;
        for (int index = nums.length-1; index >0; index++) {
                if (nums[index] > newArray[index -1]){
                     temp = nums[index];
                    nums[index] = nums[index - 1];
                    nums[index -1] = temp;

        }
        }
    return nums;
    }

    public static void main(String[] args) {
      int []  the_list  = {5,4,7,2,8,1};
        System.out.println(Arrays.toString(ascendingSort(the_list)));
    }


}
