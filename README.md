# Voll.med - Alura

## Spring Boot 3: desenvolva uma API Rest em Java

Framework Spring boot 3;

Lombok - Gerar os códigos repetitivos (Getters, Setters, etc) e tornar menos verboso;

MySQL - Armazenar as informações;

Flyway - Ferramenta de migration;

JPA: Define uma interface comum para interagir com bancos de dados relacionais usando objetos Java.

Hibernate: Mapeia automaticamente objetos Java para tabelas do banco de dados, realiza operações de persistência, recuperação e consulta de dados;

Maven - Gerenciador de dependencias;


### ANOTAÇÕES

Padrão DTO (Data Transfer Object): Atua como um objeto de transporte que encapsula os dados que serão transferidos entre os diferentes componentes do sistema, evitando a transferência desnecessária de informações não relevantes;

@RestController: Usada em classes controladoras (controllers) em um aplicativo Spring Boot para criar endpoints de API REST;

@RequestMapping : Fazer a ligação com a tabela no banco de dados;

@Table: Usada para personalizar o mapeamento entre a classe de entidade e a tabela no banco de dados;

@Entity: Usada para indicar que a classe é uma entidade, ou seja, uma representação de uma tabela no banco de dados;

@RequestBody: Receber os dados do corpo da requisição em um parâmetro no Controller;

@Pageable: Interface do Spring para realizar consultas com paginação. Controla a paginação dos dados devolvidos pela API com parametros page, size e sort;
           
@PathVariable: Mapear parâmetros dinâmicos em URL;

@Embeddable: Usada para marcar uma classe como uma classe embutida. Uma classe embutida é uma classe que é incluída como parte de uma entidade, mas não tem uma identidade própria no banco de dados;

@Embedded: Usada para mapear um atributo que contém uma classe embutida dentro de uma entidade. Ela indica que o atributo representa uma instância da classe embutida e seus campos correspondentes serão mapeados como colunas na tabela da entidade;

@Enumerated: Usada para mapear um atributo enumerado (enum) para uma coluna no banco de dados;

@Autowired: é uma anotação do Spring Framework usada para realizar a injeção de dependências;

@Id @GeneratedValue: São usadas em conjunto para mapear uma coluna de identificação primária em uma entidade JPA. Elas fazem parte da especificação JPA e são usadas em entidades para indicar a chave primária e configurar a estratégia de geração automática de valores para essa chave;

(strategy = GenerationType.IDENTITY): Essa estratégia indica que o valor da chave primária será gerado automaticamente pelo banco de dados usando uma coluna de identidade ou recurso equivalente do banco de dados;


### Mapear Requisições em uma classe Controller

@PostMapping: Inserir dados;

@GetMapping: Receber os dados cadastrados;

@PutMapping: Atualizar os dados;

@DeleteMapping: Excluir os dados;

@Transactional: Usada em métodos que realizam operações de persistência, como inserção, atualização ou exclusão de dados em um banco de dados;

### Bean Validation

@NotBlank: Garantir que uma string não seja nula e nem vazia;

@NotNull: Garantir que um valor não seja nulo;

@Pattern: Garantir que um valor atenda a um padrão específico definido por uma expressão regular;

@Email: Garantir que um valor seja um endereço de email válido;

@Valid: Usada para ativar a validação em cascata de um objeto complexo;
