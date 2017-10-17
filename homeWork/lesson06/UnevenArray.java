package homeWork.lesson06;

import java.util.Arrays;

public class UnevenArray {
    public static void main(String[] args) {
        //программа с методом, который принимает значение размера массива, а возвращает массив из нечетных чисел.
        int n = 5;
        System.out.println(Arrays.toString(doUnevenArray(n)));
    }
    static int[] doUnevenArray (int a) {
        int [] nums = new int [a];
        for (int i=0;i<5;i++){
            nums[i]=i*2+1;
        }
        return nums;
    }
}
