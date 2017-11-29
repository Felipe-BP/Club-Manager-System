/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Felipe Bueno, Igor Fernando e João Victor Marcolino
 */
public class Familiar extends Titulo{
    private Socio[] dependentes; 
            
    public Familiar(Socio titular){
        super(titular);
    }
    
    public String toString(){
        return super.toString();
    }
}
