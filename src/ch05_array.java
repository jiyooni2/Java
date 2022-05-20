import java.util.Arrays;

public class ch05_array {
    public static void main(String[] args) {
        // 배열을 다루기 위한 참조변수를 위한 공간이 만들어진 것
        int[] score;
        int score2[];

        // 배열 생성
        score = new int[5];

        // 초기화와 동시에 생성
        int[] arr = { 50, 60, 70, 80, 90 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // char 배열만 예외적으로 이어서 출력 됨
        char[] chArr = { 'a', 'b', 'c', 'd' };
        System.out.println(chArr);

        int[] iArr = { 10, 20, 30, 40, 50 };
        System.out.println(Arrays.toString(iArr));

        String[] name = { "Kim", "Park", "Yi" };
        System.out.println(Arrays.toString(name));

        int[][] scoreTwoDimension = new int[4][3];
        int scoreTwoDimension2[][];

        // array[0], array[1] 모두 참조변수일 뿐
        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

    }
}
