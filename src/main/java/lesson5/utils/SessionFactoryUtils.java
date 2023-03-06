package lesson5.utils;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtils {
    private static SessionFactory sessionFactory;

    private static void buildSessionFactory() {
        try {
            Configuration config = new Configuration();
            config.configure();
            sessionFactory = config.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) buildSessionFactory();
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }

}
