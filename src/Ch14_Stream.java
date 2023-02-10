import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ch14_Stream {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(4, 3, 2, 1, 5, 6, 6));

        list.stream().distinct().forEach((elem) -> {
            System.out.print(elem + " ");
        });
        System.out.println();

        list.stream().filter(a -> a != 4).forEach((elem) -> {
            System.out.print(elem + " ");
        });
        System.out.println();

        list.stream().limit(3).forEach((elem) -> {
            System.out.print(elem + " ");
        });
        System.out.println();

        list.stream().peek((elem) -> {
            System.out.print(elem + " ");
        }).forEach((elem) -> {
            // System.out.print(elem + " ");
        });
        System.out.println();

        list.stream().sorted().forEach((elem) -> {
            System.out.print(elem + " ");
        });
        System.out.println();

        list.stream().map((a) -> a + 1).forEach((elem) -> {
            System.out.print(elem + " ");
        });
        System.out.println();

        Stream<String[]> arrStream = Stream.of(new String[] { "abc", "def", "jkl" },
                new String[] { "ABC", "GHI", "JKL" });

        arrStream.flatMap(Arrays::stream).forEach(System.out::println);

        List<Student> students = new ArrayList<Student>(Arrays.asList(new Student("김", 3, 300),
                new Student("김", 2, 300),
                new Student("박", 2, 300),
                new Student("이", 1, 800),
                new Student("사", 4, 1000),
                new Student("서", 5, 1000),
                new Student("주", 6, 800),
                new Student("봉", 1, 500),
                new Student("굼", 2, 500),
                new Student("감", 2, 500)));

        students.stream().sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Student::getTotalScore).thenComparing(Student::getName)).forEach(System.out::println);

    }
}

class Student {
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

}