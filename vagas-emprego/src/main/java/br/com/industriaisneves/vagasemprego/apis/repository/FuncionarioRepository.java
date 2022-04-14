package br.com.industriaisneves.vagasemprego.apis.repository;

import br.com.industriaisneves.vagasemprego.apis.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Long>{

}
