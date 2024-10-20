
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
        super.MostrarInformacoes();
        System.out.println("Habilidade Especial: "+habilidadeEspecial);
    }
}
