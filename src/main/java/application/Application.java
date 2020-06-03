package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Item;
import model.LevelElementId;
import model.Orc;
import model.Personage;
import model.User;

public class Application {

    public static void main(String[] args) {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("personage");
	EntityManager em = emf.createEntityManager();
	EntityTransaction transaction = em.getTransaction();

	User user = new User();
	user.setLogin("login");
	Personage orc = new Orc();
	orc.setName("orc");
	user.getPersonages().add(orc);
	
	
	LevelElementId levelElementId = new LevelElementId("levelId", "level");
	Item item = new Item(levelElementId);
	
	System.out.println(item);

	em.persist(user);
	em.persist(orc);
	em.persist(levelElementId);

	transaction.commit();

	System.out.println(user.toString());

    }

}
