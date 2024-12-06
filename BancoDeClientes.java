package BancoClientes;
import javax.swing.*;
import java.util.ArrayList;

public class BancoDeClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    public void inserirCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public void removerCliente(int id) {
        clientes.removeIf(cliente -> cliente.getId() == id);
    }
    public void alterarCliente(int id, String nome, String fone) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                cliente.setNome(nome);
                cliente.setFone(fone);
                return;
            }
        }
    }
    public Cliente listarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }
    public void listarTodosClientes() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente registrado.");
        } else {
            listaClientes.addAll(clientes);
        }
        JOptionPane.showMessageDialog(null, listaClientes);
    }
}
