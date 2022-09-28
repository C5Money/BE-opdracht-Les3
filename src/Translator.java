import java.util.HashMap;
import java.util.Map;

public class Translator {
    //    Hashmap variabele
    Map<Integer, String> numericAlpha = new HashMap<>();

    //    constructor
    public Translator(Integer [] numeric, String [] alphabetic){
        for(int i = 0; i < numeric.length; i++){
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    //    instance method
    public String translate(Integer number){
        return numericAlpha.get(number);
    }

}