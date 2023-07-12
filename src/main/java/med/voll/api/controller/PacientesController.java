package med.voll.api.controller;

import med.voll.api.paciente.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RequestMapping("pacientes")
@RestController
public class PacientesController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemPaciente::new);
    }

    @PutMapping
    @Transactional
    public void atualizar (@RequestBody @Valid DadosAttPaciente dados) {
        var paciente = repository.getReferenceById(dados.id());
        paciente.attInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void exlcuir (@PathVariable Long id) {
        var paciente = repository.getReferenceById(id);
        paciente.excluir(id);
    }
}