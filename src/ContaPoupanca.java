public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    public void renderJuros() {
        double taxaDeJuros = 0.005; // 0.5% de rendimento, por exemplo
        this.atualizarSaldo(taxaDeJuros);
    }

    public void imprimirExtrato() {
        System.out.println("**** Extrato Conta Poupanca ***** ");
        super.imprimirInfosComuns();
    }


}
