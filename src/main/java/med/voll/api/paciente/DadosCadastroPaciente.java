package med.voll.api.paciente;

import med.voll.api.Endereco.DadosEndereco;

public record DadosCadastroPaciente (String nome, String email, String telefone,
                                     String CPF, DadosEndereco endereco) {
}
