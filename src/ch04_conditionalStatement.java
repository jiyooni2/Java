import java.util.Scanner;

public class ch04_conditionalStatement {
    public static void main(String[] args) {
        int score = 80;

        if (score > 70) {
            System.out.println("over 70");
        } else {
            System.out.print("under 70");
        }

        System.out.print("숫자를 입력하세요 > ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.print(input);

        System.out.print("현재 월을 입력 >");
        Scanner scanner2 = new Scanner(System.in);
        int month = scanner2.nextInt();

        switch (month) {
            // 3,4,5 입력하면 break 없어서 계속 내려감
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                // 6,7,8 입력하면 여름 나오고 break
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            default:
                System.out.println("겨울");
        }
    }
}
