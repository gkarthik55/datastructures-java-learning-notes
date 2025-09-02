package com.learning.leetcode05.topkelements.pattern;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueExample
{
    public static void main(String[] args)
    {
        // 1. Min-Heap (Default behavior): Elements ordered by natural ordering (ascending for numbers)
        System.out.println("--- Min-Heap Priority Queue ---");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(50);
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(40);

        System.out.println("Elements added: " + minHeap); // Order in output might not be sorted as it's internal representation

        System.out.println("Head of the queue (peek): " + minHeap.peek()); // Retrieves but doesn't remove
        System.out.println("Removed element (poll): " + minHeap.poll()); // Retrieves and removes the smallest
        System.out.println("Queue after poll: " + minHeap);

        System.out.println("Iterating through remaining elements (poll):");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll()); // Will print in ascending order
        }

        // 2. Max-Heap (Custom Comparator): Elements ordered in descending order
        System.out.println("\n--- Max-Heap Priority Queue ---");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.add(50);
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(40);

        System.out.println("Elements added: " + maxHeap);

        System.out.println("Head of the queue (peek): " + maxHeap.peek()); // Retrieves but doesn't remove
        System.out.println("Removed element (poll): " + maxHeap.poll()); // Retrieves and removes the largest
        System.out.println("Queue after poll: " + maxHeap);

        System.out.println("Iterating through remaining elements (poll):");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll()); // Will print in descending order
        }
    }
}