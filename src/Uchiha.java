
public class Uchiha extends Ninja {
    String habilidadeEspecial = "sharingam";

    public Uchiha(String nome, String aldeia, int idade, String missao, String nivelDificuldade, String statusMissao) {
        super(nome, aldeia, idade, missao, nivelDificuldade, statusMissao);
    }

    public void MostrarHabilidadeEspecial(){
        System.out.println(nome+" ativou o sharingam pq é um uchiha");

    }
    @Override
    public void MostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);
        System.out.println("Habilidade Especial: "+habilidadeEspecial);
    }
}
