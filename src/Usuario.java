import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private List<Conta> contas = new ArrayList<>();
    private List<Orcamento> orcamentos = new ArrayList<>();
    private List<Meta> metas = new ArrayList<>();
    private List<Investimento> investimentos = new ArrayList<>();
    private List<Receita> receitas = new ArrayList<>();
    private List<Despesa> despesas = new ArrayList<>();

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    public void addReceita(Receita receita) {
        this.receitas.add(receita);
    }
    
    public void addDespesa(Despesa despesa) {
        this.despesas.add(despesa);
    }

    public void addOrcamento(Orcamento orcamento) {
        this.orcamentos.add(orcamento);
    }

    public void addMeta(Meta meta) {
        this.metas.add(meta);
    }

    public void addInvestimento(Investimento investimento) {
        this.investimentos.add(investimento);
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public String getNome() { 
        return this.nome; 
    }

    public String getEmail() { 
        return this.email; 
    }

    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<Conta> getContas() {
        return this.contas;
    }

    public List<Orcamento> getOrcamentos() {
        return this.orcamentos;
    }

    public List<Meta> getMetas() {
        return this.metas;
    }

    public List<Investimento> getInvestimentos() {
        return this.investimentos;
    }

    public List<Receita> getReceitas() {
        return this.receitas;
    }

    public List<Despesa> getDespesas() {
        return this.despesas;
    }

    public double getSaldo() {
        double saldo = 0;
        for (Conta conta : this.contas) {
            saldo += conta.getSaldo();
        }
        return saldo;
    }

    public double getSaldoReceitas() {
        double saldo = 0;
        for (Receita receita : this.receitas) {
            saldo += receita.getValor();
        }
        return saldo;
    }

    public double getSaldoDespesas() {
        double saldo = 0;
        for (Despesa despesa : this.despesas) {
            saldo += despesa.getValor();
        }
        return saldo;
    }
    
    public double getSaldoOrcamentos() {
        double saldo = 0;
        for (Orcamento orcamento : this.orcamentos) {
            saldo += orcamento.getValor();
        }
        return saldo;
    }

    public double getSaldoMetas() {
        double saldo = 0;
        for (Meta meta : this.metas) {
            saldo += meta.getValor();
        }
        return saldo;
    }

    public double getSaldoInvestimentos() {
        double saldo = 0;
        for (Investimento investimento : this.investimentos) {
            saldo += investimento.getValor();
        }
        return saldo;
    }
}