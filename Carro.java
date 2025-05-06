/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_lee_keonjae;

/**
 *
 * @author keonj
 */
public class Carro {
    private String color;
    private String marca;
    private int año;
    private String placa;
    private Combustible combustible;

    public Carro(String color, String marca, int año, String placa, Combustible combustible) {
        this.color = color;
        this.marca = marca;
        this.año = año;
        this.placa = placa;
        this.combustible = combustible;
    }

    public void acelerar() {
        System.out.println("El carro está acelerando.");
    }

    public void frenar() {
        System.out.println("El carro está frenando.");
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }
}
