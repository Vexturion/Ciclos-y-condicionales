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
    
    }
    
}
