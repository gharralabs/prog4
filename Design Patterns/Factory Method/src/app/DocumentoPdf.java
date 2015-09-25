package app;

public class DocumentoPdf implements Documento
{
    @Override
    public void abrir() 
    {
        System.out.println("Mostrando um  documento PDF na tela");
    }   
}