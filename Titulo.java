/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Calendar;

/**
 *
 * @author Felipe Bueno, Igor Fernando, João Victor Marcolino
 */
public class Titulo {
    private int tituloId;
    private Socio titular;
    private Mensalidade[] mensalidades = new Mensalidade[12];
    
    public Titulo(Socio titular){
        this.tituloId = ID.idTitulo++;
        this.titular = titular;
    }

    /**
     * @return the tituloId
     */
    public int getTituloId() {
        return tituloId;
    }

    /**
     * @param tituloId the tituloId to set
     */
    public void setTituloId(int tituloId) {
        this.tituloId = tituloId;
    }

    /**
     * @return the titular
     */
    public Socio getTitular() {
        return titular;
    }
    
    public static Titulo criar(Endereco[] enderecos){
        Socio socio = Socio.criar(enderecos);
        return new Titulo(socio);
    }
    
    public static Titulo pesquisarTitulo(int id, Titulo[] titulos){
        for(Titulo titulo : titulos){
            if(titulo.getTituloId()== id){
                return titulo;
            }
        }
        return null;
    }
    
    public Mensalidade calcularMensalidade(){
        float custo = Utilitario.custoBasico;
        for(Matricula matricula : titular.getMatriculas()){
            custo += matricula.getModalidade().getPreco();
        }
        return new Mensalidade(custo, Calendar.getInstance());
    }
    
    public boolean pagarMensalidade(int mes){
        if(mes>=1 && mes<=12){
            mensalidades[mes-1].setDataPagamento(Calendar.getInstance());
            return true;
        }else
            return false;
    }
            
    public String toString(){
        String aux = "";
        aux += "TituloId: "+this.tituloId+"\n";
        return aux;
    }
}
