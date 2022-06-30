package lvl2.lesson3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "89011234567");
        phoneBook.add("Петров", "89039561303");
        phoneBook.add("Сидоров", "89865621818");
        phoneBook.add("Самарин", "89223726515");
        phoneBook.add("Жигулёв", "89102764510");
        phoneBook.add("Москвин", "89168376473");
        phoneBook.add("Иванов", "89152830203");
        phoneBook.add("Самарин", "89017654321");
        phoneBook.add("Леонов", "89117369926");
        phoneBook.add("Иванов", "89018327492");

        String searchSurname = "Иванов"; // Вводим фамилию для поиска номера телефона
        System.out.println("Телефон(ы) " + searchSurname + "а(ых): ");

        int count = 0;

        for (String phoneNum : phoneBook.get(searchSurname)) {
            count++;
            System.out.println("(" + count + ") " + phoneNum + " ");
        }
    }
    public void add(String surname, String phoneNumber) {

        ArrayList<String> strings = phoneMap.get(surname);

        if (strings == null) {
            ArrayList<String> dataBasePhones = new ArrayList<>();
            dataBasePhones.add(phoneNumber);
            phoneMap.put(surname, dataBasePhones);
        }   else {
                strings.add(phoneNumber);
                phoneMap.put(surname, strings);
        }
    }

    public ArrayList<String> get(String surname) {

        return phoneMap.get(surname);
    }
}




