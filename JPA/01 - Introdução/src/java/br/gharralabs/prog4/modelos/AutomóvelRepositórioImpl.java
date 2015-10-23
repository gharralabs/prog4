package br.gharralabs.prog4.modelos;
import java.util.List;
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
        entityManager.getTransaction().begin();
        entityManager.persist(auto);
        entityManager.getTransaction().commit();
        return auto;
    }

    @Override
    public List<Modelo> obterModelos()
    {
        String consulta = "select m from Modelo as m";
        
        Query query;
        query = entityManager.createQuery(consulta);
        List<Modelo> modelos;
        modelos = query.getResultList();
        return modelos;
    }
    
}
