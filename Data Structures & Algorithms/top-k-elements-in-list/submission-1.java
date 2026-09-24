class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            queue.add(entry);

            if(queue.size() > k){
                queue.poll();
            }
        }

        int[] ans = new int[k];
        int i=0;

        while(!queue.isEmpty()){
            int val = queue.peek().getKey();
            ans[i++] = val;
            queue.poll();
        }
        return ans;
    }
}
