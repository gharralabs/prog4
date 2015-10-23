package br.gharralabs.prog4.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Automóvel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int anoFabricação;
    
    @Column(nullable=false, length = 8)
    private String placa;
    
    @ManyToOne
    private Modelo modelo;

    
    public Modelo getModelo()
    {
        return modelo;
    }

    public void setModelo(Modelo modelo)
    {
        this.modelo = modelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAnoFabricação() {
        return anoFabricação;
    }

    public void setAnoFabricação(int anoFabricação) {
        this.anoFabricação = anoFabricação;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
