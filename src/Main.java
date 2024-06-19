import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("João Silva", 30, "joao.silva@hotmail.com"));
        clientes.add(new Cliente("Maria Oliveira", 25, "maria.oliveira@gmail.com"));
        clientes.add(new Cliente("Carlos Pereira", 40, "carlos.pereira@yahoo.com"));

        for (Cliente c : clientes) {
            c.mostrarClientes();
            System.out.println();
        }

        cc.depositar(100.2);
        cc.imprimirExtrato();

        cc.transferir(50, cp);
        cp.imprimirExtrato();
        cc.imprimirExtrato();

        cc.sacar(15.26);
        cc.imprimirExtrato();

    }
}