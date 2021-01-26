package chap08.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import chap08.spring.Member;

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
		String id = "id1";
		Member member = new Member();
		member.setId(id);
		member.setUsername("냥냥");
		member.setAge(2);
		em.persist(member);
		
//		수정
		member.setAge(20);
		
		Member findMember = em.find(Member.class,id);
		System.out.println("findMember = " + findMember.getUsername() 
		+ ", age = " + findMember.getAge());
		
		//여기서의 쿼리는 JPQL로 테이블에대해선 알지 못한다. 따라서 클래스명으로 검색한다.
		//이 때 flush()한다
		List<Member> members = em.createQuery("select m from memberDao m",Member.class)
				.getResultList();
		
		System.out.println(members);
		
		System.out.println("members.size = " + members.size());
		
		em.remove(member);
	}

}















