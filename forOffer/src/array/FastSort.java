package array;

public class FastSort {

    int partion(int[] array, int begin, int end) {
        int pos = array[begin];
        while (begin < end) {
            while (begin < end && pos <= array[end])
                end--;
            swap(array, begin, end);
            while (begin < end && pos >= array[begin])
                begin++;
            swap(array, begin, end);
        }
        return begin;
    }

    void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public void FastSort(int[] array, int begin, int end) {
        if (array == null || array.length == 0)
            return;
        if (begin < end) {
            int pos = partion(array, begin, end);
            FastSort(array, begin, pos - 1);
            FastSort(array, pos + 1, end);
        }
    }

    public static void main(String[] args) {
        int[]  A = {2, 3, 4, 9, 8, 7, 6, 1, 5, 0};
        FastSort fastSort = new FastSort();
        fastSort.FastSort(A, 0, 9);
        int a = 0;
    }
}
