package BancoClientes;

public class Cliente {
    private String nome;
    private String fone;
    private int id;

    public Cliente(String nome, String fone, int id) {
        this.nome = nome;
        this.fone = fone;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nome='" + nome + "', fone='" + fone + "'}";
    }
}