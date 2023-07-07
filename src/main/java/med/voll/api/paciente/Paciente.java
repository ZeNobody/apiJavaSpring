package med.voll.api.paciente;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import med.voll.api.endereco.Endereco;

@Table(name="pacientes")
@Entity(name="Paciente")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    @Embedded
    private Endereco endereco;

    public Paciente (DadosCadastroPaciente dados) {
        this.nome=dados.nome();
        this.email=dados.email();
        this.telefone=dados.telefone();
        this.cpf=dados.cpf();
        this.endereco=new Endereco(dados.endereco());
    }
}
