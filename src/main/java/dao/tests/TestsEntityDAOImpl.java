package dao.tests;

import entity.TestsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class TestsEntityDAOImpl implements TestsEntityDAO {

        public List<TestsEntity> findAll() {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        List idList = session.createQuery("select id from TestsEntity").list();
        List nameList = session.createQuery("select name from TestsEntity").list();
        List<TestsEntity> testsEntities = new ArrayList<TestsEntity>();
        TestsEntity testsEntity = null;
        int j = 0;
        for(int i=0; i < idList.size(); i++) {
            while (j < nameList.size()) {
                testsEntity = new TestsEntity(Integer.parseInt(idList.get(i).toString()), nameList.get(j).toString());
                testsEntities.add(testsEntity);
                j++;
                break;
            }
        }
        tx.commit();
        session.close();
        return testsEntities;
    }

    public TestsEntity add(TestsEntity testsEntity) {
        return null;
    }

    public TestsEntity save(TestsEntity testsEntity) {
        return null;
    }

    public void delete(TestsEntity testsEntity) {

    }
}
