package org.zerock.web;

import javax.inject.*;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;
import org.zerock.persistence.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception {
		System.out.println(dao.getTime());
	}
	
	/*@Test
	public void testInsertMember() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserid("user000");
		vo.setUserpw("user000");
		vo.setUsername("USER000");
		vo.setEmail("user000@aaa.com");
		
		dao.insertMember(vo);
	}*/
	
	@Test
	public void testReadMember() throws Exception {
		System.out.println(dao.readMember("user00"));
	}
	
	@Test
	public void testReadWithPW() throws Exception {
		System.out.println(dao.readWithPW("user000", "user000"));
	}
	
}
