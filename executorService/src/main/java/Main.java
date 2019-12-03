import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(8);
        integers.add(2);
        integers.add(18);
        integers.add(11);
        integers.add(1);
        final Optional<Double> first = integers.stream()
                .map(Math::sin)
                .findFirst();
        System.out.println(first.orElseThrow());
    }
}