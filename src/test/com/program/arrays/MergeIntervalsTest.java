package com.program.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeIntervalsTest {

    @Test
    void testMergeIntervals() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
        int[][] expected1 = {{1,6},{8,10},{15,18}};
        assertArrayEquals(expected1, mergeIntervals.merge(intervals1));

        int[][] intervals2 = {{1,4},{4,5}};
        int[][] expected2 = {{1,5}};
        assertArrayEquals(expected2, mergeIntervals.merge(intervals2));

        int[][] intervals3 = {{1,4},{0,4}};
        int[][] expected3 = {{0,4}};
        assertArrayEquals(expected3, mergeIntervals.merge(intervals3));

        int[][] intervals4 = {{1,4},{2,3}};
        int[][] expected4 = {{1,4}};
        assertArrayEquals(expected4, mergeIntervals.merge(intervals4));
    }
}
