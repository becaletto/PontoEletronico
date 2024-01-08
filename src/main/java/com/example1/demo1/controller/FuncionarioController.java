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
import com.example1.demo1.model.Funcionario;
import com.example1.demo1.repository.FuncionarioRepository;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiFuncionario")
public class FuncionarioController {

@Autowired
FuncionarioRepository funcctrl;

@GetMapping("/exibirFuncionario")
public List<Funcionario> exibirFuncionarios() {
    return funcctrl.findAll();
}

@GetMapping("/exibirFuncionarioPorCodFunc/{codFunc}")
public Optional<Funcionario> exibirFuncionarioPorCodFunc(
    @PathVariable("codFunc") int codFunc) {
    return funcctrl.findById(codFunc);
}

@PostMapping("/inserirFuncionario")
public void inserirFuncionario(@RequestBody Funcionario func) {
    funcctrl.save(func);
}

@PutMapping("/atualizarFuncionario")
public void atualizarFuncionario(@RequestBody Funcionario func){
    funcctrl.save(func);
}

@DeleteMapping("/deletarFuncionarioPorCodFunc/{codFunc}")
public void deletarFuncionarioPorCodFunc(
        @PathVariable("codFunc") int codFunc) {
    funcctrl.deleteById(codFunc);
}
    
}
