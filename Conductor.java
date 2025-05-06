/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_lee_keonjae;

/**
 *
 * @author keonj
 */
public class Conductor {
    private String nombre;
    private String genero;
    private int edad;

    public Conductor(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    public void conducir(Carro carro) {
        System.out.println(nombre + " está conduciendo el carro " + carro.getMarca() + " " + carro.getPlaca());
    }
}
