import java.util.HashSet;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(st.contains(nums[i]))
                return true;
            else
                st.add(nums[i]);
        }
        return false;
        }
        public static void main(String args[]){
            int nums[]={1,2,3,1};
            System.out.println(containsDuplicate(nums));
        }
    
}