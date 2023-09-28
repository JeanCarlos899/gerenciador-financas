public class Receita {
    private double valor;
    private String descricao;
    private String categoria;
    private String data;

    public Receita(double valor, String descricao, String data, String categoria) {
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

    public String getCategoria() {
        return this.categoria;
    }

    public String getData() {
        return this.data;
    }
}