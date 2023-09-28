public class Meta {
    private double valor;
    private String descricao;
    private String data;

    public Meta(double valor, String descricao, String data) {
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

    public String getData() {
        return this.data;
    }
}