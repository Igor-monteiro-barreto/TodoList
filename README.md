# Todo List


## Informações da API
- API usada para criar um CRUD (Create, Read, Update e Delete) com java e Spring Boot 


- Para testar a funcionabilidade da aplicação eu utilizei o Postman
- Enviando uma requisição http:8080/localhost/todos e depois o endingpoint para testar (Os endingpoints
estão no Packge Controller).


- Atributos da aplicação name, descricao, realizado e prioridade.
- Os atributos estão no ``Todolist\src\main\java\Model\Todo.java ``


- Passo a passo recomendado:
    - Rode (de um run no ```Todolist\src\main\java\TodolistApplication.java```) a aplicação e verifique se esta conectando com o Bando de Dados.
    - Vá para o Postman e teste essas URL´s:
      - ``POST localhost:8080/todos/create`` 
      - ``GET localhost:8080/todos/findAll``
      - ``UPDATE localhost:8080/todos/update``
      - ``DELETE localhost:8080/todos/delete``


## Pré requisitos

- [JDK 23](https://www.oracle.com/java/technologies/javase-jdk23-downloads.html)
- [Apache Maven 3.9.9](https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/)
- [Git](https://git-scm.com/downloads)
- [Mysql](https://dev.mysql.com/downloads/mysql/)
    - database name todolist

## Configuração Windows

### Adicionando o MAVEN_HOME e o JAVA_HOME
- Acesso o menu Windows,
- Digite "**Editar as variáveis de ambiente do sistema**"
- Em "**Propriedades do Sistema**" Acesse a Aba "**Avançado**" e clique em "**Variaveis de Ambiente...**"
- Em "**Variáveis de Ambiente**", Variaveis do Sistema, clique em "**Novo...**"
    - Nome da variável: MAVEN_HOME
    - Valor da variável: c:\apache-maven-3.9.9

- Em "**Nova variável de sistema**" Clique "**Ok**" e depois clique novamente em "**Novo...**"

    - Nome da variável: JAVA_HOME
    - Valor da variável: C:\Program Files\Java\jdk-23.0.0
- Em "**Variáveis de ambiente**" Clique "**Ok**".
- Em "**Propriedades do sistema**" Clique "**Ok**".
## Clonando o projeto

- Abra a sua pasta de repositório, clique com o botão direito do mouse e selecione a opção "**Git Bash**"
- Execute o comando abaixo:
    - git clone https://github.com/Igor-monteiro-barreto/TodoList.git

## Importando o projeto

### Intellij:

- Acesse o Menu "**File**", depois clique em "**Open**"
- Em "**Open File or Project**, selecione o diretório do "**Password API**"
- Clique em "**Load Maven Project**"
- Acesse a perspectiva [**Maven**] do lado direito da tela, e depois clique em um icone de "**M**" e selecione: "**mvn clean**" aguarde o finalização no consolse e depois em "**mvn install**"


## Como acessar a API via postman:

- Abra o postman
- Clique em **Collections**
- Clique em import
- Na Aba file adicione o arquivo presente no diretório abaixo:


### Tecnologias presentes na API:

- ``JAVA 23 - Jdk-23``
- `Maven 3.9.9`
- ```xml 
  <parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.4.1</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent> 


- 0.0.1-SNAPSHOT version
- Dependências no arquivo ``pom.xml``