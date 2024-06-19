public class ContaCorrente extends Conta {

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

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
