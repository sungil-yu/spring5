package chap13;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Entity
public class Member {

	@Column(name = "name")
	private String username;
	
	
	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("spring5");
		EntityManager em = emf.createEntityManager();
		
		//QueryDSL 다만 의존설정과 플러그인 설정이 필요한데 이부분은 어노테이션 프로세서기능을 사용하여 queryDSL이사용할 전용클래스를 생성한다.
//		JPAQuery query = new JPAQuery(em);
//		QMember member = QMember.member;
//		String jpql = "select m from Member as m where m.username = 'sung'";
		//criteria 
		/*
		 * CriteriaBuilber cb = em.getCriteriaBuilder();
		 * CriteriaQuery<Member> query = cb.createQuery(Member.class);
		 * Root<Member> m = query.from(Member.class);
		 * 
		 * CriteriaQuery<Member> cq = 
		 * 	query.select(m).where(cb.equal(m.get("username"), "sung"));
		 * List<Member> resultLit = em.createQuery(cq).getResultList();
		 *  */
		
		//jpql을 이용한 구체적인 조회
//		List<Member> resultList = em.createQuery(jpql,Member.class).getResultList();
	}
}
