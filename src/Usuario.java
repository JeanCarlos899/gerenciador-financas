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

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    public void addReceita(Receita receita) {
        this.receitas.add(receita);
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
}