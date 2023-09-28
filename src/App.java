import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = null;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-vindo ao sistema de controle financeiro");
            System.out.println("1- Cadastrar usuário");
            System.out.println("2- Cadastrar conta");
            System.out.println("3- Cadastrar receita");
            System.out.println("4- Cadastrar despesa");
            System.out.println("5- Cadastrar orçamento");
            System.out.println("6- Cadastrar meta");
            System.out.println("7- Cadastrar investimento");
            System.out.println("0- Sair");

            System.out.println("Digite a opção desejada: ");
            int opcao = input.nextInt();

            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                System.out.println("Digite o nome do usuário: ");
                String nome = input.next();
                System.out.println("Digite o email do usuário: ");
                String email = input.next();
                usuario = new Usuario(nome, email);

            } else if (usuario != null) {
                if (opcao == 2) {
                    System.out.println("Digite o nome do banco: ");
                    String banco = input.next();
                    System.out.println("Digite a descrição da conta: ");
                    String descricao = input.next();

                    Conta conta = new Conta(banco, descricao);
                    usuario.addConta(conta);

                } else if (opcao == 3) {
                    System.out.println("Digite o valor da receita: ");
                    double valor = input.nextDouble();
                    System.out.println("Digite a descrição da receita: ");
                    String descricao = input.next();
                    System.out.println("Digite a data da receita: ");
                    String data = input.next();
                    System.out.println("Informe a categoria da receita: ");
                    String categoria = input.next();

                    Receita receita = new Receita(valor, descricao, data, categoria);
                    usuario.addReceita(receita);
                } else if (opcao == 4) {
                    System.out.println("Digite o valor da despesa: ");
                    double valor = input.nextDouble();
                    System.out.println("Digite a descrição da despesa: ");
                    String descricao = input.next();
                    System.out.println("Digite a data da despesa: ");
                    String data = input.next();
                    System.out.println("Informe a categoria da despesa: ");
                    String categoria = input.next();

                    Despesa despesa = new Despesa(valor, descricao, data, categoria);
                    usuario.addDespesa(despesa);
                } else if (opcao == 5) {
                    System.out.println("Digite o valor do orçamento: ");
                    double valor = input.nextDouble();
                    System.out.println("Digite a descrição do orçamento: ");
                    String descricao = input.next();
                    System.out.println("Digite a data do orçamento: ");
                    String data = input.next();
                    System.out.println("Informe a categoria do orçamento: ");
                    String categoria = input.next();

                    Orcamento orcamento = new Orcamento(valor, descricao, data, categoria);
                    usuario.addOrcamento(orcamento);
                } else if (opcao == 6) {
                    System.out.println("Digite o valor da meta: ");
                    double valor = input.nextDouble();
                    System.out.println("Digite a descrição da meta: ");
                    String descricao = input.next();
                    System.out.println("Digite a data da meta: ");
                    String data = input.next();

                    Meta meta = new Meta(valor, descricao, data);
                    usuario.addMeta(meta);
                } else if (opcao == 7) {
                    System.out.println("Digite o valor do investimento: ");
                    double valor = input.nextDouble();
                    System.out.println("Digite a data do investimento: ");
                    String data = input.next();

                    Investimento investimento = new Investimento(valor, data);
                    usuario.addInvestimento(investimento);
                } else {
                    System.out.println("Opção inválida");
                }
            } else {
                System.out.println("Você precisa cadastrar um usuário primeiro");
            }
        }

        input.close();
    }
}