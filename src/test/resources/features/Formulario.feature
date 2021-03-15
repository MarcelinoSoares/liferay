#language: pt

@projetoliferay @allbugs
Funcionalidade: enviar formulario

  @bg-01
  Cenário: Mostrar mensagem de erro de caracteres especiais
    Dado que estou na tela de formulario
    Quando eu insiro todas as outras informações no formulario do usuário
    Mas eu preencho o nome apenas com caracteres especiais
    E faço o envio do formulario
    Então vejo a mensagem de erro "o campo nome nao aceita caracteres especiais."

  @bg-02
  Cenário: Mostrar mensagem de erro de numeros
    Dado que estou na tela de formulario
    Quando eu insiro todas as outras informações no formulario do usuário
    Mas eu preencho o nome apenas com numeros
    E faço o envio do formulario
    Então vejo a mensagem de erro "o campo nome nao aceita numeros."