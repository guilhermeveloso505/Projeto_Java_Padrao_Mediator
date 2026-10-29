# Padrão de Projeto Mediator

## Sobre o projeto

Projeto desenvolvido em Java para praticar o padrão de projeto **Mediator**, permitindo centralizar a comunicação entre o usuário, o suporte e a transportadora no envio de elogios, críticas e reclamações.

## Funcionalidades

- Envio de elogios à transportadora.
- Envio de críticas para análise.
- Envio de reclamações sobre os serviços.
- Centralização da comunicação por meio do suporte.
- Retorno de mensagens conforme o tipo de feedback recebido.

## Estrutura do projeto

- **Pessoa:** classe abstrata que disponibiliza os métodos para enviar elogios, críticas e reclamações.
- **Usuario:** representa o usuário que utiliza os serviços de feedback.
- **Setor:** interface que define os métodos para receber elogios, críticas e reclamações.
- **Suporte:** centraliza a comunicação entre o usuário e a transportadora, encaminhando as mensagens e retornando as respostas.
- **Transportadora:** implementa a interface `Setor` e define as respostas para cada tipo de feedback.

## Padrão de projeto

O padrão **Mediator** centraliza a comunicação entre diferentes objetos por meio de um mediador, reduzindo o acoplamento entre eles. Neste projeto, o `Suporte` atua como mediador entre o usuário e a `Transportadora`, encaminhando as mensagens e retornando as respostas correspondentes.

Além disso, as classes `Suporte` e `Transportadora` utilizam o padrão **Singleton**, garantindo uma única instância de cada classe durante a execução do programa.

## Autor

Guilherme Veloso Luciano