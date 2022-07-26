public class Ch07_InnerClass {
    private int outerIv = 0;
    static int outerCv = 0;

    // 익명 클래스
    Object iv = new Object() {
        void method1() {
        }
    };

    // 익명 스태틱 메소드
    static Object cv = new Object() {
        void method() {
        };
    };

    class InstanceInner {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner {
        // 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없음
        // int siv = outerIv;
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;// 만약 lv를 바꾸려 한다면 컴파일 에러 발생
        final int LV = 0;// JDK 1.8부터 final 생략 가능

        // 지역 내부 클래스에서 final이 붙지 않은 지역변수를 접근하면 에러
        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            // final을 생략하더라도, 자동으로 final이 붙여지기 때문에 접근 가능
            int liv3 = lv;
            int liv4 = LV;
        }
    }
}
