package lesson5.entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private SessionFactory factory;

    public StudentDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public Student findById(Long id) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.getTransaction().commit();
            return student;
        }
    }


    @Override
    public List<Student> findAll() {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            List<Student> products = session.createQuery("select st from Student st").getResultList();
            session.getTransaction().commit();
            return products;
        }
    }

    @Override
    public Student findByName(String name) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Student student = session.createQuery("select st from Student st where st.name = :name", Student.class)
                    .setParameter("name", name)
                    .getSingleResult();
            session.getTransaction().commit();
            return student;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            session.createQuery("delete from Student where id = :studentId")
                    .setParameter("studentId", id)
                    .executeUpdate();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override

    public void save(Student student) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void update(Long id, String name) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            student.setName(name);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Long id, double mark) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            student.setMark(mark);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int count() {
        return findAll().size();
    }
}
