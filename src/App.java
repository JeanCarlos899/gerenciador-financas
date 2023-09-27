import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = null;
        Scanner input = new Scanner(System.in);

        while (true){
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
            }else if (opcao == 1) {
                System.out.println("Digite o nome do usuário: ");
                String nome = input.next();
                System.out.println("Digite o email do usuário: ");
                String email = input.next();
                usuario = new Usuario(nome, email);

            }else if (opcao == 2) {
                System.out.println("Digite o nome do banco: ");
                String banco = input.next();
                System.out.println("Digite a descrição da conta: ");
                String descricao = input.next();

                Conta conta = new Conta(banco, descricao);
                usuario.addConta(conta);

            }else if (opcao == 3) {
                System.out.println("Digite o valor da receita: ");
                double valor = input.nextDouble();
                System.out.println("Digite a descrição da receita: ");
                String descricao = input.next();
                System.out.println("Digite a data da receita: ");
                String data = input.next();
                System.out.println("Informe a categoria da receita: ");
                String categoria = input.next();

                Receita receita = new Receita(valor, descricao, categoria, data);
                usuario.addReceita(receita);
                
                

        }
    }
    }
}