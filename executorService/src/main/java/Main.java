import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(8);
        integers.add(2);
        integers.add(18);
        integers.add(11);
        integers.add(1);
        final Integer reduce = integers.stream()
                .reduce(1, Integer::sum);
        System.out.println(reduce);


        System.out.println("commit 1");
        System.out.println("commit 2:");
        System.out.println("commit 3:");

        System.out.println("2");
    }
}