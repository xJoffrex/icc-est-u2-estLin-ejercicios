package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte una cadena de texto utilizando una pila (Stack).
     *
     * @param texto Cadena original a invertir.
     * @return Cadena invertida.
     *
     *         Ejemplo:
     *         Entrada: "Hola Mundo"
     *         Salida: "odnuM aloH"
     */
    public String invertirCadena(String texto) {
        Stack<Character> pila = new Stack<>();
        for (char c : texto.toCharArray()){
            pila.push(c);
        }
        StringBuilder invertido = new StringBuilder();
        while (!pila.isEmpty()){
            invertido.append(pila.pop());
        }
        return invertido.toString();
    }

    /**
     * Verifica si los símbolos de paréntesis, corchetes y llaves están bien
     * balanceados.
     *
     * @param expresion Cadena con símbolos.
     * @return true si está balanceada, false en caso contrario.
     *
     *         Ejemplo:
     *         Entrada: "{[()]}"
     *         Salida: true
     */

    public boolean validarSimbolos(String expresion) {
        Stack<Character> pilaA = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pilaA.push(c);
            } else if (c == ')') {
                if (pilaA.isEmpty() || pilaA.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (pilaA.isEmpty() || pilaA.pop() != '{') {
                    return false;
                }
            } else if (c == ']') {
                if (pilaA.isEmpty() || pilaA.pop() != '[') {
                    return false;
                }
            }
        }

        return pilaA.isEmpty();
    }

    /**
     * Ordena una pila de enteros en orden ascendente usando otra pila auxiliar.
     *
     * @return Lista ordenada.
     *
     *         Ejemplo:
     *         Entrada: [3, 1, 4, 2]
     *         Salida: [1, 2, 3, 4]
     */
    public List<Integer> ordenarPila(Stack<Integer> pila) {
        Stack<Integer> auxilia = new Stack<>();
        while (!pila.isEmpty()) {
            int temp = pila.pop();
            while (!auxilia.isEmpty() && auxilia.peek() > temp) {
                pila.push(auxilia.pop());
            }
                auxilia.push(temp);
        }
        return auxilia;
    }

    /**
     * Clasifica una lista de enteros separando pares e impares.
     * Usa LinkedList para mantener el orden de inserción.
     *
     * @return Lista con pares primero, luego impares.
     *
     *         Ejemplo:
     *         Entrada: [1, 2, 3, 4, 5, 6]
     *         Salida: [2, 4, 6, 1, 3, 5]
     */
    public List<Integer> clasificarPorParidad(LinkedList<Integer> original) {
        LinkedList<Integer> nuevop = new LinkedList<>();
        LinkedList<Integer> nuevoi = new LinkedList<>();
        LinkedList<Integer> combinada = new LinkedList<>();
        for (int i = 0 ; i < original.size() ; i++){
           if (original.get(i) % 2 == 0){
                nuevop.add(original.get(i));  
           }else{
                nuevoi.add(original.get(i));
           }


           
                
        }
        combinada.addAll(nuevop);
        combinada.addAll(nuevoi);
           
        return combinada;
    }
}
