package dao.tests;

import entity.TestsEntity;

import java.util.List;

public interface TestsEntityDAO {

    // Найти все тесты.
    public List<TestsEntity> findAll();

    // Добавить тесты.
    public TestsEntity add(TestsEntity testsEntity);

    // Обновить тесты.
    public TestsEntity save(TestsEntity testsEntity);

    // Удалить тест.
    public void delete(TestsEntity testsEntity);

}
