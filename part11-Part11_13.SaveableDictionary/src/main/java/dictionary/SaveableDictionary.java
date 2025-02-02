/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mąż
 */
public class SaveableDictionary {

    private Map<String, String> dictionary;
    private Map<String, String> reversDictionary;
    private String filename;

    public SaveableDictionary() {
        dictionary = new HashMap();
        reversDictionary = new HashMap();
    }

    public SaveableDictionary(String file) {
        dictionary = new HashMap();
        reversDictionary = new HashMap();
        filename = file;
    }

    public boolean load() {
        try {
            Scanner reader = new Scanner(Paths.get(filename));
            while (reader.hasNextLine()) {
                String[] line = reader.nextLine().split(":");
                add(line[0], line[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Load Failed");
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(filename);
            dictionary.entrySet().stream().forEach(pair -> writer.println(pair.getKey() + ":" + pair.getValue()));
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("Save Failed");
            return false;
        }
    }

    public void add(String words, String translation) {
        if (dictionary.containsKey(words) || reversDictionary.containsKey(words)) {
            return;
        }
        dictionary.put(words, translation);
        reversDictionary.put(translation, words);

    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        return reversDictionary.get(word);
    }

    public void delete(String word) {
//        String reverseKey = reversDictionary.entrySet().stream().filter(pair -> pair.getKey().equals(word) || pair.getValue().equals(word)).findFirst().get().getKey();
//        String dictKey = dictionary.entrySet().stream().filter(pair -> pair.getKey().equals(word) || pair.getValue().equals(word)).findFirst().get().getKey();
//        dictionary.remove(dictKey);
//        reversDictionary.remove(reverseKey);

//improved to speed
        String reverseKey = reversDictionary.entrySet().stream().filter(pair -> pair.getKey().equals(word) || pair.getValue().equals(word)).findFirst().get().getKey();
        String dictKey = reversDictionary.get(reverseKey);
        dictionary.remove(dictKey);
        reversDictionary.remove(reverseKey);

////noStreams
//        if(dictionary.containsKey(word)){
//            reversDictionary.remove(dictionary.get(word));
//            dictionary.remove(word);
//        }else{
//            dictionary.remove(reversDictionary.get(word));
//            reversDictionary.remove(word);
    }
}


