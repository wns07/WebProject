package org.zerock.persistence;

import javax.inject.*;

import org.apache.ibatis.session.*;
import org.springframework.stereotype.*;
import org.zerock.domain.*;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "org.zerock.mapper.MemberMapper";

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + ".insertMember", vo);
	}

}
