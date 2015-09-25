package app;

import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        
        System.out.println("Informe o tipo de documento:");
        Scanner scanner;
        scanner = new Scanner(System.in);
        String tipo;
        tipo = scanner.nextLine();
        
        Aplicação myApp = new AplicaçãoImpl();
        Documento p1 = myApp.NovoDocumento(tipo);
    }

}
