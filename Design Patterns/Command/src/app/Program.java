package app;

import java.lang.reflect.Constructor;
import java.util.Scanner;
import java.util.Stack;


public class Program {

    public static void main(String[] args) 
    {        
        Stack<Comando> comandosRealizados;
        comandosRealizados = new Stack<>();
        
        Documento documento;
        documento = new Documento();
        
        Scanner scanner = new Scanner(System.in);
        String comandoStr;
        for(;;)
        {
            System.out.println("1. Executar um comando");
            System.out.println("2. Desfazer um comando");
            int opcao = scanner.nextInt();

            
            switch(opcao)
            {
                case 1:
                    
                    System.out.println("\nInforme um comando: ");
                    comandoStr  =  scanner.next();
            
                    try
                    {
                        Comando cmd;
                        Constructor c = Class.forName("app." + comandoStr + "Comando")
                                             .getConstructor(Documento.class);
                        cmd = (Comando) c.newInstance(documento);

                        cmd.fazer();
                        comandosRealizados.push(cmd);
                    }
                    catch(Exception ex ){
                        System.out.println("Ocorreu um erro ao executar o comando: " 
                                + ex.getMessage());
                    }
                    break;
                    
                case 2:
                    
                    if(! comandosRealizados.isEmpty())
                    {
                        Comando cmd;
                        cmd = comandosRealizados.pop();
                        cmd.desafazer();
                    }
                    break;
            }
            
        }   
    }
}
