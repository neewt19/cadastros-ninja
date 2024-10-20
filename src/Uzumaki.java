public class Uzumaki extends Ninja {

    public Uzumaki(String nome, String aldeia, int idade, String missao, String nivelDificuldade, String statusMissao) {
        super(nome, aldeia, idade, missao, nivelDificuldade, statusMissao);
    }
    @Override
    public void  MostrarInformacoes(){
        super.MostrarInformacoes();
        System.out.println("sou um uzumaki");
    }
}
