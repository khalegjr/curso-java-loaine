package org.example.aula56.labs;

public class Calculadora {
    enum Operacao {
        SOMAR("+") {
            @Override
            public double executarOperacao(double x, double y) {
                return x + y;
            }
        }, SUBTRAIR("-") {
            @Override
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        }, MULTIPLICAR("*") {
            @Override
            public double executarOperacao(double x, double y) {
                return x * y;
            }
        }, DIVIDIR("/") {
            @Override
            public double executarOperacao(double x, double y) {
                return x / y;
            }
        };

        private String simbolo;

        Operacao(String simbolo) {
            this.simbolo = simbolo;
        }

        public abstract double executarOperacao(double x, double y);

        @Override
        public String toString() {
            return this.simbolo;
        }
    }


    public static void main(String[] args) {
        double x = 5.0;
        double y = 2.0;

        for (Operacao op : Operacao.values()) {
            System.out.println(x + " " + op.toString() + " " + y + " = " + op.executarOperacao(x, y));
        }
    }
}
