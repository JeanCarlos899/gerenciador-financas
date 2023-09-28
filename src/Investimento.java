public class Investimento {
    private double valor;
    private String data;

    public Investimento(double valor, String data) {
        this.valor = valor;
        this.data = data;
    }

    public double getValor() {
        return this.valor;
    }

    public String getData() {
        return this.data;
    }
}