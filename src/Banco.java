import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarClientes() {
        for (Conta conta : contas) {
            System.out.println("Cliente: " + conta.getCliente().getNome() + " | Conta: " + conta.getNumero());
        }
    }
    public List<Conta> buscarContasPorCliente(String nomeCliente) {
        List<Conta> contasDoCliente = new ArrayList<>();
        for (Conta conta : contas) {
            if (conta.getCliente().getNome().equalsIgnoreCase(nomeCliente)) {
                contasDoCliente.add(conta);
            }
        }
        return contasDoCliente;
    }


}
