# S1-T2-BlueBank

<h1 align="center"><a href="https://bancopan.corporate.gama.academy/"><img width="250" height="150"src="https://bancopan.corporate.gama.academy/wp-content/uploads/sites/10/2021/08/logo-Positivo.png"><img width="250" height="150"src="https://bancopan.corporate.gama.academy/wp-content/uploads/sites/10/2021/08/gama-academy-logo-horizontal-verde-preto.png"</a></h1>

#### A PAN Academy juntamente com o Banco Pan fomalizaram o programa para aprimorar o conhecimento em JAVA e Cloud, com uma ementa bem elaborada para os alunos, com aulas diárias e no sábado, formatada para o projeto. Além do conhecimento teórico teremos a aplicação do aprendizado em um Projeto Final.


> Status: 🚀 Em desenvolvimento...  🚧

> ### 🛠 Desenvolvedores da Squad

- [Clayton Cesar Batista](https://github.com/Claytoncb82/)
- [Hanna](https://github.com/Honey-lee429)
- [Marcos](https://github.com/DevMarcus007)
- [Nathan Liyodi Nariai](https://github.com/nyodinariai)

> ### Back-End

- [x] Cadastro de Cliente
- [x] Cadastro de Conta
- [x] Movimentação de conta
- [x] Gerenciamento da conta


> ### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Eclipse](https://www.eclipse.org/)
- [SQL]()
- [Java]()
- [MySQL]()
- [Amazon Web Service]()
- [Jira](https://www.atlassian.com/br/software/jira/)
- [Main Repository]()
- [Xampp]()

  
> ### 🛠 Estrutura de Diretórios  
  
  ```shell
└───apibluebank  
    │   .gitignore  
    │   api-spring-aws.iml  
    │   buildspec.yml  
    │   mvnw  
    │   mvnw.cmd  
    │   pom.xml  
    │   README.md   
    └───src  
        ├───main  
        │   ├───java  
        │   │   └───api  
        │   │       └───spring  
        │   │           └───bluebank  
        │   │               │   ApibluebankApplication.java  
        │   │               │   buildspec.yml  
        │   │               │  
        │   │               ├───configuration  
        │   │               │       SwaggerConfig.java  
        │   │               │  
        │   │               ├───controller  
        │   │               │       ClienteController.java  
        │   │               │       ContaController.java  
        │   │               │       MovimentacoesController.java  
        │   │               │  
        │   │               ├───exception  
        │   │               │       NaoEcontrado.java  
        │   │               │  
        │   │               ├───model  
        │   │               │   │   Cliente.java  
        │   │               │   │   Conta.java  
        │   │               │   │   Endereco.java  
        │   │               │   │   Movimentacoes.java  
        │   │               │   │   TipoCliente.java  
        │   │               │   │  
        │   │               │   └───enun  
        │   │               │           TipoCliente.java  
        │   │               │           TipoConta.java  
        │   │               │           TipoMovimentacao.java  
        │   │               │           UF.java  
        │   │               │  
        │   │               ├───repository  
        │   │               │       ClienteRepository.java  
        │   │               │       ContaRepository.java  
        │   │               │       MovimentacoesRepository.java  
        │   │               │  
        │   │               ├───security  
        │   │               │       BasicSecurityConfig.java  
        │   │               │       UserDetailsImplements.java  
        │   │               │       UserDetailsServiceImplements.java  
        │   │               │  
        │   │               └───service  
        │   │                       ClienteService.java  
        │   │                       ContaService.java  
        │   │                       MovimentacoesService.java  
        │   │  
        │   └───resources  
        │           application.properties  
        │  
        └───test  
            └───java  
                └───api  
                    └───spring  
                        └───bluebank  
                                ApibluebankApplicationTests.java  
