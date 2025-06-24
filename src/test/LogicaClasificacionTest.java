package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import main.LogicaClasificacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogicaClasificacionTest {

    LogicaClasificacion logica = new LogicaClasificacion();

    @Test
    void testInvertirCadena() {
        String entrada = "Hola Mundo";
        String esperada = "odnuM aloH";
        String salida = logica.invertirCadena(entrada);
        assertEquals(esperada, salida);
    }

    @Test
    void testValidarSimbolosBalanceados() {
        assertTrue(logica.validarSimbolos("{[()]}"));
        assertTrue(logica.validarSimbolos("((()))"));
    }

    @Test
    void testValidarSimbolosDesbalanceados() {
        assertFalse(logica.validarSimbolos("{[(])}"));
        assertFalse(logica.validarSimbolos("((()"));
    }

    @Test
    void testOrdenarPila() {
        Stack<Integer> pila = new Stack<>();
        pila.push(3);
        pila.push(1);
        pila.push(4);
        pila.push(2);

        List<Integer> resultado = logica.ordenarPila(pila);
        List<Integer> esperado = Arrays.asList(1, 2, 3, 4);
        assertEquals(esperado, resultado);
    }

    @Test
    void testClasificarPorParidad() {
        LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> resultado = logica.clasificarPorParidad(original);
        List<Integer> esperado = Arrays.asList(2, 4, 6, 1, 3, 5);
        assertEquals(esperado, resultado);
    }
}
