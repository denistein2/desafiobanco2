//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente denis = new Cliente("Denis");
        denis.setNome("Denis");
        Conta cc = new ContaCorrente(denis);
        Conta poupanca = new ContaPoupanca(denis);

        Banco banco = new Banco("banco teste");
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        poupanca.depositar(500);
        ((ContaPoupanca) poupanca).renderJuros();
        poupanca.imprimirExtrato();

        banco.listarClientes();

    }
}