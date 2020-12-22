import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
}
