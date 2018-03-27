package com.zmx.jta.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zmx.jta.domain.Member;
import com.zmx.jta.domain.MemberInfo;
import com.zmx.jta.service.MemberService;
import com.zmx.jta.test.JTATest;

@Controller
public class JTATestController {
	
	//log
	private static final Logger LOG = LoggerFactory.getLogger(JTATest.class);
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/register")
	public String testRegister(){    
		Member member = new Member();
		member.setId(5);
		member.setUsername("童可可");   
		member.setPassword("12345678");
		member.setStatus(0);
		
		MemberInfo memberInfo = new MemberInfo();
		memberInfo.setId(5);
		memberInfo.setAge(25);
		memberInfo.setNickname("keke");
		memberInfo.setRealname("童可可");
		if(memberService.registerMember(member, memberInfo)){
			LOG.info("##用户注册成功");
			return "success";
		}else{
			LOG.info("##用户注册失败");
			return "error";
		}
	}       
	
	

}
