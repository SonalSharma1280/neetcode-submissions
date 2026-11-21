/*class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<=nums.length-1;i++){
            int temp= nums[i];
            if(map.containsKey()){
                //map.put(temp, map.get(temp)+1);
                return true;
            }else{
                map.put(temp,1);
            }
        }
        return false;
    }
}*/

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            seen.add(num);
        }

        return seen.size() != nums.length;
    }
}