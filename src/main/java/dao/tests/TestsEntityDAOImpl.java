package dao.tests;

import dao.ManageSessionFactory;
import entity.TestsEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TestsEntityDAOImpl implements TestsEntityDAO {

    public List<TestsEntity> findAll() {

        Session session = null;
        List<TestsEntity> testsEntities = null;
        try {
            session = ManageSessionFactory.getFactory().openSession();
            Transaction tx = session.beginTransaction();

            Criteria criteria = session.createCriteria(TestsEntity.class);
            testsEntities = criteria.list();

            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при выборке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {

                session.close();
            }
        }
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
