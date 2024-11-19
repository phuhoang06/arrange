import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));
        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Di chuyển các phần tử của array[0..i-1], lớn hơn key, đến vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
                System.out.println("Bước " + i + ": " + Arrays.toString(array));
            }
            array[j + 1] = key;
            System.out.println("Bước " + i + ": " + Arrays.toString(array));
        }
        System.out.println("Mảng đã sắp xếp: " + Arrays.toString(array));
    }
}
