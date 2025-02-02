
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> list = new ArrayList();
        while (true) {
            String value = scanner.nextLine();
            if(value.toLowerCase().equals("end")){
                break;
            }else{
                list.add(value);
            }                   
        }
        
        double average = list.stream()
                .mapToInt(i->Integer.valueOf(i)).
                average().getAsDouble();
        System.out.println(average);
        
    }
}
