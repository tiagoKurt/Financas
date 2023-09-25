package com.finance.Finance.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.Finance.modelo.entidade.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
	
}
