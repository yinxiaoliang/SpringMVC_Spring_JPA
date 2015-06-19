package com.integration.infrastructure.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.integration.domain.SysUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/META-INF/application-root.xml")
@ActiveProfiles({ "dev" })
public class SysUserRepositoryTest {
	@Autowired
	SysUserRepository sysUserRepository;

	@Test
	public void testFindAll() {
		List<SysUser> list = sysUserRepository.findAll();
		for(SysUser user:list){
			System.out.println(user.getId()+"======="+user.getPassword());
		}
	}

}
