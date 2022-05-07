package br.com.industriaisneves.vagasemprego.apis.services;
import br.com.industriaisneves.vagasemprego.apis.model.Funcionario;
import br.com.industriaisneves.vagasemprego.apis.repository.FuncionarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServices {
    //seria outro Desing Pattern onde há somente a regra de negócio e não tem acesso direto ao banco de dados.
    private final FuncionarioRepository funcionarioRepository;
    public FuncionarioServices(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }
    public List<Funcionario> getFuncionario(){
        return  (funcionarioRepository.findAll());
    }
}
