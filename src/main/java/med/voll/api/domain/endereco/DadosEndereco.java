package med.voll.api.domain.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
    @NotBlank(message = "Logradouro é obrigatório!")
    String logradouro,
    @NotBlank(message = "Bairro é obrigatório!")
    String bairro,
    @NotBlank(message = "CEP é obrigatório!")
    @Pattern(regexp = "\\d{8}}", message = "O formato do CEP é inválido")
    String cep,
    @NotBlank(message = "Cidade é obrigatório!")
    String cidade,
    @NotBlank(message = "UF é obrigatório!")
    String uf,
    String numero,
    String complemento) {
}