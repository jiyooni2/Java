import java.util.HashMap;
import java.util.Scanner;

public class Ch11_HashMap {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("myId", "1234");
        hashMap.put("asdf", "1111");
        hashMap.put("asdf", "1234");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("plz input id and password");
            System.out.print("id : ");
            String id = scanner.nextLine().trim();

            System.out.print("password : ");
            String password = scanner.nextLine().trim();
            System.out.println();

            if (!hashMap.containsKey(id)) {
                System.out.println("not exist id");
                continue;
            }

            if (!hashMap.get(id).equals(password)) {
                System.out.println("wrong password");
            } else {
                System.out.println("success");
                break;
            }
        }
    }
}
