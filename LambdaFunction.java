import java.util.ArrayList;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList < Integer > numbers = new ArrayList < Integer > ();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.forEach((n) - > {
            System.out.println(n * 2);
        });
    }
}
