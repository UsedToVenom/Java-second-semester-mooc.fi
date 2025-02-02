package dictionary;

public class Main {

    public static void main(String[] args) {
        SaveableDictionary sd = new SaveableDictionary("words.txt");

        sd.add("dick", "penis");
        sd.save();
        SaveableDictionary od = new SaveableDictionary("words.txt");
        od.load();
        System.out.println(od.translate("penis"));
        od.delete(null);
        System.out.println(od.translate("penis"));

    }
}
