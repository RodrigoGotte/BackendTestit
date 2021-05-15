package com.back.testit.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
public class carrito implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCarrito;

    private Integer tipo;
    private Double buyinmonth;
    private Date lastbuy;



}
