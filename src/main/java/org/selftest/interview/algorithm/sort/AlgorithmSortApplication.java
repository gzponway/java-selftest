package org.selftest.interview.algorithm.sort;

import com.rabbitmq.tools.json.JSONUtil;

public class AlgorithmSortApplication {

    public static void main(String[] args) {
//        int []array1 = {34,12,56,78,33,65};
//        System.out.println("========="+biSearch(array1,56));
//
//        int []array2 = {34,12,56,78,33,65};
//        bubbleSort1(array2,6);
//        System.out.println("========="+ array2);

        int []array3 = {34,12,56,78,33,65};
        bubbleSort(array3);
        for (int i = 0; i < array3.length; i++) {
            System.out.println("========="+ array3[i]);
        }

    }

    /**
     * 二分查找
     * @param array
     * @param a
     * @return
     */
    public static int biSearch(int[] array, int a) {
        int lo = 0;
        int hi = array.length-1;
        int mid;
        while (lo < hi){
            mid = (lo+hi)/2;
            if(array[mid] == a){
                return mid+1;
            }else if(array[mid] < a){
                lo = mid+1;
            }else {
                hi = mid-1;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len - 1; i++) {
            for(int j = 0; j < len - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {        // 相邻元素两两对比
                    int temp = arr[j+1];        // 元素交换
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序
     * @param list
     * @param n
     */
    public static void bubbleSort1(int[] list, int n) {
        int i,j;
        for (i = 0; i < n; i++) {
            for (j = 1; j < n-i; j++) {
                if(list[j-1]>list[j]){
                    int temp;
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    /**
     * 插入排序
     * @param arr
     */
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            int index = i-1;
            while (index>=0 && insertVal<arr[index]){
                arr[index+1] = arr[index];
                index--;
            }
            arr[index+1]=insertVal;
        }

    }
}

