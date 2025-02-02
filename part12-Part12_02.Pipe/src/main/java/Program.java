
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Pipe<Integer> numberPipe = new Pipe<>();
        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        while (numberPipe.isInPipe()) {
            sum = sum + numberPipe.takeFromPipe();
        }
        System.out.println(sum);
        System.out.println(numberPipe.takeFromPipe());

        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        int number = Integer.valueOf(strings.get(0));

    }
}
