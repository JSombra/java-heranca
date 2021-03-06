public class Administrador extends Funcionario implements Autenticavel {

    private AutenticadorCodigo autenticador;

    public Administrador(){
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

    @Override
    public double getBonificacao() {
        return 5000;
    }
}
