import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CalculatorTest {
    @Test
    public void test() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(3,7);
        assertThat("Ожидали другой результат", result, equalTo(1));
    }

    @Test
    public void test2() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.div(4, 4));
    }
}
