
package calculadora;

/**
 * Classe responsável por operações matemáticas básicas.
 *
 * @author Giovanni
 * @version 2.0
 */
public class Calculadora {

    /**
     * Calcula o resultado de uma operação matemática.
     *
     * @param a primeiro número
     * @param b segundo número
     * @param op operador matemático
     * @return resultado da operação
     * @throws ArithmeticException em divisão por zero
     * @throws IllegalArgumentException para operadores inválidos
     */
    public double calc(int a, int b, String op) {
        if (op == null) {
            throw new IllegalArgumentException("Operação inválida!");
        }

        return switch (op) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException(
                "Operação inválida!");
        };
    }

    // Métodos separados para facilitar a manutenção.

    private double somar(int a, int b) {
        return (double) a + b;
    }

    private double subtrair(int a, int b) {
        return (double) a - b;
    }

    private double multiplicar(int a, int b) {
        return (double) a * b;
    }

    private double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return (double) a / b;
    }
}
