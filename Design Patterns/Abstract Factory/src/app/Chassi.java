package app;

public abstract class Chassi 
{
    private Motor motor;
    
    public void setMotor(Motor motor)
    {
        this.motor = motor;
    }
    
    public Motor getMotor()
    {
        return motor;
    }
}
