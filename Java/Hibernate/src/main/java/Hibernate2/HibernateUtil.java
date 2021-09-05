package Hibernate2;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        Configuration cfg = new Configuration().configure("hibernate2.cfg.xml");
        cfg.addAnnotatedClass(User.class);
        cfg.addAnnotatedClass(Auto.class);


        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());

        sessionFactory = cfg.buildSessionFactory(builder.build());
    }


    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
