

package tp1.ej1;


public class Calculadora {
    //atributos
    private float valorUno;
    private float valorDos;

    
  
    //constructor
public Calculadora(float valorUno, float valorDos){
     this.valorUno = valorUno;
     this.valorDos = valorDos;
}
    
   
    
//metodos
public float sumar(){
    
    return (valorUno + valorDos);
    
}

public float restar(){
    
    return (valorUno - valorDos);
    
    
}

public float producto(){
   
    return (valorUno * valorDos);
    
}

public float div (){
    float div = -1;
   if(valorDos == 0){
       System.out.println("El divisor no puede ser 0");
   }
   else{
       div = (valorUno / valorDos);
   }
   return div;
}
}

    





 
