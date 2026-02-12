/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alumno
 */
public class CuentaBancariaTest {
    
   @Test
   public void testIngresar(){
   CuentaBancaria cuenta=new CuentaBancaria(100);
   cuenta.ingresar(50);
   assertEquals(150,cuenta.getSaldo(),0.01);
   
   }
   @Test
   public void testRetirar(){
   CuentaBancaria cuenta = new CuentaBancaria(100);
    cuenta.retirar(40);
   assertEquals(60,cuenta.getSaldo(),0.01);
   }
   @Test
    public void testIngresarNegativo(){
   CuentaBancaria cuenta=new CuentaBancaria(100);
   cuenta.ingresar(-20);
   assertEquals(100,cuenta.getSaldo(),0.01);
   
   }
    
    @Test
    public void testSaldo0(){
   CuentaBancaria cuenta = new CuentaBancaria(0);
    assertEquals(0,cuenta.getSaldo(),0.01);
    }
    
     @Test
    public void testIngresarVarios(){
   CuentaBancaria cuenta = new CuentaBancaria(0);
   cuenta.ingresar(20);
   cuenta.ingresar(30);
    assertEquals(50,cuenta.getSaldo(),0.01);
    }
    
    @Test
   public void testRetirarVarios(){
   CuentaBancaria cuenta = new CuentaBancaria(100);
    cuenta.retirar(10);
    cuenta.retirar(15);
   assertEquals(75,cuenta.getSaldo(),0.01);
   }
    
   @Test
   public void testIngresarPoco(){
   CuentaBancaria cuenta = new CuentaBancaria(0);
    cuenta.ingresar(0.01);
    assertEquals(0.01,cuenta.getSaldo(),0.01);
   }

   @Test
   public void testIngresarCero(){
   CuentaBancaria cuenta = new CuentaBancaria(0);
   cuenta.ingresar(0);
   assertEquals(0,cuenta.getSaldo(),0.01);
   }
   
   @Test
   public void testRetirarTodo(){
   CuentaBancaria cuenta = new CuentaBancaria(100);
   cuenta.retirar(cuenta.getSaldo());
   assertEquals(0,cuenta.getSaldo(),0.01);
   }
   
   @Test
   public void testRetirarCero(){
       CuentaBancaria cuenta = new CuentaBancaria(100);
       cuenta.retirar(0);
       assertEquals(100,cuenta.getSaldo(),0.01);
         
   }
   
   @Test
   public void testIngresarMucho(){
   CuentaBancaria cuenta = new CuentaBancaria(0);
   cuenta.ingresar(2147483648.00);
   assertEquals(2147483648.00,cuenta.getSaldo(),0.01);
   
   }
   
   @Test
   public void testIngresarVariosNegativo(){
   CuentaBancaria cuenta = new CuentaBancaria(0);
   cuenta.ingresar(-123);
   cuenta.ingresar(-0.214);
   assertEquals(0,cuenta.getSaldo(),0.01);
   }
  
   
   @Test
   public void testRetirarVariosNEgativo(){
   CuentaBancaria cuenta = new CuentaBancaria(100);
   cuenta.retirar(-123);
   cuenta.retirar(-0.214);
   assertEquals(100,cuenta.getSaldo(),0.01);
   }
   
   @Test
   public void testAlternarIncorrecto(){
   CuentaBancaria cuenta = new CuentaBancaria(0);
   cuenta.retirar(-123);
   cuenta.ingresar(-0.214);
   assertEquals(0,cuenta.getSaldo(),0.01);
   }
   
   
   @Test
   public void testVariasOperaciones(){
   CuentaBancaria cuenta = new CuentaBancaria(0);
   cuenta.ingresar(123);
   cuenta.ingresar(-0.214);
   cuenta.retirar(cuenta.getSaldo());
   cuenta.retirar(100);
   assertEquals(0,cuenta.getSaldo(),0.01);

   }
   
   @Test
   public void testIngresarNegativoLanzaExcepcion(){
   CuentaBancaria cuenta = new CuentaBancaria(100);
   
      assertThrows(IllegalArgumentException.class,() -> {
           cuenta.ingresar(-10);
       });
   
   
   }
   
    
}
