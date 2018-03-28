import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class testSuperHero {
    public static void main(String a[])
    {
        Properties prop = new Properties();
        prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        prop.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        prop.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/mydb");

        prop.setProperty("hibernate.connection.username", "root");
        prop.setProperty("hibernate.connection.password", "");
        prop.setProperty("hibernate.hbm2ddl.auto", "create");
        prop.setProperty("hibernate.show_sql", "true");

        Configuration cfg = new Configuration();

        cfg.addResource("Student.hbm.xml");
        cfg.setProperties(prop);
        SessionFactory factory = cfg.buildSessionFactory();

//        Session session = factory.openSession();
//        Transaction t = session.beginTransaction();
//        SuperHero superHero = new SuperHero();
//        String name = "Batman";
//        superHero.setName(name);
//        String weakness = "no real powers";
//        superHero.setWeakness(weakness);
//        t.commit();

        factory.close();

    }
}