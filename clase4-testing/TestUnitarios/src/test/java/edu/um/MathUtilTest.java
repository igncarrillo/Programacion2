package edu.um;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {

    @BeforeAll
    //ejecuta las instrucciones una vez ante de todos los tests
    public static void setupAll(){
        System.out.println("Esto ocurre por unica vez al comienzo");
    }

    @BeforeEach
    //ejecuta las instrucciones antes de cada test
    public void setupEach(){
        System.out.println("Esto ocurre una vez antes de cada test");
    }

    @AfterAll
    //ejecuta las instrucciones una vez despues de todos los test
    public static void FinishAll(){
        System.out.println("Esto ocurre una vez al finalizar todos los tests");
    }

    @AfterEach
    //ejecuta las instrucciones una vez despues de cada test
    public void FinishEach(){
        System.out.println("Esto ocurre una vez al finalizar cada test");
    }

    @Test
    @DisplayName("Testea que la suma sea correcta")
    void test_Add() {
        assertEquals(5, MathUtil.add(3, 2));
    }

    @Test
    void test_Multiply() {
        assertEquals(15, MathUtil.multiple(3, 5));
    }

    @Test
    void test_Divide() {
        assertEquals(5, MathUtil.divide(25, 5));
    }

    @Test
    @Disabled
    void testIs_PrimeTrue() {
        assertTrue(MathUtil.isPrime(13));
    }

    @Test
    void testIs_PrimeFalse() {
        assertFalse(MathUtil.isPrime(6));
    }

    @Test
    void testIs_EvenFalse() {
        assertFalse(MathUtil.isEven(3));
    }

    @Test
    void testIs_EvenTrue() {
        assertTrue(MathUtil.isEven(10));
    }
}
