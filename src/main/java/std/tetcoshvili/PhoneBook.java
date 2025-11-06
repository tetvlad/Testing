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
}