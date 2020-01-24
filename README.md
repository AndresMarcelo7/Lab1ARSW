# Laboratorio 2 ARSW
## Integrantes:
- Andres Marcelo 


# Part I - Introduction to Java Threads
How does the output change if we use Run() or if we user Start() ? Why?
> Con start() el output **salta de numeros**, con run() ejecuta el codigo
 secuencialmente y **no hay saltos o cambios de orden** en el output, esto 
 sucede debido a que si usamos el método **start ()**, se crea un nuevo Thread
 y el código dentro del método run() se ejecuta en un nuevo Thread, mientras 
 que si llama al método **run()** directamente, no se crea un nuevo Thread y se ejecutará 
 el código dentro de run() en el hilo actual.

## Part III - Performance Evaluation

