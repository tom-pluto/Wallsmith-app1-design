package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class ToDoEntryTest {

    private ToDoEntry test;

    @BeforeEach
    void setUp() {

        test = new ToDoEntry("Test", "1999-04-02");

    }

    @Test
    void getDescription() {

        String expected = "Test";
        String actual = test.getDescription();
        assertEquals(expected, actual);

    }

    @Test
    void setDescription() {

        String expected = "Another test";
        test.setDescription("Another test");
        String actual = test.getDescription();
        assertEquals(expected, actual);

    }

    @Test
    void getDueDate() {

        String expected = "2002-04-02";
        String actual = test.getDueDate();
        assertEquals(expected, actual);

    }

    @Test
    void setDueDate() {

        GregorianCalendar newDate = new GregorianCalendar();
        newDate.set(121,4, 2);
        test.setDueDate(newDate);
        String expected = "2021-04-02";
        String actual = test.getDueDate();
        assertEquals(expected, actual);

    }
}