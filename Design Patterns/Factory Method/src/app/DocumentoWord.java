package app;

public class DocumentoWord implements Documento
{
    @Override
    public void abrir() 
    {
        System.out.println("Mostrando um documento word na tela");
    }
}