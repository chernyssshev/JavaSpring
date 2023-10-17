package hibernate_test;

import Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            // поиск по таблице с помощью условий

//            List<Employee> emps = session.createQuery("from Employee").getResultList();

//            List<Employee> emps = session.createQuery("from Employee" +
//                            "where name = 'Ivan'")
//                            .getResultList();

            List<Employee> emps = session.createQuery("from Employee" +
                            "where name = 'Ivan' AND salary>650")
                            .getResultList();

            for (Employee e: emps)
                System.out.println(e);

            session.getTransaction().commit();

            System.out.println("Done!");

        }
        finally {
            factory.close();
        }
    }
}
