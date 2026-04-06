public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(map.entrySet());
    sorted.sort((a, b) -> b.getValue() - a.getValue());

    int[] arr = new int[k];
    for (int i = 0; i < k; i++) {
        arr[i] = sorted.get(i).getKey();
    }
    return arr;
    }
}