package BoletinesPedro1;

abstract class Expresion {
    public abstract double evaluar() throws ExpresionException;
}

class Operando extends Expresion {
    private double valor;

    public Operando(double valor) {
        this.valor = valor;
    }

    @Override
    public double evaluar() {
        return valor;
    }
}

class Operacion extends Expresion {
    private Expresion left;
    private Expresion right;
    private char operator;

    public Operacion(Expresion left, Expresion right, char operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public double evaluar() throws ExpresionException {
        double leftValue = left.evaluar();
        double rightValue = right.evaluar();

        switch (operator) {
            case '+':
                return leftValue + rightValue;
            case '-':
                return leftValue - rightValue;
            case '*':
                return leftValue * rightValue;
            case '/':
                return leftValue / rightValue;
            default:
                throw new ExpresionException("Operador desconocido: " + operator);
        }
    }
}

class ExpresionException extends Exception {
    public ExpresionException(String message) {
        super(message);
    }
}