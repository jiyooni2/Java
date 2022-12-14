public class test {
    public static void main(String[] args) {

        String str = "AAa";

        A a = new A();

        A b = new A();

        System.out.println(a.equals(b));

        System.out.println(str.length());
    }
}

class A {
    int num = 4;
    int num2 = 4;
}