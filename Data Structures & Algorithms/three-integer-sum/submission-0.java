class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            Map<Integer, Integer> cache = new HashMap<>();
            for(int j=i+1; j<nums.length; j++) {
                int rem = 0-(nums[i]+nums[j]);
                if(cache.containsKey(rem)) {
                    int k = cache.get(rem);
                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                    Collections.sort(list);
                    set.add(list);
                }
                cache.put(nums[j], j);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> ele: set) {
            ans.add(ele);
        }

        return ans;
    }
}
