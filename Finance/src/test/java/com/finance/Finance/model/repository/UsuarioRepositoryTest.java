package com.finance.Finance.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.finance.Finance.modelo.entidade.Usuario;

//import java.util.Optional;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Profile;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;
//import com.finance.Finance.modelo.entidade.Usuario;
//import com.finance.Finance.service.UsuarioService;
//@RunWith(SpringRunner.class)
//@ActiveProfiles("test")
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)


@RunWith(SpringRunner.class)
public class UsuarioRepositoryTest {
	
	@Autowired
	UsuarioRepository repository;
	
	@Test
	public void deveVerificarAExistenciaDeUmEmail() {
		Usuario usuario = Usuario.builder().nome("usuario").email("usuario@email.com").build();
		repository.save(usuario);
		
		boolean result = repository.existsByEmail("usuario@email.com");
		
		Assertions.assertThat(result).isTrue();
	}
	
//	@Autowired
//	TestEntityManager entityManager;
//	
//	@Autowired
//	UsuarioRepository repository;
//	
//	@Test
//	public void deveValidarEmail() {
//		Usuario usuario = criarUsuario();
//		entityManager.persist(usuario);
//		
//		boolean result = repository.existsByEmail("usuario@email.com");
//		
//		Assertions.assertThat(result).isTrue();
//	}
//	
//	@Test
//	public void deveRetornarFalsoQuandoNaoHouverUsuarioCadastradoComoEmail() {
//		
//		boolean result = repository.existsByEmail("usuario@email.com");
//		
//		Assertions.assertThat(result).isFalse();
//	}
//
//	@Test
//	public void devePersistirUmUsuarioNaBaseDeDados() {
//		Usuario usuario = criarUsuario();
//		
//		Usuario usuarioSalvo = repository.save(usuario);
//		
//		Assertions.assertThat(usuarioSalvo.getId()).isNotNull();
//	}
//	
//	@Test
//	public void deveBuscarUmUsuarioPorEmail() {
//		Usuario usuario = criarUsuario();
//		entityManager.persist(usuario);
//		
//		Optional<Usuario> result = repository.findByEmail("usuario@email.com");
//		
//		Assertions.assertThat(result.isPresent()).isTrue();
//	}
//	
//	@Test
//	public void deveRetornarVazioAoBuscarUsuarioPorEmailQuandoNaoExisteNaBase() {
//		Usuario usuario = criarUsuario();
//		entityManager.persist(usuario);
//		
//		Optional<Usuario> result = repository.findByEmail("usuario@email.com");
//		
//		Assertions.assertThat(result.isPresent()).isFalse();
//	}
//	
//	public static Usuario criarUsuario() {
//		return Usuario
//				.builder()
//				.nome("usuario")
//				.email("usuario@email.com")
//				.senha("senha")
//				.build();
//	}
}
