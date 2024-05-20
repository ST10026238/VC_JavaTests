/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package vc_unittesteg1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 *
 * @author lab_services_student
 */
public class PersonTest {
    
    public PersonTest() {
    }

    @Test
    public void testName() {
        //Arrange
        String expected = "Moagi";
        
        //Act
        Person p = new Person();
        String actual = p.getName();
        
        //Assert
        assertEquals(expected, actual); //Comparing if the parameters are equal 
    }
    
    @Test
    public void testSum(){
       //Arrange
       int expected = 8;
    
       //Act
       Person p = new Person();
       int actual = p.calcSum( 4, 4);
    
        //Assert
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStatus(){
        //Act
        Person p = new Person();
        boolean actual = p.checkStatus(50);
        
        //Assert
        assertTrue(actual);
    }
    
}
