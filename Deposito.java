package Deposito;
import javax.swing.*;
import java.util.ArrayList;

public class Deposito {
    ArrayList<Caixa> caixas = new ArrayList<>();
    public void adicionarCaixa(Caixa caixa) {
        caixas.add(caixa);
        JOptionPane.showMessageDialog(null, "Caixa foi adicionada com sucesso!","Caixa",JOptionPane.INFORMATION_MESSAGE);
    }
    public void removerCaixa(String dono) {
        boolean sucesso =  caixas.removeIf(caixa -> caixa.getDono().equals(dono));
        if (sucesso) {
            JOptionPane.showMessageDialog(null,"Caixa foi removida com sucesso!","Caixa",JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"Caixa mão encontrada!","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    public ArrayList<Caixa> findByDono(String dono) {
        ArrayList<Caixa> caixasEncontradas = new ArrayList<>();

        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equals(dono)) {
                caixasEncontradas.add(caixas.get(i));
            }
        }
        return caixasEncontradas;
    }
    public void exibirCaixasPorDono(String dono) {
        ArrayList<Caixa> caixasEncontradas = findByDono(dono);

        if (caixasEncontradas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "-1", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            StringBuilder caixasInfo = new StringBuilder();
            for (int i = 0; i < caixas.size(); i++) {
                if (caixas.get(i).getDono().equals(dono)) {
                    caixasInfo.append("Índice: ").append(i).append("\n");
                }
            }
            JOptionPane.showMessageDialog(null, caixasInfo, "Caixa Encontrada", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void atualizarCaixa(Caixa caixaNova, String dono) {
        ArrayList<Caixa> caixasDonos = findByDono(dono);

        if (caixasDonos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma caixa foi encontrada para o dono especificado.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            caixas.replaceAll(caixa -> caixa.getDono().equals(dono) ? caixaNova : caixa);
            JOptionPane.showMessageDialog(null, "Caixas do dono: " + dono + " atualizadas com sucesso", "Caixas", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void caixasPesadas(double peso){
        ArrayList<Caixa> caixasEncontradas = new ArrayList<>();
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getPeso() > peso) {}
            caixasEncontradas.add(caixas.get(i));
        }
        JOptionPane.showMessageDialog(null,caixasEncontradas.toString(), "Caixas", JOptionPane.INFORMATION_MESSAGE);
    }

}

