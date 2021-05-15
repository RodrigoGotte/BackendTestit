
package com.back.testid.testit.dao;

import  com.back.testid.testit.models.producto;
import org.springframework.data.repository.CrudRepository;


public interface ProductoDao extends CrudRepository<producto, Long>{
    
}
