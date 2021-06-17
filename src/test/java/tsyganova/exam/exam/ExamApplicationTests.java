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
        assertEquals(-34,Calc.Calculate(2));
    }
    
    @Test
    void testForm()
    {
        Formula fr = new Formula();
        double[] args = new double[]{1d, 2d, 3d, 4d, 5d, 6d, 7d};
        fr.SetArgs(args);
        assertEquals("[22.0, -34.0, -72.0, -86.0, -70.0, -18.0, 76.0]", fr.Calculate());
    }
}

