package chap10;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		// 엔티티 매니저 팩토리 생성
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("spring5");

				// 엔티티 매니저 생성
				EntityManager em = emf.createEntityManager();
					//IDCLASS
				Parent parent = new Parent();
					
				parent.setId1("id1");
				parent.setId2("id2");
				parent.setName("parentName");
				em.persist(parent);
				
				
				//EMBEDDED
				Parent parent3 = new Parent();
				ParentId parentId2 = new ParentId("myid1", "myid2");
				parent.setId(parentId2);
				parent.setName("NAME");
				em.persist(parent3);
				Parent parent4 = em.find(Parent.class, parentId2);
			
				
				
				ParentId parentId = new ParentId();
				Parent parent2 = em.find(Parent.class, parentId);
				
				
				// 트랜잭션하기위해선 트랜잭션 api를 엔티티 매니저로부터 받아와야한다.
				EntityTransaction tx = em.getTransaction();

		
	}

}
