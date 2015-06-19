package integration.apllication;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.integration.application.service.SysUserService;
import com.integration.domain.SysUser;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/META-INF/application-root.xml")
@ActiveProfiles({ "dev" })
public class SysUserServiceTest {
	@Autowired
	SysUserService sysUserService;

	@Test
	public void testFindSysUserById() {
		List<SysUser> list = sysUserService.findAll();
		for(SysUser user:list){
			System.out.println(user.getId()+"======="+user.getPassword());
		}
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

}
