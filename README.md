# Projecto Auto-Ahorro BlackRock

Este es un proyecto que tiene un API y cuenta con los siguientes end-points:

- /blackrock/challenge/v1/transactions:parse
- /blackrock/challenge/v1/transactions:validator
- /blackrock/challenge/v1/performance

## Correr contenedor Docker

Es una aplicacion que esta configurada con Docker. Para construir la imagen se necesita tener instalado Docker y correr el siguiente comando:

```bash
docker build -t autoahorro-api .
```

Una vez terminado de crear la imagen para levantar el contenedor se ejecuta el siguiente comando:

```bash
docker run -d -p 5477:80 --name spring-api autoahorro-api
```