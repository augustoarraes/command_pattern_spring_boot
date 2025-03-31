# App BackEnd Delivery com Spring Boot utilizando o Conceito do Design Pattern Command

Este projeto conceitual é uma aplicação backend para um sistema de Delivery, desenvolvida com Spring Boot e baseada no Design Pattern Command. A arquitetura segue as boas práticas do Spring Boot e Java, garantindo um código modular e de fácil manutenção. O Design Pattern Command é utilizado para encapsular operações de pedidos, facilitando a extensão e a reutilização da lógica de negócio.
Assim, novas operações (código) podem ser adicionadas facilmente no fluxo da operação. A implementação do Command está no Controller e principalmente no Service do app.

## Subindo o APP BackEnd

Ação abaixo já sobe o BD também.
```docker
docker-compose up -d
docker restart delivery_api
```

## Documentação da API

[Doc](http://localhost:8080/swagger-ui/index.html)

