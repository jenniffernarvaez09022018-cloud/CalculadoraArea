/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraarea;

/**
 *
 * @author point
 */
public class CalculadoraArea {
        public static void main(String[] args) {
        // Valores de prueba
        double base = 12.5;
        double altura = 5.0;

        // 5. Llamada al método desde el main y mostrar resultado
        double resultado = calcularAreaRectangulo(base, altura);
        
        System.out.println("El área del rectángulo es: " + resultado);
    }

    // 1. Declaración del método
    // 2. Recibe dos parámetros (base y altura)
    public static double calcularAreaRectangulo(double base, double altura) {
        // 3. Realiza el cálculo
        double area = base * altura;
        
        // 4. Retorna el resultado
        return area;
    

    }
}
