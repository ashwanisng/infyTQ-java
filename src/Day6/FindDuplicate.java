package Day6;

import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {12,54,68,759,24,15,12,68,987,758,25,69};

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=0; i< nums.length; i++) {
            for (int j=i+1; j< nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans.add(nums[i]);
                }
            }
        }

        for (int i : ans) {
            System.out.print(i +" ");
        }
    }
}
