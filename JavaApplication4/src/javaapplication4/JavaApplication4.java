/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author 326114045
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Leitura do Vetor X
        System.out.print("Digite o tamanho do vetor X (n): ");
        int n = scanner.nextInt();
        int[] X = new int[n];
        System.out.println("Digite os elementos do vetor X:");
        for (int i = 0; i < n; i++) {
            X[i] = scanner.nextInt();
        }

        // Leitura do Vetor Y
        System.out.print("Digite o tamanho do vetor Y (m): ");
        int m = scanner.nextInt();
        int[] Y = new int[m];
        System.out.println("Digite os elementos do vetor Y:");
        for (int i = 0; i < m; i++) {
            Y[i] = scanner.nextInt();
        }

        // O tamanho máximo de Z é a soma dos tamanhos de X e Y
        int[] vetorTemporario = new int[n + m];
        int quantidadeUnicos = 0;

        // Inserindo elementos de X no vetor temporário (se não existirem)
        for (int i = 0; i < n; i++) {
            if (!contemElemento(vetorTemporario, quantidadeUnicos, X[i])) {
                vetorTemporario[quantidadeUnicos] = X[i];
                quantidadeUnicos++;
            }
        }

        // Inserindo elementos de Y no vetor temporário (se não existirem)
        for (int i = 0; i < m; i++) {
            if (!contemElemento(vetorTemporario, quantidadeUnicos, Y[i])) {
                vetorTemporario[quantidadeUnicos] = Y[i];
                quantidadeUnicos++;
            }
        }

        // Criação do vetor Z final com o tamanho exato
        int[] Z = new int[quantidadeUnicos];
        for (int i = 0; i < quantidadeUnicos; i++) {
            Z[i] = vetorTemporario[i];
        }

        // Exibição do resultado
        System.out.print("\nVetor União Z = (");
        for (int i = 0; i < Z.length; i++) {
            System.out.print(Z[i]);
            if (i < Z.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");

        scanner.close();
    }

    // Método para checar se o elemento já foi inserido na união
    private static boolean contemElemento(int[] vetor, int tamanhoAtual, int valor) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }
} // TODO code application logic here
    
    

