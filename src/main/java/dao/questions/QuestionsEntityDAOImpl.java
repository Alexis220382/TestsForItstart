package dao.questions;

import dao.questions.QuestionsEntityDAO;
import entity.QuestionsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class QuestionsEntityDAOImpl implements QuestionsEntityDAO {

    public List<QuestionsEntity> findAll(int testN) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        List idList = session.createQuery("select id from QuestionsEntity where id_tests="+testN).list();
        List id_testsList = session.createQuery("select id_tests from QuestionsEntity where id_tests="+testN).list();
        List nameList = session.createQuery("select name from QuestionsEntity where id_tests="+testN).list();
        List<QuestionsEntity> questionsEntities = new ArrayList<QuestionsEntity>();
        QuestionsEntity questionsEntity = null;
        int j = 0, k =0;
        for(int i=0; i < idList.size(); i++) {
            while (j < id_testsList.size()) {
                while (k < nameList.size()) {
                    questionsEntity = new QuestionsEntity(
                            Integer.parseInt(idList.get(i).toString()),
                            Integer.parseInt(id_testsList.get(j).toString()),
                            nameList.get(k).toString());
                    questionsEntities.add(questionsEntity);
                    k++;
                    break;
                }
                j++;
                break;
            }
        }
        tx.commit();
        session.close();
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
