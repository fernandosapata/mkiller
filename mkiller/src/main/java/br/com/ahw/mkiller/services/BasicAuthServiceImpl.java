package br.com.ahw.mkiller.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Basic")
public class BasicAuthServiceImpl implements AuthService {
	public AuthenticatedUser auth () {	
		System.out.println("Aqui na implementação do serviço de autenticação");
		return new AuthenticatedUser();
	}
}
