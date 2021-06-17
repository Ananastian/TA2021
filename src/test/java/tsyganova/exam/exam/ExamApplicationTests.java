package tsyganova.exam.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tsyganova.exam.ta.Calculator;
import tsyganova.exam.ta.FormulaResults;

@SpringBootTest
class ExamApplicationTests {

	@Test
	void contextLoads() {
	}

        @Test
    void testFormula()
    {
        assertEquals(4,Calculator.Calculate(2));
    }
    
    @Test
    void testFormulaWithManyArgs()
    {
        FormulaResults fr = new FormulaResults();
        double[] args = new double[]{3d, 4d, 5d};
        fr.SetArgs(args);
        assertEquals("[9.0, 16.0, 25.0]", fr.Calculate());
    }
}

