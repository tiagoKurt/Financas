package com.finance.Finance.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.finance.Finance.modelo.entidade.Usuario;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class UsuarioRepositoryTest {
	
	@Autowired
	UsuarioRepository repository;
	
	@Test
	public void deveVerificarAExistenciaDeUmEmail() {
		
		
		Usuario usuario = Usuario.builder().nome("usuario").email("usuario@gmail.com").build();
		repository.save(usuario);
		
		boolean result = repository.existsByEmail("usuario@gmail.com");
		
		Assertions.assertThat(result).isTrue();
		
	}

}
