package std.tetcoshvili;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    private PhoneBook phoneBook;

    @BeforeEach
    void setUp() {
        phoneBook = new PhoneBook();
    }

    // Тесты будут добавляться тут

    // Создать тест или тесты на метод add в классе тестов PhoneBookTest.

    @Test
    void testAdd_firstContact() {

        String name = "Vlad";
        String number = "8-921-099-83-45";

        int count = phoneBook.add(name, number);

        assertEquals(1, count, "Add 1");
    }

    @Test
    void testAdd_secondContact() {

        phoneBook.add("Vlad", "8-921-099-83-45");

        String name = "SvetaBolshie";
        String number = "8-911-101-12-11";

        int count = phoneBook.add(name, number);

        assertEquals(2, count, "Add 2");
    }

    @Test
    void testAdd_duplicateName() {
        phoneBook.add("Vlad", "123-456");
        phoneBook.add("SvetaBolshie", "8-911-101-12-11");

        String duplicateName = "Vlad";
        String newNumber = "8-911-999-99-99"; // Меняем номер

        int count = phoneBook.add(duplicateName, newNumber);

        assertEquals(2, count, "Add Double");
    }

}