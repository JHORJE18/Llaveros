# Llaveros
Programa en Java para comprobar si una llave puede entrar en una cerradura

## Funcionalidades
1. Registrar Llavero / Cerradura
2. Consultar compatiblidad llavero y cerradura
3. Eliminar Llavero / Cerradura
4. Salir del programa

## Consultar compatiblidad llavero y cerradura
Para consultar si una llave entra correctamente en una cerradura se tiene que cumplir los siguientes requisitos:
- Llave y Cerradura tienen que tener el mismo numero de Pines / Bombillines
- Cada pin de la llave + cada bombillin de la puerta tiene que dar 10

## Ejemplo
> Llave
```
-------------------------
Numero de llave: 1
Nombre llave: Casa
N pines: 5
####################
1 | 2 | 3 | 4 | 5 | 
--------------------
1 | 2 | 3 | 4 | 5 | 
####################
-------------------------
```
> Cerradura
```
-------------------------
Numero de cerradura: 1
Nombre cerradura: Puerta
N bombines: 5
####################
1 | 2 | 3 | 4 | 5 | 
--------------------
9 | 8 | 7 | 6 | 5 | 
####################
-------------------------
```
> Resultado
```
La llave puede entrar en la cerradura
El pin n 1 encaja
El pin n 2 encaja
El pin n 3 encaja
El pin n 4 encaja
El pin n 5 encaja
```

# Licencia
Copyright 2018 Llaveros

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
