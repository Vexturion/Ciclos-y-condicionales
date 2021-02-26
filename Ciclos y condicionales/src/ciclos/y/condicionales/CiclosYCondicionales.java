package ciclos.y.condicionales;

public class CiclosYCondicionales {

    public static void main(String[] args) {
        
    // en java podemos definir 3 tipos de instrucciones; Seleccion, iteracion y salto
    
    // if
    String colorLuz= "ROJO";
   
    if (colorLuz.equalsIgnoreCase("Verde")){
        System.out.println("Puedes continuar"); // la parte dentro de {} se ejecutara siempre y cuando se cumpla la condicion
    } else {                                                              // else {} se ejecutara cuando la condicion no se cumpla
        System.out.println("Alto");                      
    }
    
    
    // else if
    String colorLuz2= "ROJO";
   
    if (colorLuz.equalsIgnoreCase("Verde")){
        System.out.println("Puedes continuar"); 
    } else if(colorLuz2.equalsIgnoreCase("Amarillo")) {                                                              
        System.out.println("Alto parcial, cuidado");                      
    } else if (colorLuz2.equalsIgnoreCase("Rojo")){        // else if es otra posibilidad, podremos tener la n cantidad de else if que seam necesarias
        System.out.println("Alto total");                             
    } else {
        System.out.println("Color no valido");                    // else if se ejecutara cuando ninguna de las demas condiciones se haya cumplido
    }
    
    
    // condiciones anidadas
    // ejercicio
    // el promedio minimo para pasar es 7
    // si el promedio es 10 felicitar al alumno
    // si el promedio es aprobatorio pero no es diez aprobarlo
    // si el promedio no es aprobatorio reprobar al alumno
    String nombreAlumno= "Santiago Cruz Hernandez";
    int calificacion= 10;
    if (calificacion>=7){
        // nuestro promedio es aprobatorio
        if (calificacion==10){   //anidamos la condicion para evaluar si es un 10
        System.out.println("Felicidades " + nombreAlumno+  " has aprobado");  // se ejecuta el mensaje en caso la calificacion sea 10
                } else                                                                    //de ser aprobatoria la calificacion pero no ser 10 se ejecutara esto
            System.out.println("Aprobado");
        } else {
        System.out.println("Es necesario estudiar mas"); // si la calificacion no es mayor o igual a 7 o es 10 se mostrara esto
    }
   
    
    // Scope
    // scope o alcance, que es para lo que sirve {} que determina el area donde una variable puede ser utilizada
    int calificacion2= 10;                                            // calificacion es una variable declarada en la clase CiclosYCondicionales por lo cual su alcance es mucho mayor
    if (calificacion2>7){
    String mensaje= "Felicidades, tu promedio aprobatorio es de " + calificacion2;
    System.out.println(mensaje);                                     // el alcance de nuestra variable mensaje unicamente abarca el espacio entre {}
    } else {
    System.out.println("Lo sentimos, has reprobado");
    }
    // System.out.println(mensaje); al querer imprimir la variable "mensaje" fuera de su scope tendremos un error, sus valores se perderan una vez el bloque finalice
    
    
    // Switch y su estructura
    // los valores NO pueden ser booleanos
    // nuestro semaforo quedaria de la siguiente manera
    String colorLuz3= "Verde";
    switch (colorLuz3){
        case "Verde":
            System.out.println("Puedes continuar");
            break;
        case "Amarillo":
            System.out.println("Alto parcial");
            break;
        case "Rojo":
            System.out.println("Alto total");
            break;
    
        default: // default se ejecutara cuando se hayan evaluado todos los casos y ninguno se cumpla
            System.out.println("Color no valido");
    }

    // pero que hacer si nuestras opciones se repiten
    int calificacion3= '8';
    switch (calificacion3){
        case '9':
            System.out.println("Excelente, bien hecho");
            break;
        case '8':
        case '7':      // Podemos quitar el break para que multiples casos realicen unicamente una accion. El uso de break es opcional
        case '6':                                   
            System.out.println("Felicidades, pasaste");
            break;
        default:
            System.out.println("Has reprobado");
                    
    }
    
    // Ciclo while
    // utilizaremos el ciclo while cuando no sepamos cuantas iteraciones vamos a realizar
    int contador= 1; // mientras nuestra condicion se cumpla el codigo se ejecutara
    while (contador<6){
    System.out.println("Hola mundo!");
    contador++;
    }
    
    int contador2= 0;
    int numero= 123456789;
    while(numero>0){
        numero=numero/10;
        contador2++;
    }
    System.out.println("El numero posee " + contador2 + " digito(s)");
    
    
    // ciclo do while
    // el ciclo do while se ejecutara por lo menos una vez, a diferencia de while que solo se ejecuta si la condicion se cumple
    // do while ejecutara el codigo y evaluara despues si la condicion se cumple
    int contador3= 5;
    do {
            System.out.println(contador3);
            contador3++;
    } while (contador3<10);         // como podemos ver la condicion NO se cumple (contador3 vale 24) sin embargo el codigo se ejecuta y se imprime el valor de contador3
    
    
    // Ciclo for
    // nosotros sabremos en todo momento la cantidad de iteraciones que vamos a realizar
    // for (inicializacion;Condicion;Iteracion) {}
    // inicializacion: declaramos las variables que van a ser utilizadas
    // condicion: declaramos la condicion a cumplirse
    // iteracion: las sentencias que queremos ejecutar en cada repeticion
    for (int numero2= 9, x=1;x<11;System.out.println(numero2*x + " Es el resultado de multiplicar " + numero2 + " por " + x ),x++){
    }
   
    
    // realizamos un programa que imprima los numeros pares del 1 al 100
    // quedaria asi
    for (int numero3=0;numero3<=100;System.out.println(numero3), numero3+=2){
    }
    
   // o bien 
    for (int numero4=1;numero4<101;numero4++){
    if(numero4%2==0){
        System.out.println(numero4);
       }
    }
    
    
    //sentencias de salto: Java admite tres sentencias de salto = break continue y return
    // break nos permite terminar una secuencia de instrucciones, salir de un ciclo y usarlo como un go to
    // explicaremos los primeros 2
    
    // break
    int valor= 10;
    switch(valor){
        case 10:
            System.out.println("El numero es 10");
            break;  //interrumpimos la secuencia, impidiendo que se ejecute default
        default:
            System.out.println("El numero NO es 10");
            }
    
    for (int x= 1; x<101; x++){
        if(x==50){
            break;  // este break termina nuestro ciclo de 100 iteraciones en la numero 50
        }
        System.out.println(x);
    }
    System.out.println("Ciclo completado!");
   
    // otro ejemplo
    for (int i= 0; i<3; i++){
        System.out.println("Siguiente " + i + " : ");
        for (int j=0; j<100; j++){
            if(j==10){
                break;       // break condiciona al ciclo a solo realizarse 10 veces y solo termina el ciclo donde fue tomado.
            }
            System.out.println(j + " ");
        }
        System.out.println();
    }
    System.out.println("Ciclo completado");
    
    
    // continue
    for (int x=0; x<10; x++){
        if(x==5){
            continue;  // continue saltara el codigo que se ejecutara despues cuando x valga 5. Al ejecutar, el numero 5 no se imprimira
        }
        System.out.println(x);
    }
    
    
   // unica sentencia
   for(int i=65; i<77; i++)
       System.out.println("Mensaje");  // en casos cuando solo se ejecute una linea de codigo no sera obligatorio usar {}
   
   // ejercicios 
   // Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un alumno sea mayor igual a 70
   // en caso contrario mostrar el mensaje "Reprobado".
   int promedio= 70;
   if (promedio>=70){
       System.out.println("Felicidades, has aprobado el curso");
   } else {
       System.out.println("Lo sentimos, has reprobado este curso");
   }
   
   // Dado 3 números enteros, mostrar en consola los números de forma ascendente, de menor a mayor. 
   // Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50
   int a= 4;
   int b= 50;
   int c= 9;
   
   if (a<b&&a<c){
       System.out.println(a);
   } else if (b<a&&b<c){
       System.out.println(b);
   } else {
       System.out.println(c);
   }
    
   if (a>b&&a<c||a>c&&a<b){
       System.out.println(a);
   } else if (b>a&&b<c||b>c&&b<a){
       System.out.println(b);
   } else {
       System.out.println(c);
   } 
    
   if (a>b&&a>c){
       System.out.println(a);
   } else if (b>a&&b>c){
       System.out.println(b);
   } else {
       System.out.println(c);
   } 
    
   // Imprimir en consola la tabla de multiplicar del número 9.
   for (int factor=9, x=0; x<11; System.out.println(factor*x + " Es el resultado de multiplicar " + factor + " por " + x), x++){
   }
   
   // obtener la salida en consola con forma de escalera
   
   // obtener la salida en consola con forma de pino

   //Imprimir en consola los primero diez números de la serie Fibonacci.
   int fibo= 1;
   int n1= 0;
   int n2= 1;
   while (fibo<11){
       int n3= n1+n2;
       n1++;
       n2++;
       fibo++;
   }
   
   // Dado un número saber si este es primo o no.
   int numero3= 13;
   if (numero3%2==0){
       System.out.println("Este no es un numero primo");
   } else{
       System.out.println("Este es un numero primo");
   }
   
    
    // Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará cuando el último múltiplo sea menor a 4570 
    int n4=1;
    do {
        int multiplicador=2*n4;
        n4++;
        System.out.println(multiplicador);
    } while (n4<2286);
    
    
    
    
    
    }
}