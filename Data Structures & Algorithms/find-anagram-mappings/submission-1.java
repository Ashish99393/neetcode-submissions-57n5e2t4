class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] map=new int[nums1.length];

        Map<Integer,Integer> nap=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            nap.put(nums2[i],i);
        }

        for(int i=0;i<nums2.length;i++){
           map[i]=nap.get(nums1[i]);
        }

        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j])
        //         {
        //             map[i]=j;
        //         }
        //     }
        // }
        return map;
    }
}
