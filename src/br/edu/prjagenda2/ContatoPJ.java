package br.edu.prjagenda2;

public class ContatoPJ extends ContatoBasico {
    private String homepage;
    private String funcionário;

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getFuncionário() {
        return funcionário;
    }

    public void setFuncionário(String funcionário) {
        this.funcionário = funcionário;
    }

    @Override
    public String toString() {
        return super.toString()+
                "" +
                "Homepage='" + homepage + '\'' +
                ", funcionário='" + funcionário + '\'' +
                '}' + '\n';
    }
}
