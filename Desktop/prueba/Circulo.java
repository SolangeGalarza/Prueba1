/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;/**
 *
 * @author Usuario
 */
public class Circulo extends Figuras{

    public Circulo(double area, double perimetro, String tipoFigura) {
        super(area, perimetro, tipoFigura);
    }
    public static double  calcularArea( double radio){
        double area= 3.1416*(radio*radio);
        return area;    
    
    }
    
     public static double  calcularPerimetro( double radio){
        double perimetro= 2*radio*radio;
        if (perimetro<150)
        {
            System.out.println("El perimetro no puede ser calculado");
            perimetro=0;

            
        }
        else
        {
            perimetro= 2*radio*radio;
            
        }
        return perimetro;   
    } 
    
    }
    public void Imprimir ()
    {
        System.out.println( "El Tipo de Figura es :" + tipoFigura ); 
        System.out.println( "EL Area es :" + area );
        System.out.println( "El Perimetro es :" + perimetro ); 
        
    
    }

   
    
}
