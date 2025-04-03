# Atividade-Pilha-Fila
Algoritmos sobre pilha/fila em Java

# Navegador Web Simples

Este projeto implementa a funcionalidade básica dos botões "voltar" e "avançar" de um navegador web, utilizando pilhas para armazenar o histórico de navegação.

## Implementação

- Utiliza duas pilhas (`Stack`) para armazenar URLs visitadas: uma para o histórico de "voltar" e outra para "avançar".
- A página atual é armazenada em uma variável `String`.
- Os métodos `navegarPara`, `voltar` e `avancar` manipulam as pilhas para simular a navegação.

## Testes

```java
Navegador navegador = new Navegador();
navegador.navegarPara("[www.google.com](https://www.google.com)");
navegador.navegarPara("www.mozilla.org");
navegador.navegarPara("www.wikipedia.org");
navegador.voltar(); // Volta para www.mozilla.org
navegador.avancar(); // Avança para www.wikipedia.org
navegador.voltar(); // Volta para www.mozilla.org
navegador.voltar(); // Volta para [www.google.com](https://www.google.com)
navegador.voltar(); // Exibe "Não há páginas anteriores."
```

# Gerenciador de Senhas para Hospital

Este projeto implementa um sistema de gerenciamento de senhas para um hospital, com funcionalidades para gerar senhas sequenciais, chamar o próximo paciente e manter um histórico de chamadas.

## Implementação

- Utiliza uma fila (`Queue`) implementada com `LinkedList` para armazenar as senhas.
- As senhas são geradas sequencialmente.
- Mantém um histórico de chamadas em uma lista (`List`).

## Testes

```java
GerenciadorSenhas gerenciador = new GerenciadorSenhas();
gerenciador.gerarSenha(); // Gera senha 1
gerenciador.gerarSenha(); // Gera senha 2
gerenciador.gerarSenha(); // Gera senha 3
gerenciador.chamarProximo(); // Retorna 1
gerenciador.chamarProximo(); // Retorna 2
gerenciador.chamarProximo(); // Retorna 3
gerenciador.chamarProximo(); // Retorna null
gerenciador.reiniciarSenhas(); // Reinicia o sistema
gerenciador.gerarSenha(); // Gera senha 1 novamente
```
