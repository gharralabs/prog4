package br.gharralabs.prog4.modelos;
import javax.persistence.*;

public class AutomóvelRepositórioImpl implements AutomóvelRepositório
{
    private final EntityManager entityManager;
    
    public AutomóvelRepositórioImpl()
    {
        EntityManagerFactory factory;
        factory = Persistence.createEntityManagerFactory("mysql-local");
        entityManager = factory.createEntityManager();
    }
    
    @Override
    public Automóvel salvar(Automóvel auto) 
    {
        entityManager.persist(auto);
        return auto;
    }
    
}
