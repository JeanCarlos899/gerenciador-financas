import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String banco;
    private String descricao;
    private List<Receita> receitas = new ArrayList<>();
    private List<Despesa> despesa = new ArrayList<>();

    public Conta(String banco, String descricao) {
        this.banco = banco;
        this.descricao = descricao;
    }

    public void addReceita(Receita receita) {
        this.receitas.add(receita);
    }

    public void addDespesa(Despesa despesa) {
        this.despesa.add(despesa);
    }

    public double getSaldo() {
        double saldo = 0;
        for (Receita receita : receitas) {
            saldo += receita.getValor();
        }
        for (Despesa despesa : despesa) {
            saldo -= despesa.getValor();
        }
        return saldo;
    }

    public String getBanco() {
        return banco;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public List<Despesa> getDespesa() {
        return despesa;
    }
}