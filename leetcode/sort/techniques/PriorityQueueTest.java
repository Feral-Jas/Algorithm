package leetcode.sort.techniques;

import java.util.PriorityQueue;

/**
 * 优先队列保证每次取出的元素都是队列中最大的值 往小顶堆中插入一个元素的策略就是
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 9, 10, 12, 7, 35, 24, 16 };
        kthElement(arr, 6);
    }

    public static void kthElement(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(priorityQueue.toArray()[i] + " ");
        }
        System.out.println();
        System.out.println(k + "th element = " + priorityQueue.toArray()[k - 1]);
    }

    public static void kthElementPartition(int[] arr, int k) {

    }
}