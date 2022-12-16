import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {6,3,9,13,0,3,6,7,4,8};

        Integer max = Arrays.stream(integers)
                .filter(integer -> integer % 2 == 0)
                .map(integer -> (int)Math.pow(integer,2))
                .max(Comparator.naturalOrder()).get();

        System.out.println(max);
    }
}