// 703. Kth Largest Element in a Stream

import java.util.PriorityQueue;

class KthLargest {

    private final int k;
    private final PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else if (num > minHeap.peek()) {
                minHeap.offer(num);
                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }
        }
    }

    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (val > minHeap.peek()) {
            minHeap.offer(val);
            minHeap.poll();
        }
        return minHeap.peek();
    }
}