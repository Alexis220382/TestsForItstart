package dao.result;

import entity.ResultEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ResultEntityDAOImpl implements ResultEntityDAO {

    public List<ResultEntity> findAll() {
        return null;
    }

    public ResultEntity add(int id_questions, String login, String name) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setId_questions(id_questions);
        resultEntity.setLogin(login);
        resultEntity.setName(name);
        session.save(resultEntity);
        tx.commit();
        session.close();
        return null;
    }

    public ResultEntity save(ResultEntity resultEntity) {
        return null;
    }

    public void delete(ResultEntity resultEntity) {

    }
}
