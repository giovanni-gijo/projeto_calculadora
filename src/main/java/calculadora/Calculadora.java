package calculadora;

/**
 * Calculadora para operações matemáticas básicas.
 *
 * @author Giovanni
 * @version 1.0
 */
public class Calculadora {

    /**
     * Realiza uma operação entre dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @param op operação matemática
     * @return resultado da operação
     * @throws ArithmeticException se houver divisão por zero
     * @throws IllegalArgumentException se a operação for inválida
     */
    public double calc(int a, int b, String op) {
        if (op == null) {
            throw new IllegalArgumentException("Operação inválida!");
        }

        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * (double) b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Divisão por zero!");
                }
                return (double) a / b;
            default:
                throw new IllegalArgumentException("Operação inválida!");
        }
    }
}
