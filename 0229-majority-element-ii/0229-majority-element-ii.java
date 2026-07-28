class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        for (int key : hm.keySet()) {
            if (hm.get(key) > n / 3) {
                list.add(key);
            }
        }
        
        return list;
    }
}