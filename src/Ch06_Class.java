import java.util.Optional;

class Ch06_Class {
    public static void main(String[] args) {
        // Tv 클래스 타입의 참조변수 t 선언
        Tv t;
        // 연산자 new에 의해 Tv클래스의 인스턴스가 메모리의 빈 공간에 생성
        // 생성된 객체의 주소값이 참조변수 t에 저장
        // 참조변수와 인스턴스의 타입이 일치해야 함
        t = new Tv("blue", true, 10);
        System.out.println(t.channel + t.color + t.power);
        t.channelDown();
        System.out.println("channel : " + t.channel);

        // 객체를 저장한 배열이 아닌, 참조변수를 저장한 배열

        Tv[] tvArr = new Tv[3];
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
        }
        // Tv[] tvArr={new Tv(), new Tv(), new Tv()}

        System.out.println("width : " + Tv.width + " height : " + Tv.height);

        // L을 넣더라도, 메소드에서 지역변수를 복사할 때 double형으로 자동 형변환
        double value = t.add(4L, 2L);
        System.out.println(value);

    }
}

class Tv {
    String color;
    boolean power;
    int channel;
    static int width = 250;
    static int height = 100;

    Tv() {
    }

    Tv(String color) {
        this(color, true, 4);
    }

    Tv(String color, boolean power, int channel) {
        this.color = color;
        this.power = power;
        this.channel = channel;
    }

    // optional

    void power(Optional<Integer> a) {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }

    double add(double a, double b) {
        return a + b;
    }
}