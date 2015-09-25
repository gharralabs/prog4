package app;


public class Program {

   public static void main(String[] args) 
    {
        ProcessadorPato processador;
        processador = new ProcessadorPato();
        
        Pato pato = new PatoSelvagem();
        processador.processar(pato);
        
        Peru peru = new PeruSelvagem();
        Pato peruAdapter = new PeruAdapter(peru);
        processador.processar(peruAdapter);
    }
}
