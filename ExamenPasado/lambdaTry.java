import java.util.function.IntConsumer;

public class lambdaTry {
    public static void main(String[] args) {
        IntConsumer ic = x -> System.out.println(x);
        ic.accept(3);
        IntConsumer ic2 = new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        };
        ic2.accept(3);
    }
}