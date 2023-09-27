import java.util.Date;

public class Investimento {
    private double valor;
    private Date data;

    public Investimento(double valor, Date data) {
        this.valor = valor;
        this.data = data;
    }

    public double getValor() {
        return this.valor;
    }

    public Date getData() {
        return this.data;
    }
}