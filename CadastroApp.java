package BancoClientes;
import javax.swing.*;

public class CadastroApp {
    public static void main(String[] args) {
        BancoDeClientes bancoDeClientes = new BancoDeClientes();
        int opcao;
        do {
            String menu = """
                    1- Inserir cliente
                    2- Remover cliente
                    3- Alterar cliente
                    4- Listar dados de um cliente
                    5- Listar todos os clientes
                    6- Sair
                    """;
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
                    String fone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente:"));
                    Cliente novoCliente = new Cliente(nome, fone, id);
                    bancoDeClientes.inserirCliente(novoCliente);
                    JOptionPane.showMessageDialog(null, "Cliente foi inserido com sucesso!");
                    break;

                case 2:
                    int idRemover = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente a ser removido:"));
                    bancoDeClientes.removerCliente(idRemover);
                    JOptionPane.showMessageDialog(null, "Cliente foi removido com sucesso!");
                    break;

                case 3:
                    int idAlterar = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente a ser alterado:"));
                    String novoNome = JOptionPane.showInputDialog("Digite o novo nome do cliente:");
                    String novoFone = JOptionPane.showInputDialog("Digite o novo telefone do cliente:");
                    bancoDeClientes.alterarCliente(idAlterar, novoNome, novoFone);
                    JOptionPane.showMessageDialog(null, "Cliente foi alterado com sucesso!");
                    break;

                case 4:
                    int idListar = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente para listar:"));
                    Cliente cliente = bancoDeClientes.listarCliente(idListar);
                    if (cliente != null) {
                        JOptionPane.showMessageDialog(null, cliente);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não foi encontrado.");
                    }
                    break;

                case 5:
                    bancoDeClientes.listarTodosClientes();
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }

        } while (opcao != 6);
    }
}
