package app;

public class VolkswagenMontadoraFactory extends MontadoraFactory
{

    @Override
    public Chassi criarChassi() 
    {
        return new VolkswagenChassi();
    }

    @Override
    public Motor criarMotor() 
    {
        return new VolkswagenMotor();
    }
    
}
