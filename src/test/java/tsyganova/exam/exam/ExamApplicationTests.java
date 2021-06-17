package tsyganova.exam.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tsyganova.exam.ta.Calc;
import tsyganova.exam.ta.Formula;

@SpringBootTest
class ExamApplicationTests {

	@Test
	void contextLoads() {
	}

        @Test
    void testFormula()
    {
        assertEquals(0.8181818181818182,Calc.Calculate(2));
    }
    
    @Test
    void testForm()
    {
        Formula fr = new Formula();
        double[] args = new double[]{0d, 1d, -1d, -2d, -3d, 5d};
        fr.SetArgs(args);
        assertEquals("[1.8, 1.125, 4.5, -9.0, -2.25, 0.45]", fr.Calculate());
    }
}

