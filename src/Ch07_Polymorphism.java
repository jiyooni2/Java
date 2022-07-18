public class Ch07_Polymorphism {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv1());
        b.buy(new Computer());

        System.out.println("현재 남은 돈 : " + b.money);
        System.out.println("현재 보너스 점수 : " + b.bonusPoint);

    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (bonusPoint / 10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100);
    }

    // 객체를 print하면 toString() 함수를 불러온 뒤 출력
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    // 다형성을 이용하면, 모든 물건들에 대해서 각각 따로 buy 메소드를 만들지 않아도 된다.
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "를 구입했습니다");
    }
}
