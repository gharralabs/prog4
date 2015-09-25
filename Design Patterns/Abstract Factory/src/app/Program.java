package app;


public class Program {

    public static void main(String[] args) {

        // String nome = "app.VolkswagenMontadoraFactory";
        String nome = "app.ToyotaMontadoraFactory";
        MontadoraFactory factory = MontadoraFactories.obterFabrica(nome);
        Chassi c1 = factory.criarChassi();
        Motor m1 = factory.criarMotor();
        c1.setMotor(m1);
        c1.getMotor().ignição();
        
    }

}
