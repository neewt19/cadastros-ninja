public class Ninja {
    String nome;
    String aldeia;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public Ninja(String nome, String aldeia, int idade, String missao, String nivelDificuldade, String statusMissao) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }

    public void MostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);
    }
}
