package med.voll.api.controller;

import med.voll.api.endereco.Endereco;
import med.voll.api.medicos.DadosCadastroMedico;
import med.voll.api.medicos.Medico;
import med.voll.api.medicos.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("medicos")
@RestController
public class MedicosController {

    @Autowired
    private MedicoRepository repository;
    @PostMapping
    public void cadastrar (@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico(dados));

    }
}
