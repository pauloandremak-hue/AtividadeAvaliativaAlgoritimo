/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeavaliativaalg_prog;

import java.util.Scanner;

/**
 *
 * @author 326128523
 */
public class AtividadeAvaliativaAlg_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

    int[][] sala = new int[6][8];
    int opcao = 0;

    while (opcao != 5) {

        System.out.println("\\n----- BEM-VINDO AO CINEMA CINERMARK ---");
        System.out.println("\\n----- ESCOLHA UMAS DAS OPCOES DO MENU!!! ------");
        System.out.println("\\n----- MENU ------");
        System.out.println("1. Reservar meu assento!");
        System.out.println("2. Cancelar a reserva!");
        System.out.println("3. Exibir o mapa completo da sala!");
        System.out.println("4. Exibir as estatisticas da sala!");
        System.out.println("5. Encerre o programa!!!!");
        System.out.print("Escolha: ");

        opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Fileira (1-6): ");
            int f = sc.nextInt();

            System.out.print("Assento (1-8): ");
            int a = sc.nextInt();

            if (f >= 1 && f <= 6 && a >= 1 && a <= 8) {
            if (sala[f - 1][a - 1] == 0) {
            sala[f - 1][a - 1] = 1;
            System.out.println("O Assento esta reservado com sucesso!!!!");
            }

            else {
                    System.out.println("Assento ja ocupado, por favor escolha outro.");
                }
            }

            else {
                System.out.println("Esta posicao esta invalida!!!.");
            }
            }

            else if (opcao == 2) {
            System.out.print("Fileira (1-6): ");
            int f = sc.nextInt();

            System.out.print("Assento (1-8): ");
            int a = sc.nextInt();

            if (f >= 1 && f <= 6 && a >= 1 && a <= 8) {
            if (sala[f - 1][a - 1] == 1) {
            sala[f - 1][a - 1] = 0;
            System.out.println("A Reserva esta cancelada!");
                }

            else {
                    System.out.println("Assento ja esta livre.");
                }
            }

            else {
                System.out.println("Posicao invalida.");
            }
        }

        else if (opcao == 3) {
            System.out.println("\\nMapa da sala:");
        for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 8; j++) {
            System.out.print(sala[i][j] + " ");
            }
             System.out.println();
            }
        }

        else if (opcao == 4) {
        int livres = 0;
        int ocupados = 0;
        for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 8; j++) {

        if (sala[i][j] == 0) {
        livres++;
                    }
        else {
        ocupados++;
                    }
                }
            }

            int total = 6 * 8;
            double percentual = (ocupados * 100.0) / total;

            System.out.println("Assentos Livres: " + livres);
            System.out.println("Assentos Ocupados: " + ocupados);
            System.out.printf("Percentual de Ocupacao: %.2f%%\\n", percentual);
        }
    }

    sc.close();
    System.out.println("Programa encerrado.");
}
        
    }
    

