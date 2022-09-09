package com.company;

public class Main {

    public static void main(String[] args) {
	    double[] numbers = {7, 3.6, -1.9, 11, 2};

        double smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            double n = numbers[i];
            if (numbers[i] < smallest)
                smallest = numbers[i];
        }
        System.out.println(smallest);

        System.out.println();

        System.out.println("HW 1");

        int[] array = {2, 5, -3, 11, 193, -2};
        int sum = 0;
        for (int k : array)
            System.out.print(k + " ");

        System.out.println();

        for (int l = 0; l < array.length; l++)
            sum += array[l];
        System.out.println("the sum of the values is: " + sum);

        System.out.println();
        System.out.println("Lesson example 2");

        int[] nums = {6, -2, 5, 7, 36};
        int[] diffs = new int [nums.length - 1];

        for (int i = 1; i < nums.length; i = i + 1)
        {
            diffs[i - 1] = nums[i] - nums[i - 1];
            System.out.print(diffs [i - 1] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Lesson example 3");

        int[] arr = {4, 1, -2, -5, -8};
        boolean arithmetic = true;

        for (int i = 2; i < arr.length && arithmetic; i = i + 1)
            if(arr [i - 1] - arr [i - 2] != arr [i] - arr [i - 1])
                arithmetic = false;

        System.out.println(arithmetic);

        System.out.println();
        System.out.println("HW 4");

        int[] original = {5, 4, -7, -2, -1};
        int[] reversed = new int [original.length];

        for (int x = 0; x < original.length; x = x + 1)
        {
            reversed[x] = original[original.length - 1 - x];
            System.out.print(reversed [x] + " ");
        }
        System.out.println();
        System.out.println("HW 5");

        int [] og = {-3, 2, 6, -11};
        int [] cumulativesum = new int [og.length];
        int summa = 0;

        for (int i = 0; i < cumulativesum.length; i++)
        {
            cumulativesum[i] += og[i] + summa;
            System.out.println(cumulativesum[i]);
        }

        System.out.println();
        System.out.println("HW 6");

        int[] arrai = {4, -3, -5, 9, 1, 11};
        int[] smaller = new int [arrai.length];
        int[] larger = new int [arrai.length];
        int m = 1;

        boolean isSmaller = true;

        for (int bb : arrai)
            System.out.println(bb);

        for (int t = 0; t < arrai.length; t = t + 1)
        {
            if (arrai[t] > m)
            {
                isSmaller = false;
                larger[t] = arrai[t];
            }
            else
            {
                isSmaller = true;
                smaller[t] = arrai[t];
            }
        }
        for (int ab : larger)
            System.out.print("larger: " + ab + " ");
        System.out.println();
        for (int abc : smaller)
            System.out.print(abc + " ");

        System.out.println();
        System.out.println("HW 3");

        int[] values = {-3, 2, 5, 4, 7};
        boolean result = true;

        for (int n = 1; n < 5; n = n + 1)
        {
            if (result = true && n < 5)
            {
                if (values[n] < values[n - 1])
                {
                    result = false;
                    n++;
                }
                else
                    n++;
            }
            else {
                System.out.println(values[n]);
            }
        }
    }
}
