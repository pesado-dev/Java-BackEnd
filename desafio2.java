package desafios;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        //abrir scanner - Entrada de dados
        Scanner scanner = new Scanner(System.in);
        //fazer o array
        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        //contadores
        int ninjascadastrados = 0;
        int opcao = 0;

        while(opcao != 3){
            //menu
            System.out.println("\n======= Menu Ninja ==========");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninja");
            System.out.println("3.  Sair");
            System.out.println("Escolher uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    if(ninjascadastrados < NUMERO_MAX){
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeninja = scanner.nextLine(); //declarou uma nova var
                        ninjas[ninjascadastrados] = nomeninja;
                        ninjascadastrados++;
                        System.out.println("Ninja cadastrado com sucesso");
                    } else {
                        System.out.println("A lista de ninjas esta cheia, impossivel de cadastrar um novo ninja");
                    }
                    break;
                case 2:
                    if (ninjas == null){
                        System.out.println("Nenhum ninja econtrado");
                    } else {
                        System.out.println("=============== Lista de ninjas =============");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Estamos terminando o programa");
                    break;
                default:
                    System.out.println("Esta opção não é valida");
                    break;
            }
        }

        //fechar scanner
        scanner.close();
    }
}
