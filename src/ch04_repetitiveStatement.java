import java.util.Scanner;

public class ch04_repetitiveStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int menu = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();

            System.out.println("(1) 아메리카노");
            System.out.println("(2) 카페모카");
            System.out.println("(3) 카페라떼");
            System.out.print("원하는 메뉴(1~3)를 선택하세요(종료:0)>");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("종료");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택했습니다");
                continue;
            }

            System.out.println("선택한 메뉴는" + menu + "번 입니다.");
        }
    }
}