public class Orcamento {
    private double valor;
    private String descricao;
    private String data;
    private String categoria;

    public Orcamento(double valor, String descricao, String data, String categoria) {
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
        this.categoria = categoria;
    }

    public double getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getData() {
        return this.data;
    }

    public String getCategoria() {
        return this.categoria;
    }
}