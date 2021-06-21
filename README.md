# D Eureka

## Facilitador de comunicação e descoberta de serviços em uma arquitetura de microserviços.


## Instalação

```
docker build -f Dockerfile -t celiomatos/d-eureka:1.2.0 .
docker run -d -p 8088:8088 --restart always celiomatos/d-eureka:1.2.0
```

## Uso
- Este é um projeto que contempla outro projetos, em ordem de load abaixo:
    - d-eureka
    - d-config      
    - d-zuul