package lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Go1 {
    public static void main(String[] args) {
//        System.out.println("nihao");
        List<Integer> list = Arrays.asList(1, 2, 3);
//        ConsumerTest.test(list, i -> System.out.println(i * 100));
//        SupplierTest.test(()->list.get(0)*100);
//        FunctionTest.test(list, (i) -> "**" + (i * 111));
//        PredicateTest.test(list, (i) -> i <= 1);
    }
}

class ConsumerTest {
    public static void test(List<Integer> list, Consumer<Integer> handle) {
        for (Integer i : list) {
            handle.accept(i);
        }
    }
}

class SupplierTest {
    public static void test(Supplier<Integer> handle) {
        Integer i = handle.get();
        System.out.println(i);
    }

}

class FunctionTest {
    public static void test(List<Integer> list, Function<Integer, String> handle) {
        for (Integer i : list) {
            String str = handle.apply(i);
            System.out.println(str);
        }
    }
}

class PredicateTest {
    public static void test(List<Integer> list, Predicate<Integer> handle) {
        for (Integer i : list) {
            if (handle.test(i)) {
                System.out.println(i);
            }
        }
    }
}

