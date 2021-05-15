package com.back.testit.model;


import lombok.Data;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;

@Data
@Entity
public class usuario implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUsuario;

    private String nombre;
    private String contraseña;
    private File img ;


}
