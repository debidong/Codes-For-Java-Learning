package sol01;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ret = new int[2];
        ret[0] = ret[1] = -1;
        int len = nums.length;

        if (target % 2 == 0) {
            target = target / 2;

            int temp = 0;
            for(int i = 0; i < len; i ++) {
                if (nums[i] == target) {
                    ret[temp] = i;
                    temp ++;
                }
            }

            if (temp == 2) {
                return ret;
            }

            HashMap map = new HashMap();
            for(int i = 0; i < len; i ++) {
                map.put(nums[i], i);
            }

            int mid =  target;
            int left = mid - 1, right = mid + 1;
            while(true) {
                if(map.get(left) != null && map.get(right) != null) {
                    ret[0] = (int)map.get(left);
                    ret[1] = (int)map.get(right);
                    return ret;
                }
                left --; right ++;
            }

        } else {
            HashMap map = new HashMap();
            for(int i = 0; i < len; i ++) {
                map.put(nums[i], i);
            }

            int mid = (int)Math.floor(((double)target)/2);
            int left = mid, right = mid + 1;
            while(true) {
                if(map.get(left) != null && map.get(right) != null) {
                    ret[0] = (int)map.get(left);
                    ret[1] = (int)map.get(right);
                    return ret;
                }
                left --; right ++;
            }
        }



    }
}