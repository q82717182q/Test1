package com.programcreek.helloworld.dao;

import com.programcreek.helloworld.model.Member;

//這啥
public interface MemberDao {

	Member getMember(Integer memberId);

	void createMember(Member member);

	void deleteMember(Member member);

}
