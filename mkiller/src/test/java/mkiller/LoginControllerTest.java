package mkiller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.ahw.mkiller.SpringBootWebApplication;
import br.com.ahw.mkiller.services.AuthService;
import br.com.ahw.mkiller.services.AuthenticatedUser;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringBootWebApplication.class)
@WebAppConfiguration()
@ComponentScan(basePackages="br.com.ahw.mkiller")
public class LoginControllerTest {
	
	@Autowired
	@Qualifier(value="Basic")
	private AuthService authService;
	
	@Test
	public void basicLogin () {
		AuthenticatedUser authenticatedUser = authService.auth();
		
		assertNotNull(authenticatedUser);
	}
}
