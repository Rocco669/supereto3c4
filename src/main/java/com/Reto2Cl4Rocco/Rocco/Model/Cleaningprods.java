/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Reto2Cl4Rocco.Rocco.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author rocco
 */
@Document(collection = "cleaningprods")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cleaningprods {
    @Id
    private Integer id;
    private String brand;
    private String category;
    private String objetivo;
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography; 
}
