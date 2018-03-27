package com.zmx.jta.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zmx.jta.domain.Member;
import com.zmx.jta.domain.MemberInfo;
import com.zmx.jta.service.MemberService;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class JTATest{
	
	//log
	private static final Logger LOG = LoggerFactory.getLogger(JTATest.class);
	
	@Autowired
	private MemberService memberService;
	
	@Test
	public void testRegister(){    
		Member member = new Member();
		member.setId(3);
		member.setUsername("童可可");   
		member.setPassword("12345678");
		member.setStatus(0);
		
		MemberInfo memberInfo = new MemberInfo();
		memberInfo.setId(3);
		memberInfo.setAge(25);
		memberInfo.setNickname("keke");
		memberInfo.setRealname("童可可");
		if(memberService.registerMember(member, memberInfo)){
			LOG.info("##用户注册成功");
		}else{
			LOG.info("##用户注册失败");
		}
	}       
	

	
	
}

