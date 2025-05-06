/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_lee_keonjae;

/**
 *
 * @author keonj
 */
public class Combustible {
    private String tipo;

    public Combustible(String tipo) {
        this.tipo = tipo;
    }

    public void alimentar() {
        System.out.println("El carro está siendo alimentado con " + tipo);
    }
}
