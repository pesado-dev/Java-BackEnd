package desafios;

public class desafio1 {
    public static void main(String[] args) {
    //informações do ninja
        //dados do naruto
        String ninja1 = "Uzumaki";
        int idade = 15;
        String missaouzumaki = "correr atras da minhoca";
        char niveldificuldade = 'a';
        String statusdeconclusao = "não concluido";

        if(idade <= 15){
            if(niveldificuldade == 'c' || niveldificuldade == 'd') {
                statusdeconclusao = "concluido";
            } else {
                statusdeconclusao = "missão não concluida";
            }
        }   else {
            statusdeconclusao = "Concluida";
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("nome do ninja: " + ninja1);
        System.out.println("idade do ninja: " + idade);
        System.out.println("Missão: " + missaouzumaki);
        System.out.println("nivel da missao: " + niveldificuldade);
        System.out.println("status da missao: " + statusdeconclusao);

        System.out.println("----------------------------------------------------------------");

        String ninja2 = "Sasuke viado";
        int idade2 = 17;
        String missaosasuke = "em busca da piramide";
        char niveldificuldade2 = 'c';
        String statusdeconclusao2 = "concluido";

        if(idade2 < 15){
            if(niveldificuldade2 == 'c' || niveldificuldade2 == 'd') {
                statusdeconclusao2 = "concluido";
            } else {
                statusdeconclusao2 = "missão não concluida";
            }
        }   else {
            statusdeconclusao2 = "Concluida";
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("nome do ninja: " + ninja2);
        System.out.println("idade do ninja: " + idade2);
        System.out.println("Missão: " + missaosasuke);
        System.out.println("nivel da missao: " + niveldificuldade2);
        System.out.println("status da missao: " + statusdeconclusao2);

        System.out.println("----------------------------------------------------------------");

        String ninja3 = "Sakura";
        int idade3 = 14;
        String missaosakura = "comendo miojo";
        char niveldificuldade3 = 'b';
        String statusdeconclusao3 = "nao concluido";

        if(idade3 < 15){
            if(niveldificuldade3 == 'c' || niveldificuldade3 == 'd') {
                statusdeconclusao3 = "concluido";
            } else {
                statusdeconclusao3 = "missão não concluida";
            }
        }   else {
            statusdeconclusao3 = "Concluida";
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("nome do ninja: " + ninja3);
        System.out.println("idade do ninja: " + idade3);
        System.out.println("Missão: " + missaosasuke);
        System.out.println("nivel da missao: " + niveldificuldade3);
        System.out.println("status da missao: " + statusdeconclusao3);

        System.out.println("----------------------------------------------------------------");
    }
}
