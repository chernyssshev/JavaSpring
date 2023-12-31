package hibernate_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try{
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Ivan", 6);
//            Child child2 = new Child("Pavel", 4);
//            Child child3 = new Child("Nikita", 5);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done");
// ********************************************************************
//            session = factory.getCurrentSession();

//            Section section1 = new Section("Football");
//            Section section2 = new Section("Basketball");
//            Section section3 = new Section("Volleyball");
//            Child child1 = new Child("Masha", 10);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done");
//*********************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class,1);
//
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//            System.out.println("Done");
//*********************************************************************

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done");
//**********************************************************************
            //перед удалением поменять каскад
            //чтобы сохранить без каскада, сохраняем каждого ребенка отдельно
            //для hibernate type persist and save разные
            //используем Persist

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done");

            session = factory.getCurrentSession();
            
            session.beginTransaction();

            Section section = session.get(Section.class, 7);
            session.delete(section);

            session.getTransaction().commit();
            System.out.println("Done");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
