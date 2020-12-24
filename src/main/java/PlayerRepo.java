import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class PlayerRepo {

    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Player.class);
        return configuration.buildSessionFactory();
    }

    protected void savePlayer(Player player) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(player);
        session.getTransaction().commit();
        getSessionFactory().close();
    }

    protected Player getPlayerById(int id) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Player player = session.get(Player.class, id);
        session.getTransaction().commit();
        return player;
    }

    protected List<Player> getAllPlayers() {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query getAll = session.createQuery("from Player");
        return getAll.list();
    }
}
