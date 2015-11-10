package dao.tests;

import entity.TestsEntity;

import java.util.List;

public interface TestsEntityDAO {

    // ����� ��� �����.
    public List<TestsEntity> findAll();

    // �������� �����.
    public TestsEntity add(TestsEntity testsEntity);

    // �������� �����.
    public TestsEntity save(TestsEntity testsEntity);

    // ������� ����.
    public void delete(TestsEntity testsEntity);

}
