public class Despesa {
    private double valor;
    private String descricao;
    private String categoria;
    private String data;

    public Despesa(double valor, String descricao, String categoria, String data) {
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
    }
}