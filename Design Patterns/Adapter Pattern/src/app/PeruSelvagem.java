package app;

public class PeruSelvagem implements Peru 
{
    @Override
    public void gorgolejar() 
    {
        System.out.println("Glu Glu");
    }

    @Override
    public void voar() 
    {
        System.out.println("Voando a uma distância curta");
    }
}