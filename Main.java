package com.company;

	import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner leitor = new Scanner(System.in);

                System.out.println("Bem-vindo à tua calculadora");

                System.out.println("Digite um número:");
                int n1 = leitor.nextInt();

                System.out.println("Digite outro número:");
                int n2 = leitor.nextInt();

                System.out.println("Escolha entre: soma,subtração,divisão ou multiplicação");
                String caso = leitor.next();
                int resultado = 0;

                switch (caso) {
                    case "soma":
                        resultado= n1 + n2;
                        System.out.println("O resultado é"+ " "+ resultado);
                        break;

                    case "subtração":
                        resultado = n1 - n2;
                        System.out.println("O resultado é"+ " " + resultado);
                        break;

                    case "divisão":
                        resultado = n1 / n2;
                        System.out.println("O resultado é"+ " " + resultado);
                        break;

                    case "multiplicação":
                        resultado = n1 * n2;
                        System.out.println("O resultado é"+ " "+ resultado);
                        break;

                    default:
                        System.out.println("Indique um valor válido:");




                }


            }

        }
    }
}
