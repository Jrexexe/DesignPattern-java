package cn.jrexe.learn.base;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,2};
        int[] arr2 = Arrays.copyOf(arr1,arr1.length);
        System.out.println("arr1[1]:"+arr1[1]);
        System.out.println("arr2[1]:"+arr2[1]);
        System.out.println("修改arr1 的值 = 3");
        arr1[1] = 3;
        System.out.println("arr1[1]:"+arr1[1]);
        System.out.println("arr2[1]:"+arr2[1]);
        Arrays.sort(arr1);

    }
}
