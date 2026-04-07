/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author 326114045
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor (n): ");
        int n = scanner.nextInt();

        int[] X = new int[n];
        int[] Y = new int[n];

        System.out.println("Digite os " + n + " elementos do vetor X:");
        for (int i = 0; i < n; i++) {
            X[i] = scanner.nextInt();
        }

        // Lógica de inversão
        for (int i = 0; i < n; i++) {
            Y[i] = X[n - 1 - i];
        }

        // Impressão dos resultados
        System.out.print("Vetor X = ");
        imprimirVetor(X);
        
        System.out.print("Vetor Y = ");
        imprimirVetor(Y);

        scanner.close();
    }

    // Método auxiliar genérico para imprimir o vetor
    private static void imprimirVetor(int[] vetor) {
        System.out.print("(");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }
}// TODO code application logic here
    
    

