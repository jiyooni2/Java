import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ch11_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(10);

        list1.add(5);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(1);
        list1.add(6);

        ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));

        // 오름차순
        Collections.sort(list1);
        // 내림차순
        Collections.sort(list2, Collections.reverseOrder());

        // 오름차순
        list1.sort(Comparator.naturalOrder());
        // 내림차순
        list2.sort(Comparator.reverseOrder());
        System.out.println(list1);
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(12, 2, 9, 4));

        list3.sort(new CustomComparator());
        System.out.println(list3);
        list3.sort(new CustomComparator().reversed());
        System.out.println(list3);

        System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));

        list1.add(4, 88);

        list1.set(3, 99);
        System.out.println(list1);

        // 겹치는 부분 남기기
        System.out.println("list1.retainsAll(list2): " + list1.retainAll(list2));
        System.out.println(list1);
        System.out.println(list2);

        Iterator it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}

class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer n1, Integer n2) {
        return n1 - n2;
    }
}