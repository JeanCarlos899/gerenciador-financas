
public class Conta {
    private String banco;
    private String descricao;
    private List<Receita> receitas = new ArrayList<>();
    private List<Despesa> despesa = new ArrayList<>();

    public Conta(String banco, String descricao) {
        this.banco = banco;
        this.descricao = descricao;
        this.receita = receita;
        this.despesa = despesa;
    }
}