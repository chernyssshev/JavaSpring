package hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Ivan", "Chernyshev", "IT", 10);
//            Detail detail = new Detail("Ekb", "2281337", "chernyssshev@gmail.com");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Kirill", "Abzharov", "Student", 0);
            Detail detail = new Detail("Zlatoust", "418248", "bog@gmail.com");

            employee.setEmpDetail(detail);
            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();
            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 2);
            // удаление
//            session.delete(emp);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


        }
        finally {
            session.close();
            factory.close();
        }
    }
}
