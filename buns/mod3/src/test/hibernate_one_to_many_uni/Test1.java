package hibernate_one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {

//            session = factory.getCurrentSession();
//            Department dep = new Department("HR", 300, 100);
//            Employee emp1 = new Employee("");
//            Employee emp2 = new Employee("");
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            //удаление такое же каскадное


        }
        finally {
            session.close();
            factory.close();
        }
    }
}
