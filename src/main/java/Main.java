
import entity.db1.Sample;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author eiryu
 */
public class Main {

    public static void main(String[] args) {

        // db1
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();

        tx.begin();
        List<Sample> resultList = entityManager.createQuery("select s from Sample s").getResultList();

        for (Sample sample : resultList) {
            System.out.println(sample.getKey() + "," + sample.getValue());
        }

        tx.commit();

        entityManager.close();
        factory.close();
        
        
        // db2
        EntityManagerFactory factory2 = Persistence.createEntityManagerFactory("pu2");
        EntityManager entityManager2 = factory2.createEntityManager();
        EntityTransaction tx2 = entityManager2.getTransaction();

        tx2.begin();
        List<entity.db2.Sample> resultList2 = entityManager2.createQuery("select s from Sample s").getResultList();

        for (entity.db2.Sample sample : resultList2) {
            System.out.println(sample.getKey() + "," + sample.getValue());
        }

        tx2.commit();

        entityManager2.close();
        factory2.close();
    }
}
