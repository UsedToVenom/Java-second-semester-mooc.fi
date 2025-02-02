
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Hideout<String> something = new Hideout();
        System.out.println(something.takeFromHideout());
        System.out.println(something.isInHideout());

        String dick = "penis";
        something.putIntoHideout(dick);

        System.out.println(something.isInHideout());
        System.out.println(something.takeFromHideout());

    }
}
