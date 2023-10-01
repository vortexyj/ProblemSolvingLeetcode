class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int num : nums) {
            if (hashMap.get(num) == null) {
                hashMap.put(num, 1);
            }else {
                hashMap.put(num, hashMap.get(num).intValue() + 1);
            }
        }
        // get the value's key
        // int maxVal = hashMap.values().stream().max(Integer::compareTo).get();

        int maxKey = 0;
        int maxValue = 0;
        for(int i : hashMap.keySet())
        {
            if(hashMap.get(i) > maxValue)
            {
                maxKey = i;
                maxValue = hashMap.get(i);
            }
        }
        return maxKey;
    }
}