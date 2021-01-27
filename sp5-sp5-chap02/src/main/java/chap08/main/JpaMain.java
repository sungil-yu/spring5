package chap08.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import chap08.spring.Member;
import chap08.spring.Team;

public class JpaMain {

	public static void main(String[] args) {

		// 엔티티 매니저 팩토리 생성
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("spring5");

		// 엔티티 매니저 생성
		EntityManager em = emf.createEntityManager();

		// 트랜잭션하기위해선 트랜잭션 api를 엔티티 매니저로부터 받아와야한다.
		EntityTransaction tx = em.getTransaction();

		try {

			tx.begin();
			logic(em); // 비지니스 로직
			tx.commit(); //이때 플러쉬한다.
		} catch (Exception e) {

			tx.rollback();
		}

	}

	private static void logic(EntityManager em) {
		
	}
	
	
	public void testSave(EntityManager em) {

		Team team1 = new Team("team1", "팀1");
		em.persist(team1);
		
		
		
	}
}















