import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static conta conta = new conta(" ", " ");

    static Saldo saldo = new Saldo();

    String idUser = conta.getId();
    String senhaUser = conta.getSenha();

    public static void main(String[] args) {

    }
    public static void telaIncial() {

        System.out.println("APP para bancos de jogos de tabuleiro");

        System.out.println("1- Crie sua conta");
        System.out.println("2- Entre na sua conta");
        System.out.println("3- Sair");

        System.out.println("Digite a opcao:");

        int op = scanner.nextInt();

        switch (op){
            case 1:
                criarConta();

            case 2:
                entrarNaConta();
            case 3:
                System.out.println("Venha se divertir com seus amigos depois!!");
                System.exit(0);

                break;
        }
    }
    //criando conta
    public static void criarConta() {

        System.out.println("Digite seu ID:");
        String id = scanner.next();

        System.out.println("Digite sua senha:");
        String senha = scanner.next();

        System.out.println("Conta criada com sucesso!");


        conta conta = new conta(id, senha);


        telaIncial();

    }

    public static void entrarNaConta() {

        System.out.println("Digite seu ID:");
        String id = scanner.next();

        System.out.println("Digite sua senha:");
        String senha = scanner.next();

        if (id == id && senha == senha){
            System.out.println("Seja bem vindo!");
            menuPrincipal();
        }else {
            System.out.println("ID ou senha incorretos, tente novamente");
            entrarNaConta();
        }
    }
    public static void menuPrincipal() {

        System.out.println("Seja bem vindo " + conta.getId());

        System.out.println("Selecione uma opcao:");
        System.out.println("1- zerar o saldo");
        System.out.println("2- Depositar");
        System.out.println("3- Transferir");
        System.out.println("4- Sair");

        int op = scanner.nextInt();

        switch (op){
            case 1:

            case 2:
                deposito();

            case 3:
                transferencia();
                System.out.println("Ate mais!");
                System.exit(0);

                break;
        }
        //montar menu de deposito e de transferencia
    }
    public static void deposito() {
        System.out.println("Qual valor deseja depositar?");
        int valor = scanner.nextInt();
        if (saldo != null){
            
        }

        System.out.println("Valor depositado com sucesso!");
    }
    public static void transferencia() {

    }
}
