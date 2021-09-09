
package tp1.ej3;
import java.util.Scanner;


public class Rectangulo {
    
 Scanner Input = new Scanner(System.in);

    private int Base_1 ;
    private int Altura_1 ; 
    private int Base_2;
    private int Altura_2 ; 
    double Area =0; 
    double Perime=0; 
    double Area_1 =0; 
    double Perime_2=0;
    public Rectangulo (){

    }
    public Rectangulo(int Base_1, int Altura_1, int Base_2, int Altura_2) {
        this.Base_1 = Base_1;
        this.Altura_1 = Altura_1;
        this.Base_2 = Base_2;
        this.Altura_2 =Altura_2;
    }




    public void datos() {
        System.out.println("Por favor, ingrese la base del primer rectangulo");
         this.Base_1 = Input.nextInt(); 

        System.out.println("Ahora ingrese la altura");
        this.Altura_1 = Input.nextInt(); 

        System.out.println("Por favor, ingrese la base del segundo rectangulo");
         this.Base_2 = Input.nextInt(); 

        System.out.println("Ahora ingrese la altura");
        this.Altura_2 = Input.nextInt(); 
    }

    public void datoRectangulo1(){


        Area = (this.Base_1*this.altura1);
        System.out.println("El Area del primer rectangulo es : "+Area);

        Perime = Math.sqrt((this.Altura_1,this.Altura_1)+(this.Base_1, this.Base_1));
        System.out.println("El perimetro del primer rectangulo es :"+Perime);


    }

     public void datoRectangulo2(){


        Area_1 = (this.Base_2*this.Altura_2);
        System.out.println("El Area del segundo rectangulo es : "+Area_1);

        Perime = Math.sqrt((this.Altura_2*this.Altura_2)+(this.Base_2*this.Base_2));
        System.out.println("El perimetro del segundo  rectangulo es :"+Perime_2);


    }

    public void comparacion (){
        System.out.println("____________________________________________________");
        System.out.println("");
        
        if(Area > Area_1){
            System.out.println("El primer rectangulo tiene mayor area");

        }
        else if (Area_1>Area){
             System.out.println("El segundo rectangulo tiene mayor area");
        }

        if(Perime >Perime_2){
              System.out.println("El primer rectangulo tiene mayor perimetro");

        }
        else if (Perime_2>Perime){
             System.out.println("El segundo rectangulo tiene mayor area");
        }

    } 

}    

