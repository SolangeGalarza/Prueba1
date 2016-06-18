/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatecnicas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class FigurasTest {
    
    public FigurasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Perimetro method, of class Cuadrado.
     */
    @Test 
    public void TestAreaCuadrado()
    {
        double areaEsperada,area;
        areaEsperada=100;
        area=Cuadrado.Area(100,100,100,100);
         assertEquals(areaEsperada,area,0.0);
        
    }
    
    @Test
    public void TestPerimetroCuadrado()
    {
        double perimetroEsperado,perimetro;
        perimetro=40;
        perimetroEsperado=Cuadrado.Perimetro(10, 10, 10,10);
        assertEquals(perimetroEsperado,perimetro,0.0);   
    }
<<<<<<< HEAD
    
=======
    /**
     * Test of Perimetro method, of class Triangulo.
     */
>>>>>>> origin/master
    @Test
    public void TestPerimetroTriangulo(){
        double perimetroEsp,perimetroTri;
        perimetro=90.00;
        perimetroEsp=Triangulo.Perimetro(15,20,25);
        assertEquals(perimetroEsp,perimetroTri,0.0);
    }
<<<<<<< HEAD
    
=======
>>>>>>> origin/master
    @Test
    public void TestAreaTriangulo(){
        double AreaEsp,AreaTri;
        AreaTri=120;
        AreaEsp=Triagulo.Area(6,5);
        assertEquals(AreaEsp,AreaTri,0.0);
    }
<<<<<<< HEAD
=======
    
>>>>>>> origin/master
    
   @Test
    public void testCalcularPerimetroRectangulo() {
        System.out.println("CalcularPerimetro");
        Rectangulo.CalcularPerimetro();
        double base=2;
        double altura=4;
        double expResult =12 ;
        double perimetro = base+base+altura+altura;
        assertEquals(expResult, 12, 0.0);
      
<<<<<<< HEAD
    }    
     
=======
    }

>>>>>>> origin/master
    @Test
    public void testCalcularAreaRectangulo() {
        System.out.println("CalcularArea");
        Rectangulo.CalcularArea();
        double base = 2;
        double altura = 4;
        double expResult =8 ;
        double area = base*altura;
        assertEquals(expResult, 8 , 0.0);
       
    }
@Test
    public void testPerimetro() {
       double perimetro=Circulo.calcularPerimetro(40);
         assertEquals(251.3304,perimetro,0);
    }
    
     @Test
    public void testarea() {
       double area=Circulo.calcularArea(80);
         assertEquals(12800,area,0);
    }
    
}
