package org.example.aula53;

public class Teste {
    public static void main(String[] args) {
        usandoEnum();
    }

    private static void usandoEnum() {
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        System.out.println("Teste utilizando ENUM no Java.");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    private static void imprimeDiaSemana (DiaSemana dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;

            case TERCA:
                System.out.println("Terça-feira");
                break;

            case QUARTA:
                System.out.println("Quarta-feira");
                break;

            case QUINTA:
                System.out.println("Quinta-feira");
                break;

            case SEXTA:
                System.out.println("Sexta-feira");
                break;

            case SABADO:
                System.out.println("Sábado");
                break;

            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }
}
