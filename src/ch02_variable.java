public class ch02_variable {
   public static void main(String[] args) {
      // without newline
      System.out.print(4);
      // with new line
      System.out.println(4);

      int x = 200, y = 15;
      System.out.println(x);
      System.out.println(x / y);

      float f2 = 1234;
      System.out.println(f2);
      long a = 200L;
      long b = 200;
      float f = 1.25F;
      double d = 2.5;

      char ch = 'a';
      String str2 = new String("java");

      String str = "Java";
      System.out.println(str);
      System.out.println(str2);

      int age = 20;
      System.out.printf("%d%n", age);

      String temp = "3";

      // string to char
      System.out.println(temp.charAt(0));
      // int to char
      System.out.println((char) (3 + '0'));
      // char to int
      System.out.println('3' - '0');
      // number to string
      System.out.println(3 + "");
      // string to number
      System.out.println(Integer.parseInt("4"));
      System.out.println(Double.parseDouble("3.14"));
      // char to string
      System.out.println('3' + "");
   }
}
