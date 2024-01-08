package com.example1.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example1.demo1.model.Registro;
import com.example1.demo1.repository.RegistroRepository;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiRegistro")
public class RegistroController {

    @Autowired
    RegistroRepository regctrl;

    @GetMapping("/exibirRegistros")
    public List<Registro> exibirRegistros() {
        return regctrl.findAll();}

    @GetMapping("/exibirRegistroPorCodFunc/{codFunc}")
    public Optional<Registro> exibirFuncionarioPorCodFunc(@PathVariable(value="codFunc")int codFunc){
    return regctrl.findById(codFunc);
    }

    @PostMapping("/inserirRegistro")
    public void inserirRegistro(@RequestBody Registro registro) {
        regctrl.save(registro);
    }

    @PutMapping("/atualizarRegistro")
    public void atualizarRegistro(@RequestBody Registro horaEntrada){
        regctrl.save(horaEntrada);
    }

    @DeleteMapping("/deletarRegistroPorCodigo/{numRegistro}")
    public void deletarRegistroPorCodigo(
            @PathVariable("numRegistro") int numRegistro){
        regctrl.deleteById(numRegistro);
    }
    
}
