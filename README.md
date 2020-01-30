# Laboratorio 2 ARSW
## Integrantes:
- Andres Marcelo 
- Johan Arias
- Simon Marin
- Juan Garcia
# Como ejecutar el programa (Parte 1 PI Digits)?
Primero que todo asegurese de tener Maven instalado en su equipo y tenerlo en el path de su S.O

Abra la consola y situese en donde descargo el programa, deberia quedarle algo asi el path: ``C:\Users\UExample\Downloads\Lab2ARSW\pi>``

- Para compilar el proyecto ponga el siguiente comando: ``mvn compile``
- Para ejecutar las pruebas ponga el siguiente comando: `` mvn test``
- Para probar el programa usted mismo y poner casos ponga el siguiente comando:
``mvn exec:java -Dexec.mainClass="edu.eci.arsw.math.Main
``
A continuacion poner los parametros (cifra de inicio, numero de cifras y numero de hilos respectivamente) separados por lineas, de la siguiente forma:
> 0  
> 100  
> 20  


# Part I - Introduction to Java Threads
How does the output change if we use Run() or if we user Start() ? Why?
> Con start() el output **salta de numeros**, con run() ejecuta el codigo secuencialmente y **no hay saltos o cambios de orden** en el output, esto sucede debido a que si usamos el método **start ()**, se crea un nuevo Thread y el código dentro del método run() se ejecuta en un nuevo Thread, mientras que si llama al método **run()** directamente, no se crea un nuevo Thread y se ejecutará el código dentro de run() en el hilo actual.

## Part III - Performance Evaluation

Single thread. 

![1 th](img/VERDADERO.PNG)
![1 thi](img/GG1.PNG)

As many threads as processing cores (have the program determine this using the Runtime API). 

![4 th](img/VERDADERO2.PNG)
![4 thi](img/GG2.PNG)
So many threads as double processing cores. 

![8 th](img/VERDADERO3.PNG)
![8 thi](img/GG3.PNG)

200 threads

![200 th](img/VERDADERO4.PNG)
![200 thi](img/GG4.PNG)

500 threads

![500 th](img/g5.PNG)
![500 thi](img/GG5.PNG)


 ## Why is the best performance not achieved with the 500 threads?
 
 Esto se debe a que el procesador en uso no soporta la cantidad de hilos necesitados para el proceso.
 
 ## How does this performance compare when 200 are used?
 El proceso se ejecuta de manera más óptima debido a que esta cantidad de Threads es soportada por el procesador.
 
 ## How does the solution behave using as many processing threads as cores compared to the result of using twice as much?
 
 El uso de la CPU es menor en el caso en el que usamos el doble de Threads con respecto al numero de cores del pc.
 Sin embargo, la solucion con el doble de Threads es más efectiva, debido a que cada core soporta 2 hilos al tiempo.
 
 # Como ejecutar el programa (Parte 2   I PrimeNumbers Digits)?
Primero que todo asegurese de tener Maven instalado en su equipo y tenerlo en el path de su S.O

Abra la consola y situese en donde descargo el programa, deberia quedarle algo asi el path: ``C:\Users\UExample\Downloads\Lab2ARSW\parte1>``
- Para compilar el proyecto ponga el siguiente comando: ``mvn compile``
- Para probar el programa usted mismo  ponga el siguiente comando:
``mvn exec:java -Dexec.mainClass="edu.eci.arsw.primefinder.Main"
``

 # Como ejecutar el programa (Parte 2  II Canodromo)?
Primero que todo asegurese de tener Maven instalado en su equipo y tenerlo en el path de su S.O

Abra la consola y situese en donde descargo el programa, deberia quedarle algo asi el path: ``C:\Users\UExample\Downloads\Lab2ARSW\parte2>``

- Para compilar el proyecto ponga el siguiente comando: ``mvn compile``
- Para probar el programa usted mismo y poner casos ponga el siguiente comando:
``mvn exec:java -Dexec.mainClass="arsw.threads.MainCanodromo"
``
 
 
 
 
 
 
 
 
