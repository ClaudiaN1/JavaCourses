package facades;

import DAO.User;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class UserFacade extends BaseFacade {

    public User login(String userName, String password) {
        Session session = openSession();                
        Query<User> query = session.createQuery("FROM User WHERE userName = :userName",User.class );
        query.setParameter("userName", userName);            
        User user = query.getSingleResult();                    
        if(!user.getPassword().equals(password)){
            user = null;
        }
        session.close();

        return user;
    }
}
