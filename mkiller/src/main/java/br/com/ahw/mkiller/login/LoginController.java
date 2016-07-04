package br.com.ahw.mkiller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.ahw.mkiller.services.AuthService;

@Controller
@RequestMapping("/app")
public class LoginController {
	
	@Autowired
	@Qualifier(value="Basic")
	private AuthService authService;
	
    @RequestMapping("/login")
    public void login() {}
    
    @RequestMapping(method=RequestMethod.POST, value="/login")
    @ResponseBody
    public String doLogin(@RequestParam("login") String login) {
    	
    	authService.auth();
    	
    	System.out.println("Login=" + login);
        return login;
    }    
}
