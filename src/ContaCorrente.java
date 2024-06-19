public class ContaCorrente extends Conta {

    // Construtor padrão
    public ContaCorrente() {
        super();
    }

    // Construtor com dados do cliente
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    // Método para mostrar informações do cliente usando a classe Cliente
    public void mostrarCliente() {
        if (cliente != null) {
            cliente.mostrarClientes();
        } else {
            System.out.println("Nenhum cliente associado a esta conta.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato conta corrente ====");
        super.imprimirInfosComuns();
    }


}
