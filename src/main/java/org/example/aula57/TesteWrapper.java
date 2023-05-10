package org.example.aula57;

public class TesteWrapper {
    public static void main(String[] args) {

        // Tipos primitivos do Java
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 1000L;
        float num5 = 3.5f;
        double num6 = 3.5555;
        boolean flag = true;
        char a = 'a'; // ou um inteiro equivalente da tabela ASCII

        /** O Java NÃO é 100% orientado à objetos, diferente do Ruby, justamente
         * por causa dos tipos primitivos.
         * A partir do Java 5 foi introduzido os Wrappers, classes que representam
         * os tipos primitivos do Java.
        */

        /**
         * Cria um objeto Short a partir de um número short.
         * O construtor Short(short) foi deprecated no Java 9
        */
        Short num7 = Short.valueOf(num1);
        /**
         * Cria um objeto Short a partir de uma string.
         * O construtor Short(string) foi deprecated no Java 9
        */
        Short num8 = Short.parseShort("1");

        /**
         * Cria um objeto Byte a partir de um número byte.
         * O construtor Byte(byte) foi deprecated no Java 9
         */
        Byte num9 = Byte.valueOf(num2);
        /**
         * Cria um objeto Byte a partir de uma string.
         * O construtor Byte(string) foi deprecated no Java 9
         */
        Byte num10 = Byte.parseByte("10");

        /**
         * Cria um objeto Integer a partir de um número int.
         * O construtor Integer(int) foi deprecated no Java 9
         */
        Integer num11 = Integer.valueOf(num3);
        /**
         * Cria um objeto Integer a partir de uma string.
         * O construtor Integer(string) foi deprecated no Java 9
         */
        Integer num12 = Integer.parseInt("100");

        /**
         * Cria um objeto Long a partir de um número long.
         * O construtor Long(long) foi deprecated no Java 9
         */
        Long num13 = Long.valueOf(num4);
        /**
         * Cria um objeto Long a partir de uma string.
         * O construtor Long(string) foi deprecated no Java 9
         */
        Long num14 = Long.parseLong("1000");

        /**
         * Cria um objeto Float a partir de um número float.
         * O construtor Float(float) foi deprecated no Java 9
         */
        Float num15 = Float.valueOf(num5);
        /**
         * Cria um objeto Float a partir de uma string.
         * O construtor Float(string) foi deprecated no Java 9
         */
        Float num16 = Float.parseFloat("3.5f");
        /**
         * Cria um objeto Float a partir de um número double.
         * O construtor Float(double) foi deprecated no Java 9
         */
        Float num17 = Float.valueOf((float) num6);

        /**
         * Cria um objeto Double a partir de um número double.
         * O construtor Double(double) foi deprecated no Java 9
         */
        Double num18 = Double.valueOf(num6);
        /**
         * Cria um objeto Double a partir de uma string.
         * O construtor Double(string) foi deprecated no Java 9
         */
        Double num19 = Double.parseDouble("3.5556");

        /**
         * Cria um objeto Boolean a partir de uma variável boolean.
         * O construtor Boolean(boolean) foi deprecated no Java 9
         */
        Boolean flag2 = Boolean.valueOf(flag);

        /**
         * Cria um objeto Character a partir de um carácter.
         * O construtor Character(char) foi deprecated no Java 9
         */
        Character b = Character.valueOf('b');
    }
}
