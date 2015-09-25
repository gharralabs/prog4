package app;

public class PeruAdapter implements Pato 
{
    private Peru peru;
    public PeruAdapter( Peru peru )
    {
        this.peru = peru;
    }
    
    @Override
    public void grasnar() 
    {
        peru.gorgolejar();
    }

    @Override
    public void voar() 
    {
        for( int i = 0; i < 5; i++ )
            peru.voar();
    }
}