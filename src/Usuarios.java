import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {

    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        Dados usuario = new Dados();
        
        System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS\n");
        
        System.out.print("Digite os dados: "+"\n\nNome = ");
        
        usuario.setNome(scan.nextLine());
        
        System.out.print("Telefone = (64) ");
        
        usuario.setTelefone(scan.nextLine());
        
        System.out.print("E-mail = ");
        
        usuario.setEmail(scan.nextLine());
        
        System.out.print("Endereço = ");
        
        usuario.setEndereco(scan.nextLine());
        
        System.out.print("CPF = ");
        
        usuario.setCpf(scan.nextLong());
        
        usuario.getStatus();
           
     }
}

