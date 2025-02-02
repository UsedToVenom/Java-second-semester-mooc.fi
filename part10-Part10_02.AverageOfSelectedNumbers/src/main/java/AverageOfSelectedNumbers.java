
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String in = scanner.nextLine();
            if (in.toLowerCase().equals("end")) {
                break;
            } else {
                list.add(in);
            }
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        
        String nOrP = scanner.nextLine();
        if(nOrP.equals("n")){
            System.out.println(list.stream().mapToInt(s->Integer.valueOf(s)).filter(i->i<0).average().getAsDouble());
        }if(nOrP.equals("p")){
            System.out.println(list.stream().mapToInt(s->Integer.valueOf(s)).filter(i->i>0).average().getAsDouble());
        }
        
    }
}
