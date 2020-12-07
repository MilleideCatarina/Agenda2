package br.edu.prjagenda2;


public abstract class ContatoBasico {
    private String nome;
    private String email;
    private int telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "{" +
                "nome=' "+ nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                ',';
    }
}

