import DAO.Author;
import DAO.Book;
import DAO.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DBTest {
    private SessionFactory sessionFactory;

    public DBTest() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        MetadataSources sources = new MetadataSources(registry);
        Metadata metadata = sources.getMetadataBuilder().build();
        sessionFactory = metadata.getSessionFactoryBuilder().build();
    }

    public void insertUser() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = new User("Larisa", "e@e.com", "RO");
        session.persist(user);  //se pune in baza de date
        transaction.commit();
        session.close();
    }

    public void updateUser() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.find(User.class, 1);
        user.setName("M");
        transaction.commit();
        session.close();
    }

    public void deleteUser() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.find(User.class, 7);
        session.delete(user);
        transaction.commit();
        session.close();
    }


    public void testMerge() {
        Session session = sessionFactory.openSession();
        DAO.User user = session.find(User.class, 1);
        session.clear();
        Transaction t = session.beginTransaction();
        user.setName("Flavia");
        session.merge(user);
        t.commit();
        session.close();
    }

    public void checkPostLoad() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.find(User.class, 1);
        System.out.println("age = 29 " + user.getAge());
        transaction.commit();
        session.close();
    }

    public void checkOneToOne() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.find(User.class, 1);
        System.out.println("Address city: " + user.getAddress().getCity());
        transaction.commit();
        session.close();
    }

    public void checkOneToMany() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.find(User.class, 1);
        for (Book b : user.getBooks())
            System.out.println("Get titlu " + b.getTitle());
        transaction.commit();
        session.close();
    }


    public void checkManyToMany() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.find(User.class,1);
        for( Book b: user.getBooks())
        {
            for(Author a : b.getAuthors())
            {
                System.out.println(a.getName());
            }
        }
        transaction.commit();
        session.close();
    }

}

