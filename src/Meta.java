import java.util.Date;

public class Meta {
    private double valor;
    private String descricao;
    private Date data;

    public Meta(double valor, String descricao, Date data) {
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