package com.example.lab3_20200825.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="jugador")
@Getter
@Setter
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idJugador",nullable=false)
    private Integer idjugador;
    @Column(name="nombre",nullable=false)
    private String nombre;
    @Column(name="edad",nullable=false)
    private int edad;
    @Column(name="posicion",nullable=false)
    private String posicion;
    @Column(name="club",nullable=false)
    private String club;
    @Column(name="sn_idSeleccion",nullable=false)
    private int sn_idSeleccion;
}
