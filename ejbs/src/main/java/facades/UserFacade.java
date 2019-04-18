package facades;

import DAO.User;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class UserFacade extends BaseFacade {

    public User login(String userName, String password) {
        Session session = openSession();               // am deschis o sesiune
        Query<User> query = session.createQuery("FROM User WHERE userName = :userName",User.class );
        query.setParameter("userName", userName);            //setam parametru
        User user = query.getSingleResult();                   //executam query ul
        if(!user.getPassword().equals(password)){
            user = null;
        }
        session.close();

        return user;
    }
}
