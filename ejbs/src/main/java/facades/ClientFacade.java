package facades;

import DAO.Client;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ClientFacade extends BaseFacade {

    public List<Client> getUsers() {
        Session session = openSession();
        List<Client> clients= session.createQuery("FROM Client", Client.class).getResultList();
        session.close();

        return clients;
    }

    public void insert(String userName, String email){
        Session session = openSession();
        Transaction transaction = session.beginTransaction();

        Client client = new Client();
        client.setName(userName);
        client.setEmail(email);
        session.persist(client);

        transaction.commit();
        session.close();
    }
}
