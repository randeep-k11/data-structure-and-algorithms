package com.program.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Given an array a of integers of length n, find the nearest smaller number for every element such that the smaller element is on left side.If no small element present on the left print -1.

Example 1:

Input: n = 3
a = {1, 6, 2}
Output: -1 1 1
Explaination: There is no number at the
left of 1. Smaller number than 6 and 2 is 1.
 */
public class SmallerOnLeft {
    static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && stack.peek()>=a[i]){
                stack.pop();
            }
            result.add(stack.isEmpty() ? -1 :stack.peek());
            stack.push(a[i]);
        }
        return result;
    }
    public static void main(String[] args) {
     int[] arr = {1, 6, 2};
        List<Integer> res = leftSmaller(arr.length, arr);
        for (int l : res) {
            System.out.print(l + " ");
        }
    }
}
