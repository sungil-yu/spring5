package chap13;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Main {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("spring5");
		EntityManager em = emf.createEntityManager();
		
		List<Object[]> resultList = 
				em.createQuery("SELECT m.username, m. age from Member m")
				.getResultList();
		List<UserDTO> userDTOs = new ArrayList<>();
		
		for(Object[] o : resultList) {
			UserDTO userDTO =new UserDTO((String)o[0],(int)o[1]);
			userDTOs.add(userDTO);			
		}
		
		
		//편하게 NEW명령어를 사용해 객체 변환 작업을 없애보자
		
		TypedQuery<UserDTO> query = em.createQuery("SELECT new chap13.UserDTO(m.username, m.age) FROM Member m"
				,UserDTO.class);
		
		List<UserDTO> resultListS = query.getResultList();
		
		
		//페이징 api
		
		TypedQuery<Member> pagingQuery = em.createQuery(
				"SELECT m FROM Mebmer m ORDER BY m.username DESC" ,Member.class
				);
		
		pagingQuery.setFirstResult(10); //11번부터 시작해서 총 20건의 데이터를 조회한다.
		pagingQuery.setMaxResults(20);
		pagingQuery.getResultList();
		
		
	}
	
}
