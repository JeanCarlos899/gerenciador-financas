import java.util.Date;

public class Orcamento {
    private double valor;
    private String descricao;
    private Date data;

    public Orcamento(double valor, String descricao, Date data) {
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
    }

    public double getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Date getData() {
        return this.data;
    }
}