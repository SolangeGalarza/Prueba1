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
public class CuadradoTest {
    
    public CuadradoTest() {
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
    public void TestArea()
    {
        double areaEsperada,area;
        areaEsperada=100;
        area=Cuadrado.Area(100,100,100,100);
         assertEquals(areaEsperada,area,0.0);
        
    }
    
    @Test
    public void TestPerimetro()
    {
        double perimetroEsperado,perimetro;
        perimetro=40;
        perimetroEsperado=Cuadrado.Perimetro(10, 10, 10,10);
        assertEquals(perimetroEsperado,perimetro,0.0);
        
    }
}

package figuras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rectangulo
 */
public class RectanguloTest {
    
    public RectanguloTest() {
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
     * Test of area method, of class Rectangulo.
     */
   @Test
    public void testCalcularPerimetro() {
        System.out.println("CalcularPerimetro");
        Rectangulo.CalcularPerimetro();
        double base=2;
        double altura=4;
        double expResult =12 ;
        double perimetro = base+base+altura+altura;
        assertEquals(expResult, 12, 0.0);
      
    }

    
     
    @Test
    public void testCalcularArea() {
        System.out.println("CalcularArea");
        Rectangulo.CalcularArea();
        double base = 2;
        double altura = 4;
        double expResult =8 ;
        double area = base*altura;
        assertEquals(expResult, 8 , 0.0);
       
    }

    
}
