
package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteCalculadora {

    Calculadora calculadora = new Calculadora();

    @Test
    void testarSoma() {
        assertEquals(15, calculadora.calc(10, 5, "+"));
    }

    @Test
    void testarSubtracao() {
        assertEquals(5, calculadora.calc(10, 5, "-"));
    }

    @Test
    void testarMultiplicacao() {
        assertEquals(50, calculadora.calc(10, 5, "*"));
    }

    @Test
    void testarDivisao() {
        assertEquals(2.5, calculadora.calc(10, 4, "/"));
    }

    @Test
    void testarDivisaoPorZero() {
        assertThrows(ArithmeticException.class,
            () -> calculadora.calc(10, 0, "/"));
    }

    @Test
    void testarOperacaoInvalida() {
        assertThrows(IllegalArgumentException.class,
            () -> calculadora.calc(10, 5, "%"));
    }
}
