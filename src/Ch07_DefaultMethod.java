public class Ch07_DefaultMethod {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.method1();
        c.method2();//인터페이스의 default method를 그대로 상속하는 느낌
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

//만약 Child3가 Parent3를 상속하면, method2는 method2() in parent3가 호출됨
class Child3 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in child3");
    }
}

class Parent3 {
    public void method2() {
        System.out.println("method2() in parent3");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in in MyInterface");
    }

    default void method2() {
        System.out.println("method2() in MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}
