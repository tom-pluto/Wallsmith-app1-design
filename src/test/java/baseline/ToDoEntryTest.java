package baseline;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ToDoEntryTest {

    private ToDoEntry testEntry;

    @BeforeEach
    void setUp() {

        testEntry = new ToDoEntry("This is a test.", new Date(121, 9, 22));

    }

    @Test
    void getDescription() {

        String expected = "This is a test.";
        String actual = testEntry.getDescription();

        assertEquals(expected, actual);

    }

    @Test
    void setDescription() {

        String expected = "This is still a test, but I changed something";
        testEntry.setDescription(expected);
        String actual = testEntry.getDescription();

        assertEquals(expected, actual);

    }

    @Test
    void getDueDate() {

        Date expected = new Date(121, 9, 22);
        Date actual = testEntry.getDueDate();

        assertEquals(expected, actual);

    }

    @Test
    void setDueDate() {

        testEntry.setDueDate(new Date(121, 9, 23));
        Date expected = new Date(121, 9, 23);
        Date actual = testEntry.getDueDate();

        assertEquals(expected, actual);

    }
}