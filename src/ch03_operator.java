
public class ch03_operator {
    public static void main(String[] args) {

        // 2, int와 int의 연산
        System.out.println(5 / 2);
        // 2.5 float과 int의 연산이므로 float과 float의 연산으로 자동 변환
        System.out.println(5 / (float) 2);

        byte a = 10;
        byte b = 20;
        // byte의 최대범위는 -128~127, overflow로 -56출력
        // a*b의 연산은 byte형 200인데, int로 자동 형변환
        // int를 byte에 넣지 못하니, byte형으로 변환시킨 뒤 넣어야 함
        byte c = (byte) (a * b);
        System.out.println(c);

        System.out.println(Math.round(4.5));

        String str = "AAA";
        String str2 = "BBB";
        boolean isEqual = str.equals(str2);
        System.out.println(isEqual);
        System.out.println("AAA".equals("AAA"));
        // 대소문자 구분 X
        System.out.println("AAA".equalsIgnoreCase("aaa"));

        // 0 => 0.0, 0과 0.5의 타입을 맞춘 뒤 연산 진행됨
        double result = true ? 0 : 0.5;

        System.out.println(result);

    }
}