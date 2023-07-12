package med.voll.api.medicos;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;
import org.springframework.http.ResponseEntity;

@Table(name="medicos")
@Entity(name="Medico")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    private Boolean ativo;

    public Medico(DadosCadastroMedico dados) {
        this.ativo = true;
        this.nome=dados.nome();
        this.email=dados.email();
        this.telefone=dados.telefone();
        this.crm=dados.crm();
        this.especialidade=dados.especialidade();
        this.endereco=new Endereco(dados.endereco());
    }

    public void attInformacoes(DadosAttMedico dados) {
        if(dados.nome() != null) {
            this.nome = dados.nome();
        }
        if(dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if(dados.endereco() != null) {
            this.endereco.attInformacoes(dados.endereco());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
