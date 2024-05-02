import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeConverterTest {

    private GradeConverter converter;
    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void testConvert1() {
        String expected = "A";
        String actaul = converter.convert(100);
        assertEquals(expected, actaul);
    }

    @Test
    public void testConvert2() {
        String expected = "A";
        String actaul = converter.convert(90);
        assertEquals(expected, actaul);
    }
}