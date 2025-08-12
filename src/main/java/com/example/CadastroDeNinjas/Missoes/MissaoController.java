package com.example.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissaoController {

    @GetMapping("/lista")
    public String listarMissao(){
        return "Missao listada com sucesso";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criada com sucesso";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada com sucesso";
    }

    @PutMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada com sucesso";
    }
}
