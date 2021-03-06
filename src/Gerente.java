public class Gerente extends Funcionario implements Autenticavel {

    private AutenticadorCodigo autenticador;

    public Gerente(){
        this.autenticador = new AutenticadorCodigo();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do Gerente");
        return super.getSalario();
    }
}