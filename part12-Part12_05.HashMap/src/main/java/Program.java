
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        MyMap map = new MyMap();
        Pair pair1 = new Pair(1, 2);
        map.add(pair1);
        map.add(new Pair(1,1));
        map.add(new Pair(2,2));
        map.add(new Pair(0,0));
        map.add(new Pair(3,3));
        map.remove(3);

    }

}
