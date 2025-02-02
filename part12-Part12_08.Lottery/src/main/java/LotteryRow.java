
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random random = new Random();
        for(int i =0; i<7;i++){
            int newNumber = random.nextInt(40)+1;
            if(!containsNumber(newNumber)){
                numbers.add(newNumber);
            }else{
                i--;
            }
        }
        numbers.sort(null);
    }

    public boolean containsNumber(int number) {        
        return numbers.contains(number);
    }
}

