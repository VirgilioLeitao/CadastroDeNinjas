package com.example.CadastroDeNinjas.Ninjas;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem de teste nessa rota";
    }

    // Adicionar ninjas (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping ("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mastrar ninja por id (READ)
    @GetMapping("/todosID")
    public String nestrarTodosOsNinjasPorId(){
            return "Mostrar Ninja por id";
    }

    // Alterar dadosidos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId () {
        return "Alterar Ninja por id";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletade por id";
    }

}
