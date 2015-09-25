package app;

public class PatoSelvagem implements Pato
{
    @Override
    public void grasnar() 
    {
        System.out.println("Qua Qua!");
    }

    @Override
    public void voar() {
        System.out.println("Estou voando!!!");
    }
}
