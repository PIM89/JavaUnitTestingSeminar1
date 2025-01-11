package Calculator;

import org.assertj.core.data.Offset;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculatingDiscount(100, 10)).isEqualTo(90);

        assertThat(Calculator.calculatingDiscount(0.4, 10))
                .isEqualTo(0.36, Offset.offset(0.001));

        assertThatThrownBy(() -> Calculator.calculatingDiscount(0, 100))
                .isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, -10))
                .isInstanceOf(ArithmeticException.class);
    }
}