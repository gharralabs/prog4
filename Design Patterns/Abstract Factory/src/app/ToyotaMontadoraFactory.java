package app;

public class ToyotaMontadoraFactory extends MontadoraFactory
{
    @Override
    public Chassi criarChassi() 
    {
        return new ToyotaChassi();
    }

    @Override
    public Motor criarMotor() 
    {
        return new ToyotaMotor();
    }    
}