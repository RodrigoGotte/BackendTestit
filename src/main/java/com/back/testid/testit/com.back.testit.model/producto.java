package com.back.testit.model;


import lombok.Data;


import javax.persistence.*;
import java.io.File;
import java.io.Serializable;

@Data
@Entity
public class producto implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idproducto;

    private String nombre;
    private String descripcion;
    private Double Precio;
    private File img ;


}
