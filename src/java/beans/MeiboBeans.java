/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author kouta
 */

@Named("myBean")
@RequestScoped
public class MeiboBeans {
    private Integer number = 3;
    private String name = "TEST";
    
    public Integer getNumber(){
        return number;
    }
    
    public void setNumber(Integer number){
        this.number = number;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
}
