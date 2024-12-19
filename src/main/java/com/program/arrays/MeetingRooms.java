package com.program.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/*
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.

Example 1:

Input: [[0,30],[5,10],[15,20]]
Output: false
Example 2:

Input: [[7,10],[2,4]]
Output: true
 */
public class MeetingRooms {
    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(canAttendMeetings(intervals));
    }

    static boolean canAttendMeetings(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));
        LinkedList<int[]> merged = new LinkedList<>();

        for(int[] interval : intervals){
            if(merged.isEmpty() || merged.getLast()[1] < interval[1])
            {
                merged.add(interval);
            } else {
                return false;
            }
        }

        return true;

    }
}
