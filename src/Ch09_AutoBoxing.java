public class Ch09_AutoBoxing {
    public static void main(String[] args) {
        int i = 10;

        // Integer integer = Integer.valueOf(i);
        Integer integer = (Integer) i;

        // Object obj = (Object)Integer.valueOf(i);
        Object obj = (Object) i;

        int i2 = integer + i;
        Integer integer2 = integer + integer;

        System.out.println("i2 = " + i2);
        System.out.println("integer2 = " + integer2);
    }
}
