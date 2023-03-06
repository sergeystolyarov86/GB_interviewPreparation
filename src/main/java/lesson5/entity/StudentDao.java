package lesson5.entity;

import java.util.List;

public interface StudentDao {
    Student findById(Long id);

    List<Student> findAll();

    Student findByName(String name);

    void deleteById(Long id);

    void save(Student student);

    void update(Long id, String name);
    void update(Long id, double mark);
    int count();
}
