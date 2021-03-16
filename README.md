# liferay

Olá time de correção da liferay.

Eu dei uma olhada na aplicação por completo. Após uma longa análise dentro na aplicação. Encontrei possíveis bugs.

## Bugs:

bg-01 e bg-02 O campo qual é o seu nome aceita caracteres especiais e números.

bg-03 O campo qual é a data de nascimento não tem limite de ano mínimo e máximo.

bg-04 A descrição principal da aplicação não descreve para que serve e o funcionamento do formulário.

bg-05 O campo porque você ingressou na área de testes. O porque é separado.

bg-06 A descrição está é a primeira página de nosso forms. Está não deve ter acento.

bg-07 O forms muitos usuários não vão entender o que é o tal do forms. É melhor formulário.

bg-08 A segunda descrição da aplicação parece ser desnecessária

bg-09 A aplicação nao tem normas de acessibilidade da WCAG 2.1.

**Recursos**

🎯 Estou usando aqui:

Maven <br>
Junit <br>
Cucumber <br>
Selênium <br>
(e alguns complementos) <br>

📝 **Execução de relatório**

Para realizar a execução e também gerar um relatório para isso, basta usar o seguinte comando ao chamar o maven:

```
maven clean test
```
