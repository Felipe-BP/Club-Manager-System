/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Calendar;

/**
 *
 * @author Felipe Bueno, Igor Fernando e João Victor Marcolino
 */
public class Familiar extends Titulo{
    private Socio[] dependentes; 
            
    public Familiar(Socio titular){
        super(titular);
        for(int i=0;i<dependentes.length;i++){
            dependentes[i] = super.getTitular();
        }
    }
    
    @Override
    public Mensalidade calcularMensalidade(){
        int i = dependentes.length;
        float custo = Utilitario.custoBasico + (Utilitario.custoDependente * i);
        for(Matricula matricula : super.getTitular().getMatriculas()){
            custo += matricula.getModalidade().getPreco();
        }
        return new Mensalidade(custo, Calendar.getInstance());
    }
    
    public String toString(){
        return super.toString();
    }
}
