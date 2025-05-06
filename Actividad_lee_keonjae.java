/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_lee_keonjae;

/**
 *
 * @author keonj
 */
public class Actividad_lee_keonjae {

    public static void main(String[] args) {
        Combustible gasolina = new Combustible("Gasolina");
        Carro carro = new Carro("Rojo", "Toyota", 2020, "ABC-123", gasolina);
        Conductor conductor = new Conductor("Ana", "Femenino", 30);

        gasolina.alimentar();
        conductor.conducir(carro);
        carro.acelerar();
        carro.frenar();
    }
}
