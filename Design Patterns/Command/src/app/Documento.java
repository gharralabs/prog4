package app;

import java.util.Scanner;


public class Documento {

    private final Scanner scanner = new Scanner(System.in);
    
    public Trecho selecionarTrecho()
    {
        int início, término;
        System.out.println("Informe o início do trecho a ser selecionado:");
        início = scanner.nextInt();
        
        System.out.println("Informe o término do trecho a ser selecionado:");
        término = scanner.nextInt();        

        Trecho trecho;
        trecho = new Trecho(início, término);
        
        return trecho;
    }

    public void aplicarNegrito(Trecho trecho)
    {
        System.out.printf("Negrito aplicado ao trecho: (%d, %d) ao documento.\n", 
                          trecho.getInício(), 
                          trecho.getTérmino());
    }

    public void desfazerNegrito(Trecho trecho)
    {
        System.out.printf("Negrito removido do trecho: (%d, %d) ao documento\n", 
                          trecho.getInício(), 
                          trecho.getTérmino());        
    }

    public Imagem localizarImagem()
    {
        System.out.println("Informe o path da imagem:");
        String path;
        path = scanner.next();
        
        System.out.println("Informe a posição no documento:");
        int posicao = scanner.nextInt();
        
        
        return new Imagem(path, posicao);
    }

    public void inserirImagem(Imagem imagem)
    {
        System.out.printf("Imagem %s inserida no documento na posição: %d\n", 
                          imagem.getCaminho(), 
                          imagem.getPosição());
    }

    public void removerImagem(Imagem imagem)
    {
        System.out.printf("Imagem %s removida do documento na posição: %d\n", 
                          imagem.getCaminho(), 
                          imagem.getPosição());
    }

}
