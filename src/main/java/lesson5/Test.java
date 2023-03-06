package lesson5;

import lesson5.entity.Student;
import lesson5.entity.StudentDao;
import lesson5.entity.StudentDaoImpl;
import lesson5.utils.SessionFactoryUtils;
import org.hibernate.SessionFactory;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        SessionFactory factory = SessionFactoryUtils.getSessionFactory();
        StudentDao studentDao = new StudentDaoImpl(factory);


        Random random = new Random();
        for (int i = 1; i < 1001; i++) {
            studentDao.save(new Student("Student-"+i, random.nextInt(5)));
        }
        System.out.println("Студентов в базе- "+studentDao.count());
        System.out.println(studentDao.findAll());
        studentDao.deleteById(2l);
        System.out.println("Студентов в базе после удаления- "+studentDao.count());
        studentDao.update(1l,"Vasya");
        studentDao.update(1l,5.0);
        System.out.println(studentDao.findById(1l));



    }
}



