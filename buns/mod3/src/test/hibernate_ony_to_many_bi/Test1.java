package hibernate_ony_to_many_bi;

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
//            Department dep = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee();
//            Employee emp2 = new Employee();
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.save(dep);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//************************************************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//*************************************************************************************
//            //двусторонняя связь
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//***********************************************************************************
            //перед удалением поменять CascadeType.All на {CascadeType.PERSIST, CascadeType.DETACH,
            //            CascadeType.MERGE, CascadeType.REFRESH} чтобы удалить одного работника по ID
            //иначе каскадное удаление

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 4);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// ************************************************************************************

            //тестирую типы загрузки Eager и Lazy

            session = factory.getCurrentSession();

            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 5);

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Подгрузим работников");
            department.getEmps().get(0);

            session.getTransaction().commit();

            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());
            System.out.println("Done!");

            //*********************************************************************************
//            session = factory.getCurrentSession();
//            Department dep = new Department("Sales", 2200, 1500);
//            Employee emp1 = new Employee();
//            Employee emp2 = new Employee();
//            Employee emp3 = new Employee();
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.save(dep);
//
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
