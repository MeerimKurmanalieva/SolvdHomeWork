package lambdaEnum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaExample {

    public static void main(String[] args) {

        // Example of using built-in Lambda functions
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.forEach((Integer n) -> { System.out.println(n); }); // Consumer

        Function<Integer, String> intToString = (Integer n) -> { return String.valueOf(n); }; // Function
        System.out.println(intToString.apply(123));

        Predicate<String> stringNotEmpty = (String s) -> { return !s.isEmpty(); }; // Predicate
        System.out.println(stringNotEmpty.test(""));
        System.out.println(stringNotEmpty.test("hello"));

        Supplier<Double> random = () -> { return Math.random(); }; // Supplier
        System.out.println(random.get());

        BinaryOperator<Integer> add = (Integer a, Integer b) -> { return a + b; }; // BinaryOperator
        System.out.println(add.apply(2, 3));


        // Example of using custom Lambda functions with generics
        Function<String, Integer> strLength = (String s) -> { return s.length(); }; // Function
        System.out.println(strLength.apply("hello world"));

        BiFunction<Integer, Integer, Integer> addInts = (Integer a, Integer b) -> { return a + b; }; // BiFunction
        System.out.println(addInts.apply(2, 3));

        Consumer<List<Integer>> printList = (List<Integer> list) -> {
            for (Integer n : list) {
                System.out.println(n);
            }
        }; // Consumer
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        printList.accept(numbers);


        // Example of using complex Enums
        for (Size size : Size.values()) {
            System.out.println(size.getDescription() + ": " + size.getMeasurement());
        }

        System.out.println(Color.RED.getRGB());
        System.out.println(Color.GREEN.getRGB());
        System.out.println(Color.BLUE.getRGB());

        System.out.println(Direction.NORTH.rotateLeft().rotateLeft().rotateLeft());

        System.out.println(PaymentMethod.CREDIT_CARD.getDiscount(100));
        System.out.println(PaymentMethod.CASH.getDiscount(100));
    }

    // Example of a custom Lambda function with generics
    interface Function2<T, R> {
        R apply(T t1, T t2);
    }

    // Example of another custom Lambda function with generics
    interface Predicate2<T> {
        boolean test(T t1, T t2);
    }

    // Example of yet another custom Lambda function with generics
    interface Supplier2<T> {
        T get(T t);
    }

    enum Size {
        SMALL("S", 36), MEDIUM("M", 38), LARGE("L", 40), X_LARGE("XL", 42);

        private final String description;
        private final int measurement;

        private Size(String description, int measurement) {
            this.description = description;
            this.measurement = measurement;
        }

        public String getDescription() {
            return this.description;
        }

        public int getMeasurement() {
            return this.measurement;
        }
    }

    public enum Color {
        RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);

        private final int rgb;

        private Color(int rgb) {
            this.rgb = rgb;
        }

        public int getRGB() {
            return rgb;
        }
    }

    enum Direction {
        NORTH, EAST, SOUTH, WEST;

        public Direction rotateLeft() {
            int index = this.ordinal();
            int size = Direction.values().length;
            return Direction.values()[(index + size - 1) % size];
        }

        public Direction rotateRight() {
            int index = this.ordinal();
            int size = Direction.values().length;
            return Direction.values()[(index + 1) % size];
        }
    }

    enum PaymentMethod {
        CREDIT_CARD(0.05), CASH(0.1), PAYPAL(0.03);

        private final double discountPercentage;

        private PaymentMethod(double discountPercentage) {
            this.discountPercentage = discountPercentage;
        }

        public double getDiscount(double amount) {
            return amount * discountPercentage;
        }
    }
}