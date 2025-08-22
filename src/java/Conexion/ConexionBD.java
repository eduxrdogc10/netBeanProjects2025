/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Garcia
 */
public class ConexionBD {
    public DriverManagerDataSource conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
        dataSource.setUrl("jdbc:mariadb://localhost:3307/cux");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }
}
