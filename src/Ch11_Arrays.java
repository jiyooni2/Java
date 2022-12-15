import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        ArrayList<ArrayList<Integer>> tmp = new ArrayList<>(new ArrayList<>());

        Integer[] temp = { 1, 2, 3, 4 };
        System.out.println(new ArrayList(Arrays.asList(1, 2, 3, 4)));
        tmp.add(new ArrayList(Arrays.asList(temp)));
        System.out.println(tmp.toString());

        Integer[] temp2 = { 1, 2, 3, 4 };

        List<List<Integer>> result = listPermutations(new ArrayList<Integer>(Arrays.asList(temp2)));
        System.out.println(result);
    }

    public static List<List<Integer>> listPermutations(List<Integer> list) {

        if (list.size() == 0) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            result.add(new ArrayList<Integer>());
            return result;
        }

        List<List<Integer>> returnMe = new ArrayList<List<Integer>>();

        Integer firstElement = list.remove(0);

        List<List<Integer>> recursiveReturn = listPermutations(list);
        for (List<Integer> li : recursiveReturn) {

            for (int index = 0; index <= li.size(); index++) {
                List<Integer> temp = new ArrayList<Integer>(li);
                temp.add(index, firstElement);
                returnMe.add(temp);
            }

        }
        return returnMe;
    }
}
