package org.zerock.persistence;

import org.zerock.domain.*;

public interface MemberDAO {
	public String getTime();
	public void insertMember(MemberVO vo);
}
