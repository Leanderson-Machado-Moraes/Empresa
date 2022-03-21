/*
Diagrama de classe:

Classe: CalculadoraImc

atributos:
+peso:double
+altura:double
+imc:double

Métodos:
Scanner(System.in)
sout.

Nota: ao escrever sua altura, use , entre os numeros.
 */
package br.imc.classes;

import java.util.Scanner;

public class CalculadoraImc {

    public static void main(String[] args) {

        double peso;
        double altura;

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o seu peso: ");
        peso = ler.nextDouble();
        System.out.println("Informe a sua altura: ");
        altura = ler.nextDouble();

        double imc;
        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Saudável!");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Peso em excesso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obeisdade grau II");
        } else {
            System.out.println("obesidade grau III");

        }
        System.out.println("Seu imc é:" + imc);

    }
}
