import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeNinja = 0, quantidadeMaxima = 20;
        Ninja[] ninjas = new Ninja[quantidadeMaxima];
        boolean continuar = true;

        while (continuar){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Apagar Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            String escolha = entrada.nextLine();
            switch (escolha) {
                case "1":
                    if (quantidadeNinja < quantidadeMaxima) {
                        System.out.println("Qual o nome do seu ninja?");
                        String nome = entrada.nextLine();
                        System.out.println("Qual a idade do seu ninja?");
                        int idade = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Qual a aldeia do seu ninja?");
                        String aldeia = entrada.nextLine();
                        System.out.println("Qual a missão dele?");
                        String missao = entrada.nextLine();
                        System.out.println("qual o nível de dificuldade da missão (S/A/B/C)");
                        String dificuldade = entrada.nextLine();
                        System.out.println("Qual o status da missão?");
                        String status = entrada.nextLine();
                        System.out.println("Qual o clã do seu ninja?");
                        String cla = entrada.nextLine();
                        if (cla.equalsIgnoreCase("uchiha")) {
                            Uchiha uchiha = new Uchiha(nome, aldeia, idade, missao, dificuldade, status);
                            uchiha.MostrarInformacoes();
                            ninjas[quantidadeNinja] = uchiha;
                        } else if (cla.equalsIgnoreCase("Uzumaki")) {
                            Uzumaki uzumaki = new Uzumaki(nome, aldeia, idade, missao, dificuldade, status);
                            uzumaki.MostrarInformacoes();
                            ninjas[quantidadeNinja] = uzumaki;
                        } else {
                            Ninja ninja = new Ninja(nome, aldeia, idade, missao, dificuldade, status);
                            ninjas[quantidadeNinja] = ninja;
                        }
                        quantidadeNinja++;
                        System.out.println("parabéns seu ninja foi cadastrado com sucesso!");
                    }
                    break;
                case "2":
                    System.out.println("\n=== Lista de Ninjas Cadastrados ===");
                    for (int i = 0; i < quantidadeNinja; i++) {
                        ninjas[i].MostrarInformacoes();
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("Qual ninja quer apagar?");
                    for (int i = 0; i < quantidadeNinja; i++) {
                        System.out.println(i + ninjas[i].nome);
                    }
                    int ninjaDelete = entrada.nextInt();
                    entrada.nextLine();
                    ninjas[ninjaDelete] = null;
                    for (int i = 0; i < quantidadeNinja; i++) {
                        if (ninjas[i] == null){
                            ninjas[i] = ninjas[i+1];
                            ninjas[i+1] = null;
                            quantidadeNinja--;
                        }
                    }
                    break;
                case "4":
                    entrada.close();
                    continuar = false;
                    break;
            }
        }

    }
}
