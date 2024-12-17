package com.program.stack;

import java.util.Stack;

/*
Given an array arr[ ] of integers, the task is to find the next greater element for each element of the array in order of their appearance in the array. Next greater element of an element in the array is the nearest element on the right which is greater than the current element.
If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.

Examples

Input: arr[] = [1, 3, 2, 4]
Output: [3, 4, 4, -1]
Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1.
 */
public class NextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here

        long[] result = new long[n];

        // Brute Force Approach

        // for(int i=0; i<n;i++){
        //     boolean flag = true;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]<arr[j] && flag){
        //             res[i]=arr[j];
        //             flag = false;
        //         }
        //     }

        //     if(flag)
        //      res[i]=-1L;
        // }

        Stack<Long> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;

    }

    public static void main(String[] args) {
        long[] arr = {1, 3, 2, 4};
        long[] res = nextLargerElement(arr, arr.length);
        for (long l : res) {
            System.out.print(l + " ");
        }
    }
}
