public class Ch07_Inheritance {
    public static void main(String[] args) {
        Tv tv = new Tv(false, 5);
        SmartTv smartTv = new SmartTv();
    }
}

// 상속 관계
class Tv {
    boolean power;
    int channel;

    Tv(boolean power, int channel) {
        this.power = power;
        this.channel = channel;
    }

    void power() {
        power = !power;
    }
}

class SmartTv extends Tv {
    boolean isSmart;
    boolean isConnected;

    // You can define any arguments you need for your constructor, but it is
    // necessary to call one constructor of the super class as the first line of
    // your own constructor.

    SmartTv() {
        super(false, 4);// should be called, if not super() called, if super() does not exist, error
        this.isSmart = true;
    }

    // overriding
    void power() {
        power = !power;
        isConnected = power;
    }
}

// 포함 관계
class Circle {
    // int x,y,r;
    Point c = new Point();
    int r;
}

class Point {
    int x;
    int y;
}