package med.voll.api.controller;

import med.voll.api.medicos.DadosCadastroMedico;
import med.voll.api.medicos.Medico;
import med.voll.api.medicos.MedicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;


@RequestMapping("medicos")
@RestController
public class MedicosController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar (@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));

    }
}
