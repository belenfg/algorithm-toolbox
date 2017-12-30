package com.math.search;

import com.math.PositiveInteger;
import java.util.Arrays;

public class IntegerArrayStub{

    public static int[] createMonotoneIncreasingArray(int start, int end, PositiveInteger step) {
        int[] resultArray = new int[(end - start) / step.getValue() + 1];

        for (int i = 0; i < resultArray.length; i++)
            resultArray[i] = i * step.getValue() + start;

        return resultArray;
    }

    public static int[] createMonotoneDecreasingArray(int start, int end, PositiveInteger step) {
        int[] resultArray = new int[(start - end) / step.getValue() + 1];

        for (int i = 0; i < resultArray.length; i++)
            resultArray[i] = start - i * step.getValue();

        return resultArray;
    }

    public static int[] createEqualElementsArray(int integer, PositiveInteger length) {
        int[] monotoneArray = new int[length.getValue()];

        Arrays.fill(monotoneArray, integer);

        return monotoneArray;
    }


}