import java.util.Date;


public class Receita {
    private double valor;
    private String descricao;
    private String categoria;
    private Date data;

    public Receita(double valor, String descricao, String categoria, Date data) {
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
    }

    public double getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public Date getData() {
        return this.data;
    }
}