import java.util.*;

class TwoSum {
    public static void main(String args[]) {
        int[] nums = {2, 4, 6, 5, 3};
        int target = 8;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++ ) {
                System.out.println(count+". "+nums[i]+" + "+nums[j]+" = "+(nums[i]+nums[j]));
                count++;
            } 
        }  

        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        System.out.println(al); 
        hm.put(0,al);
        al.add(3);
        hm.put(1,al);
        System.out.println(hm);
        ArrayList<Integer> temp = hm.get(1);
        temp.add(4);
        System.out.println(hm);
        ArrayList<Integer> temp = hm.get(1);
    }
}