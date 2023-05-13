/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.portfolio.nn.Controller;

import com.portfolio.nn.Entity.Persona;
import java.util.List;
import static org.testng.Assert.*;

/**
 *
 * @author nahii
 */
public class PersonaControllerNGTest {
    
    public PersonaControllerNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getPersona method, of class PersonaController.
     */
    @org.testng.annotations.Test
    public void testGetPersona() {
        System.out.println("getPersona");
        PersonaController instance = new PersonaController();
        List expResult = null;
        List result = instance.getPersona();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPersona method, of class PersonaController.
     */
    @org.testng.annotations.Test
    public void testCreatePersona() {
        System.out.println("createPersona");
        Persona persona = null;
        PersonaController instance = new PersonaController();
        String expResult = "";
        String result = instance.createPersona(persona);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePersona method, of class PersonaController.
     */
    @org.testng.annotations.Test
    public void testDeletePersona() {
        System.out.println("deletePersona");
        long id = 0L;
        PersonaController instance = new PersonaController();
        String expResult = "";
        String result = instance.deletePersona(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editPersona method, of class PersonaController.
     */
    @org.testng.annotations.Test
    public void testEditPersona() {
        System.out.println("editPersona");
        long id = 0L;
        String nuevoNombre = "";
        String nuevoApellido = "";
        String nuevoImg = "";
        PersonaController instance = new PersonaController();
        Persona expResult = null;
        Persona result = instance.editPersona(id, nuevoNombre, nuevoApellido, nuevoImg);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPersona method, of class PersonaController.
     */
    @org.testng.annotations.Test
    public void testFindPersona() {
        System.out.println("findPersona");
        PersonaController instance = new PersonaController();
        Persona expResult = null;
        Persona result = instance.findPersona();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
