package com.zmx.jta.service;

import com.zmx.jta.domain.Member;
import com.zmx.jta.domain.MemberInfo;

public interface MemberService {
	
	boolean registerMember(Member member, MemberInfo memberInfo);  

}
