package DZ_3;

import java.util.Arrays;
// Реализовать алгоритм сортировки слиянием

public class dz_1 {
    public static void main(String[] args) {
        int[] array = { 3, 1, -2, 4, -8, 10, 2, 6, -5, -4, -6, 5, 7, 8, 9, -9, -10, -7, -3, 0 };
        int[] result = merge(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] merge(int[] array1) {
        int[] a = Arrays.copyOf(array1, array1.length);
        int[] b = new int[array1.length];
        int[] result = mergesort(a, b, 0, array1.length);
        return result;
    }

    public static int[] mergesort(int[] a, int[] b,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return a;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesort(a, b, startIndex, middle);
        int[] sorted2 = mergesort(a, b, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == a ? b : a;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
