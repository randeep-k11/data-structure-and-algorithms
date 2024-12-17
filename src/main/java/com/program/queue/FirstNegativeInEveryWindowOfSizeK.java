package com.program.queue;

/*
Given an array arr[]  and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.

Note: If a window does not contain a negative integer, then return 0 for that window.

Examples:

Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
Output: [-8, 0, -6, -6]
Explanation:
Window {-8, 2}: First negative integer is -8.
Window {2, 3}: No negative integers, output is 0.
Window {3, -6}: First negative integer is -6.
Window {-6, 10}: First negative integer is -6.
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class FirstNegativeInEveryWindowOfSizeK {

    public static void main(String[] args) {
        long[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        FirstNegativeInEveryWindowOfSizeK obj = new FirstNegativeInEveryWindowOfSizeK();
        long[] res = obj.printFirstNegativeInteger(arr, arr.length, k);
        for (long l : res) {
            System.out.print(l + " ");
        }
    }

    public long[] printFirstNegativeInteger(long A[], int N, int K) {

        long[] res = new long[N - K + 1];

        Queue<Integer> queue = new PriorityQueue<>();
        int i = 0;
        for (i = 0; i < K; i++) {
            if (A[i] < 0)
                queue.add(i);
        }

        int j = 0;
        int m = 0;

        while (i < N) {
            if (queue.size() > 0) {
                res[j++] = A[queue.peek()];
            } else {
                res[j++] = 0;
            }
            while (queue.size() > 0 && queue.peek() < (i - K + 1))
                queue.poll();

            if (A[i] < 0)
                queue.add(i);
            i++;
        }

        if (queue.size() > 0) {
            res[j++] = A[queue.peek()];
        } else {
            res[j++] = 0;
        }
        return res;

        //Iterative Approach
        // long[] res = new long[N-K+1];

        // int m=0;
        //  for(int i=0; i<N-K+1; i++){
        //      boolean found = false;
        //      for(int j=i;j<i+K;j++){

        //          if(A[j]<0)
        //          {
        //              res[m++] =A[j];
        //              found = true;
        //              break;
        //          }
        //      }

        //      if(!found)
        //      m++;
        //  }

        //  return res;
    }
}
