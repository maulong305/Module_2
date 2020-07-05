package demsolanxh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class CountWord {
//    tạo HashMap
    private HashMap<String,Integer> data;
//    pt khởi tạo
    public CountWord() {
        HashMap<String,Integer> data = new HashMap<>();
        this.data = data;
    }
    public HashMap<String, Integer> getData() {
        return data;
    }
    public void countWord(String str){
        Collection<String> words = this.wordsFromString(str);
        for (String s: words) {
            if (this.data.containsKey(s)) {
                int value = this.data.get(s);
                this.data.put(s, value + 1);
            } else {
                this.data.put(s, 1);
            }
        }
    }

    private Collection<String> wordsFromString(String str) {
        Collection<String> words = new ArrayList<>();

        int lastSpace = -1;
        String space = " ";
        for (int i = 0; i < str.length();i++){
            if (str.charAt(i) == space.charAt(0)){
                String thisWord = str.substring(lastSpace + 1, i); // ?
                lastSpace = i;
                words.add(thisWord);
            } else if (i == str.length() - 1) {
                String thisWord = str.substring(lastSpace + 1, i+1); // ?
                words.add(thisWord);
            }
        }
        return words;
    }

}
