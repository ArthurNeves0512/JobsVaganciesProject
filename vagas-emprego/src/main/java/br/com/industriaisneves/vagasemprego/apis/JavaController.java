package br.com.industriaisneves.vagasemprego.apis;

import br.com.industriaisneves.vagasemprego.apis.model.Funcionario;
import br.com.industriaisneves.vagasemprego.apis.services.FuncionarioServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JavaController {
    private final FuncionarioServices funcionarioServices;
    public JavaController(FuncionarioServices funcionarioServices){
        this.funcionarioServices = funcionarioServices;
    }
    @GetMapping(path = "/Goku")
    public  String hello(){
        return "oi, eu sou o goku";
    }
    @PostMapping(path ="vegeta")
    public String hello2(){return "oi, eu sou o vegeta";}
    @PutMapping(path = "picolo")
    public String hello3() {return "oi eu sou o picolo";}
    @DeleteMapping(value ="kuririm")
    public String hello4() {return "oi eu sou o kuririm";}
    @GetMapping(value = "funcionarios")
    public ResponseEntity<List<Funcionario>> getFuncionarios(){
        return ResponseEntity.ok(funcionarioServices.getFuncionario());
    }
}
