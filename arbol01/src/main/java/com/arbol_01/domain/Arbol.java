
package com.arbol_01.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable { //serializacion funciona para almacenar ciertos datos en el disco
    
    private static final long serialVersionUID =1L; //para poder hacer el ciclo de la sumatoria del ID arbol
    
    
    @Id //tabla arbol tiene una llave o identificador que va a ser el ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Los valores generados que tipo de estrategia utiliza, identico = en la BD y en la clase
    @Column(name="id_arbol") //decir cual es el nombre de la columna en la base de datos    
    private long idArbol;
    private String nombre_comun;
    private String tipo_flor;
    private String dureza_madera;
    private String imagen_ruta;
    private boolean activo;

    
    public Arbol(){
        
    }


    public Arbol(String nombre_comun, String tipo_flor, String dureza_madera,  boolean activo) {
        this.nombre_comun = nombre_comun;
        this.tipo_flor = tipo_flor;
        this.dureza_madera = dureza_madera;
        this.activo = activo;
    }
    
    
}
