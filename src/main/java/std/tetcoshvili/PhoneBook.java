package std.tetcoshvili;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {


    private Map<String, String> contacts = new TreeMap<>();

    public int add(String name, String number) {
        if (name == null || name.trim().isEmpty() || number == null || number.trim().isEmpty()) {
            return contacts.size();
        }
        if (!contacts.containsKey(name)) {
            contacts.put(name, number);
        }
        return contacts.size();
    }

    // Создать пустой метод-заглушку findByNumber в классе PhoneBook,
    // который только возвращает null.
    public String findByNumber(String number) {
        return null; // Заглушка возвращает null
    }

}