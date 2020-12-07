import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigDecimalSolutionTest {
    @Test
    void given6Strings_SortThem(){
        String[] s = {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
        BigDecimalSolution.printBigDecimalInASortedWay(s);

        assertEquals("90", s[0]);
        assertEquals("56.6", s[1]);
        assertEquals("50", s[2]);
        assertEquals("02.34", s[3]);
        assertEquals("0.12", s[4]);
        assertEquals(".12", s[5]);
        assertEquals("0", s[6]);
        assertEquals("000.000", s[7]);
        assertEquals("-100", s[8]);
    }

}
