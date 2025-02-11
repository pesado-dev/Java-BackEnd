package desafios;

import java.util.Scanner;

public class desafiodeepseek {
    public static void main(String[] args) {
        //abrir entrada de dados
        Scanner scanner = new Scanner(System.in);

        //declarar o array
        int numeromax = 10;
        String[] missao = new String[numeromax];
        String[] descricoesMissoes = new String[numeromax];
        String[] niveisDificuldade = new String[numeromax];

        //contadores
        int opcao = 0;
        int numerodecadastro = 0;

        while(opcao != 3){
            //menu
            System.out.println("======= Sistema de Gerenciamento de Missões Ninja ==========\n");
            System.out.println("1. Cadastrar Missão\n");
            System.out.println("2. Listar Todas as Missões\n");
            System.out.println("3. Sair\n");
            System.out.println("Escolha uma opção:\n");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

            switch (opcao){
                case 1:
                    if (numerodecadastro < numeromax){
                        System.out.println("Digite a missão do ninja: ");
                        String nomedamissao = scanner.nextLine();
                        System.out.println("Digite a descrição da missão: ");
                        String descrisaomissao = scanner.nextLine();
                        System.out.println("Digite o nível de dificuldade (Fácil, Médio, Difícil): ");
                        String nivelDeficuldade = scanner.nextLine();

                        //Amarzenar os dados nos arrays
                        missao[numerodecadastro] = nomedamissao;
                        descricoesMissoes[numerodecadastro] = descrisaomissao;
                        niveisDificuldade[numerodecadastro] = nivelDeficuldade;

                        numerodecadastro++;
                        System.out.println("Missão cadastrada com sucesso!\n");
                    } else{
                        System.out.println("Limite de missoes atingido. Não é possível cadastrar missões.\n");
                    }
                    break;
                case 2:
                    if(numerodecadastro == 0){
                        System.out.println("Nenhuma missão cadastrada.\n");
                    } else {
                        System.out.println("========== Lista de Missões ==========");
                        for (int i = 0; i < numerodecadastro; i++) {
                            System.out.println("Missões: "+missao[i]);
                            System.out.println("Descrição: "+descricoesMissoes[i]);
                            System.out.println("Dificuldade: "+niveisDificuldade[i]);
                            System.out.println("---------------------------");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
                    break;
            }
        }
        //fechamento do scanner
        scanner.close();
    }
}
