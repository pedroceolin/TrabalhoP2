
package br.unigran.app.persitencia;
import br.unigran.app.model.Paciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dao {
    EntityManagerFactory emf=
            Persistence.
                    createEntityManagerFactory("br.unigran.app_TrabalhoP2_jar_1.0-SNAPSHOTPU");
    EntityManager em =emf.createEntityManager();
    EntityTransaction etx = em.getTransaction();
    
    public void salvar(Object o){
        etx.begin();
        em.persist(o);
        etx.commit();
    }
    public void atualiza(Object o){
        etx.begin();
        em.merge(o);
        etx.commit();
    }
     public void remove(Object o){
        etx.begin();
        em.remove(o);
        etx.commit();
    }
     
     public void edita(Object o ){
         etx.begin();
         try {
             em.merge(o);
         } catch (Exception e) {
             e.getMessage();
             
         }
     
      etx.commit();
     }
    public List listar(){
        return em.createNativeQuery("select * from pessoa p",Paciente.class)
                .getResultList();
    }
       public List listar(Class c){
        return em.createQuery("select o from "+
        c.getSimpleName()+ " o ")
                .getResultList();
    }
   
    
    
    public List listarOO(){
        return em.createNativeQuery("select p from Pessoa p")
                .getResultList();
    }
    
}
