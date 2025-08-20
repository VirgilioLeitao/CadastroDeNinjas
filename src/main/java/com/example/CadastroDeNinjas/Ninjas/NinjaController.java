package com.example.CadastroDeNinjas.Ninjas;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja) {
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso: " + novoNinja.getName() + " (ID) : " + novoNinja.getId());
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping ("/listar")
    public ResponseEntity<List<NinjaDTO>> listarNinjas() {
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas);
    }

    // Mastrar ninja por id (READ)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjaPorId(@PathVariable Long id ){
            NinjaDTO ninja = ninjaService.ListarNinjasPorId(id);

            if (ninja !=  null) {
                return ResponseEntity.ok(ninja);
            }else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Ninja com o Id: " + id + " nao existe na aplicacao");
            }
    }

    // Alterar dadosidos ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarNinjaPorId (@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado) {
        NinjaDTO ninja = ninjaService.atualizarNinja(id, ninjaAtualizado);

        if (ninja != null) {
            return ResponseEntity.ok(ninja);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com o Id: " + id + " nao existe na aplicacao");
        }
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinjaPorId(@PathVariable Long id){

        if (ninjaService.ListarNinjasPorId(id) !=  null) {
            ninjaService.deletarNinjaPorId(id);
            return ResponseEntity.ok("Ninja com o ID " + id + " apagado com sucesso");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O ninja com o ID " + id + " nao existe");
        }


    }

}
