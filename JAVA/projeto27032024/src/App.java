import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Cliente objCliente = new Cliente();
        
        System.out.println("Digite o seu nome: ");
        objCliente.nome = ler.next();

        System.out.println("Digite o seu CPF: ");
        objCliente.cpf = ler.next();

        System.out.println("Digite o seu RG: ");
        objCliente.rg = ler.next();

        System.out.println("Digite o seu Email: ");
        objCliente.email = ler.next();

        System.out.println("Digite o seu Telefone: ");
        objCliente.telefone = ler.next();

        System.out.println(objCliente.mostrar());
        
        Cliente obj2 = new Cliente();
        obj2.cadastrar();


        ler.close();
    }
    
}
