
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Person student = new Student("name", "address");
        System.out.println(student);
        Student uncloaaced = (Student) student;
        uncloaaced.study();
        System.out.println(student instanceof Student);
        System.out.println(student);

        // write your test code here
    }
    
    public static void printPersons(ArrayList<Person> persons){
        for(Person person: persons){
            System.out.println(person);
        }
    }

}
