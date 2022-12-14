import java.util.Arrays;

public class Ch11_Arrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[][] arr2D = { { 11, 12, 13 }, { 21, 22, 23 } };

        System.out.println("arr= " + Arrays.toString(arr));
        System.out.println("arr2D = " + Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, arr.length);

        int[] arr3 = new int[5];
        Arrays.fill(arr3, 99);
        System.out.println(Arrays.toString(arr3));

        Arrays.setAll(arr3, (i) -> {
            return i;
        });
        System.out.println(Arrays.toString(arr3));

        for (int i : arr3) {
            System.out.println(i);
        }
    }
}
