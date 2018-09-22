class Solution {
    //sort O(nlogn)
    // public int findKthLargest(int[] nums, int k){
    //     Arrays.sort(nums);
    //     return nums[nums.length-k];
    // }
    
    //PRIORITY QUEUE O(nlogk)
    // public int findKthLargest(int[] nums, int k) {
    //     PriorityQueue<Integer> pq = new PriorityQueue<>();
    //     for(int num : nums){
    //         pq.offer(num);
    //         if(pq.size() > k){
    //             pq.poll();
    //         }
    //     }
    //     return pq.poll();
    // }
    
    
    //PARTITION-QuickSort like Best:O(n) Worst:O(n^2) Average: O(nlogn)
    public int findKthLargest(int[] nums, int k){
        int left = 0, right = nums.length-1;

        while(left <= right){
            int p = partition(nums, left, right);
            if(p-left < k-1){
                k = k -(p-left+1);
                left = p+1 ;
            }else if(p-left > k-1){
                right = p-1;
            }else{
                return nums[p];
            }
        }
        return -1;
    }
    
    private int partition(int[] nums, int left, int right){
        //pivot is nums[index]
        int li = left, ri = right-1;
        while(li <= ri){
            if(nums[li] >= nums[right]){
                li++;
                continue;
            }
            if(nums[ri] < nums[right]){
                ri--;
                continue;
            }
            swap(nums, li, ri);
        }
        swap(nums, li, right);
        return li;
    }
    
    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}