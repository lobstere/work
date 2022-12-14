package work_to;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class w_l_1 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)){
                arr[0]=map.get(temp);
                arr[1]=i;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}
