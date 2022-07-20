public class Ch07_AbstractClass {
    public static void main(String[] args) {
        // 이들은 Unit type이기 때문에, 여기서 탱크의 changeMode 호출하는 것은 불가능함
        Unit[] group = { new Marine(), new Tank() };

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 100);
        }

        Tank tank = new Tank();
        tank.changeMode();

    }
}

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("stop here");
    }
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine move");
    }

    void stimPack() {
        System.out.println("stimpack");
    }
}

class Tank extends Unit {
    boolean isMode;

    void move(int x, int y) {
        System.out.println("Tank move");
    }

    void changeMode() {
        isMode = !isMode;
        System.out.println("현재 모드는 " + isMode);
    }
}