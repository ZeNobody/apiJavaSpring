package med.voll.api.medicos;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm,
                                  Especialidade especialidade, DadosEndereco endereco) {
}
