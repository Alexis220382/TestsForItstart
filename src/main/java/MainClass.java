import dao.questions.QuestionsEntityDAOImpl;
import dao.tests.TestsEntityDAOImpl;
import entity.QuestionsEntity;
import entity.TestsEntity;

public class MainClass {

    public static void main(String[] args){

        TestsEntityDAOImpl testsEntityDAO = new TestsEntityDAOImpl();
        QuestionsEntityDAOImpl questionsEntityDAO = new QuestionsEntityDAOImpl();

        for(TestsEntity test : testsEntityDAO.findAll()){
            System.out.println(test.getId()+" "+test.getName());
        }

        for(QuestionsEntity entity : questionsEntityDAO.findAll(2)){
            System.out.println(entity.getId() + " " + entity.getName());
        }
    }
}
