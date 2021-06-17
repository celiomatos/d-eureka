# D Eureka

## Facilitador de comunicação e descoberta de serviços em uma arquitetura de microserviços.


## Instalação

```
docker build -f Dockerfile -t celiomatos/d-eureka .
docker run -d -p 8088:8088 --restart always celiomatos/d-eureka
```

## Uso
- Este é um projeto que contempla outro projetos, em ordem de load abaixo:
    - d-eureka
    - d-zuul
    - d-admin