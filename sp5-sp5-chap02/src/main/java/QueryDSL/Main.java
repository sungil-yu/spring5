package QueryDSL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysema.query.jpa.impl.JPAQuery;

import chap13.Member;

public class Main {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("spring5");
	
	public static void main(String[] args) {
		
	}
	
	
	public void queryDSL() {
	
		EntityManager em = emf.createEntityManager();
		JPAQuery query = new JPAQuery(em);
		QMember qMember = new QMember("m");
		
		List<Member> members =
				query.from(qMember)
				.where(qMember.name.eq("회원1"))
				.orderBy(qMember.name.desc())
				.list(qMember); //프로젝션 대상
				
	}
}
