package dao.questions;

import dao.ManageSessionFactory;
import dao.questions.QuestionsEntityDAO;
import entity.QuestionsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionsEntityDAOImpl implements QuestionsEntityDAO {

    public List<QuestionsEntity> findAll(int testN) {
        Session session = null;
        List<QuestionsEntity> questionsEntities = null;
        try {
            session = ManageSessionFactory.getFactory().openSession();
            Transaction tx = session.beginTransaction();

            questionsEntities = session.createSQLQuery("SELECT * FROM questions WHERE id_tests="+testN)
                    .addEntity(QuestionsEntity.class).list();

            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при выборке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {

                session.close();
            }
        }
        return questionsEntities;
    }

    public QuestionsEntity add(QuestionsEntity testsEntity) {
        return null;
    }

    public QuestionsEntity save(QuestionsEntity testsEntity) {
        return null;
    }

    public void delete(QuestionsEntity testsEntity) {

    }
}
