package lvl2.lesson3;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class ListUniqueWord {

    public static void main(String[] args) {
        testArray();
    }
    public static int howManyWord(ArrayList<String> arrayList, String townName) {
        return Collections.frequency(arrayList, townName); // Определиим, сколько раз элемент arrayList встречается в коллекции townName
    }
    private static void testArray() {
        Map<String, Integer> countTownName = new LinkedHashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Самара");
        arrayList.add("Приволжье");
        arrayList.add("Обшаровка");
        arrayList.add("Москва");
        arrayList.add("Жигулёвск");
        arrayList.add("Уфа");
        arrayList.add("Чапаевск");
        arrayList.add("Безенчук");
        arrayList.add("Москва");
        arrayList.add("Хворостянка");
        arrayList.add("Уфа");
        arrayList.add("Новоспасский");
        arrayList.add("Октябрьск");
        arrayList.add("Междуреченск");
        arrayList.add("Тольятти");
        arrayList.add("Астрахань");
        arrayList.add("Сызрань");
        arrayList.add("Москва");
        arrayList.add("Прибрежный");
        arrayList.add("Тростянка");
/**
 *  ниже находим и выводим список уникальных слов, из которых состоит массив (дубликаты не считаем)
 */
        System.out.println(""); //отступим строку для наглядности
        System.out.println("Находим и выводим список уникальных слов, из которых состоит массив (дубликаты не считаем):");
        Boolean parseComma = false;
        System.out.print("{");
        for (int i = 0; i < arrayList.size(); i++) {
            if (howManyWord(arrayList, arrayList.get(i)) == 1) {
                System.out.print((parseComma ? ", " : "") + arrayList.get(i));
                parseComma = true;
            }
        }
        System.out.println("}");
/**
 *  ниже считаем сколько раз встречается каждое слово
 */
        System.out.println(""); //отступим строку для наглядности
        System.out.println("Считаем сколько раз встречается каждое слово:");
        for (int i = 0; i < arrayList.size(); i++) {
            if (countTownName.containsKey(arrayList.get(i)))
                countTownName.put(arrayList.get(i), countTownName.get(arrayList.get(i)) + 1);
            else
                countTownName.put(arrayList.get(i), 1);
        }

        System.out.println(countTownName);
    }

}
