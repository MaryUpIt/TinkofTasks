package com.example.tinkof;

import org.junit.Assert;
import org.junit.Test;

public class TaskSevenTest {
    int []numbers;
    private void fillArray(int... numbers) {
        this.numbers = numbers;
    }
    @Test
    public void test1(){
        test(new int []{1,3,1},1,2);
        test(new int[]{1,2,3}, -1,-1);
        test(new int[]{2,5,4,4,3}, 4,1);
        test(new int[]{1,5,2,3,4}, -1,-1);
        test(new int[]{5,1,2,3,4}, -1,-1);
    }


    private void test (int[] numbers, int index, int number) {
        fillArray(numbers);
        Assert.assertArrayEquals(new int[]{index,number},TaskSeven.result(numbers));
    }

}