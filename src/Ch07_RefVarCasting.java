public class Ch07_RefVarCasting {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;// car = (Car)fe;
        // car.water();
        car.drive();
        fe2 = (FireEngine) car;
        fe2.water();

        System.out.println(car instanceof FireEngine);
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive");
    }

    void stop() {
        System.out.println("stop");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water");
    }
}
