package Final;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tablero tablero = new Tablero();
        tablero.setBlancas("blanca");
        tablero.setNegras("Negras");
        int contador = 0;

        do{
            System.out.println(tablero.getBlancas());
            tablero.iniciar();
            System.out.println(tablero.getNegras());
            tablero.iniciar();
            contador++;
        }while(contador < 5);


    }
}



/*1)Los contenedores son dinamicos osea que mo es necesario declarar su tamaño a diferencia de los arreglos que son estaticos y hay que declarar su tamaño antes de usarlo,
ej : Arraylist y stack son dinamicos

2)estructura de datos dinamica que se manejan con una clave y un valor ,para usarlo se utilizan los metodos put para agregar un nuevo objeto,y
pop para sacar un objeto
se puede recorrer con un wile mientras no este vacio el contenedor usandp Enumeratio llaves x ejemplo

3)SE llama asi la clase abstracta porque no se puede instanciar con un objeto su utilidad es la de generalizacion y
donde le puede heredar a sus clases hijas su comportaminto ej: clase animal y la interfaz esta compuesta por metodos abstractos

4)es un metodo con un condicional que consta de un paso base y uno recursivo el base es por si no se cumple la condicion
y el recursivo para volver a llamar la funcion
elemntos : main desde donde se le puede pasar al valor al metodo y el metodo o funcion donde se realiza la recursion

ej: public int factorial(int x){
       if(x < 1)
        return x
        else
        return x * factoria(x-1) - factorial(x-2)
}

5)*los constructores se llaman igual que la clase
    *No retornan ningun valor sirve para inicializar a un objeto de esa clase
    *puede haber muchos pero no pueden tener los mismos parametros deben diferir en al menos 1


*/

