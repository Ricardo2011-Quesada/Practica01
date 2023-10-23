
package com.arbol_01.dao;

import com.arbol_01.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArbolDao extends JpaRepository <Arbol, Long>{
    
}
