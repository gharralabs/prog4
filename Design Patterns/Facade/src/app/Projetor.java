package app;


public class Projetor {
    private DvdPlayer dvd;

    void ligar()
    {
        System.out.println("Projetor ligado");
    }

    void modoWideScreen()
    {
        System.out.println("Modo widescreen ativado");
    }

    void setEntrada(DvdPlayer dvd)
    {
        this.dvd = dvd;
    }

}
