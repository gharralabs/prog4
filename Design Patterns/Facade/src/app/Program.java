package app;


public class Program {

    public static void main(String[] args) 
    {
        
        DvdPlayer dvd = new DvdPlayer();
        
        MaquinaPipoca maquinaPipoca = new MaquinaPipoca();
        maquinaPipoca.ligar();
        maquinaPipoca.estourar();
        
        Luzes luzes = new Luzes();
        luzes.regular(10);
        
        Tela tela = new Tela();
        tela.abaixar();
        
        Projetor projetor = new Projetor();
        projetor.ligar();
        projetor.modoWideScreen();
        projetor.setEntrada(dvd);
        
        Amplificador amp = new Amplificador();
        amp.ligar();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        
        dvd.ligar();
        dvd.tocar(new Dvd());
        
    }

}
