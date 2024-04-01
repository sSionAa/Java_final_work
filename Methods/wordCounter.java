package Methods;

import java.util.HashMap;
import java.util.Map;

public class wordCounter {
    public static void WordsCounter(String[] picnic) {
        String maxLength = picnic[0];
        int countOfWords = 0;
        Map<String,Integer> uniqPicnic = new HashMap<>();
        for (String foods : picnic ) {
            countOfWords+=1;
            maxLength = CheckerLength.CheckLen(maxLength,foods);
            if (!uniqPicnic.containsKey(foods)){
                uniqPicnic.put(foods,1);
            }else {
                uniqPicnic.put(foods, uniqPicnic.get(foods)+1);
            }
        }
        System.out.printf("Самое длинное слово в файле = %s \n", maxLength);
        System.out.printf("Количество слов в файле = %d \n", countOfWords);
        System.out.println("Частота слов : ");
        for (Map.Entry<String, Integer> stringIntegerEntry : uniqPicnic.entrySet()) {
            System.out.println(stringIntegerEntry);
        }


    }
}
