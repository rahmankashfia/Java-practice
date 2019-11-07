import java.util.*;

class TwoSumHashMap {
    public static void main(String[] args) {
        int[] res = new int[2];
        HashMap<Integer, ArrayList<Integer>> lookup = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            if (lookup.containsKey(nums[i])) {
                ArrayList<Integer> temp = lookup.get(nums[i]);
                temp.add(i);
            }
            else {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(i);
                lookup.put(nums[i],temp);
            }     
        }
        for( int i = 0; i < nums.length; i++) {
            if (lookup.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = lookup.get(nums[i]).get(0);
                break;
               
            }
        }
        return res;
    }
}