package demsolanxh;

import java.util.Set;

public class TestCountWord {
    public static void main(String[] args) {
        CountWord counter = new CountWord();
        String str = "ab cd ab efgh";
        counter.countWord(str);
        Set<String> keys = counter.getData().keySet();
        for	(String	key: keys){
            System.out.println("Key: " + key + ": " + counter.getData().get(key));
        }
    }
}
