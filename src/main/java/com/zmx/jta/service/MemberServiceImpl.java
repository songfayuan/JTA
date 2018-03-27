package com.zmx.jta.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmx.jta.dao.MemberInfoDao;
import com.zmx.jta.dao.MemberDao;
import com.zmx.jta.domain.Member;
import com.zmx.jta.domain.MemberInfo;


@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	//log
	private static final Logger LOG = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private MemberInfoDao memberInfoDao;

	@Override
	public boolean registerMember(Member member, MemberInfo memberInfo) {
		boolean resRegister = false;
		try {
			if(memberDao.insert(member) != 1){
				throw new RuntimeException("注册用户:Member表数据插入不一致.");
			}
			if(memberInfoDao.insert(memberInfo) != 1){
				throw new RuntimeException("注册用户:MemberInfo表数据插入不一致.");
			}
			resRegister = true;
		} catch (Exception e) {
			LOG.info("注册用户:数据库保存异常." + e.getMessage(), e);
			throw new RuntimeException("注册用户:数据库保存异常");
		}
		return resRegister;
	}

}

