/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Felipe Bueno, Igor Fernando, João Victor Marcolino
 */

import java.util.Calendar;

public class Socio {
    private int socioId;
    private String cpf;
    private String nome;
    private Endereco endereco;
    private Calendar dataNasc;
    private Matricula[] matriculas;
    
    public Socio(String nm, String cpf, Calendar dataNasc, Endereco end){
        this.socioId = ID.idSocio++;
        this.nome = nm;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = end;
    }

    /**
     * @return the socioId
     */
    public int getSocioId() {
        return socioId;
    }

    /**
     * @param socioId the socioId to set
     */
    public void setSocioId(int socioId) {
        this.socioId = socioId;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the dataNasc
     */
    public Calendar getDataNasc() {
        return dataNasc;
    }

    /**
     * @param dataNasc the dataNasc to set
     */
    public void setDataNasc(Calendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     * @return the matricula
     */
    public Matricula[] getMatriculas() {
        return matriculas;
    }
    
    public static Socio criar(Endereco[] enderecos){
        int idEndereco;
        String nome, cpf;
        Calendar dataNasc;
        Endereco end = null;
        System.out.println("Insira seu nome: ");
        nome = Leitura.lerString();
        System.out.println("Insira seu cpf: ");
        cpf = Leitura.lerString();
        System.out.println("Insira sua data de Nascimento: ");
        dataNasc = Calendar.getInstance();
        System.out.println("Insira a Id do Endereco: ");
        idEndereco = Leitura.lerInt();
        if(Endereco.pesquisarEndereco(idEndereco, enderecos)== null){
            end = Endereco.criar();
        }else
            Endereco.pesquisarEndereco(idEndereco, enderecos);
        
        return new Socio(nome, cpf, dataNasc, end);
    }
    
    public static Socio pesquisarSocio(int id, Socio[] socios){
        for(Socio socio : socios){
            if(socio.getSocioId()==id){
                return socio;
            }
        }
        return null;
    }
    
    public boolean matricular(int modalidadeId, Modalidade[] modalidades){
        Modalidade modalidade;
        if(Modalidade.pesquisarModalidade(modalidadeId, modalidades) != null){
            modalidade = Modalidade.pesquisarModalidade(modalidadeId, modalidades);
            for(int i=0;i<matriculas.length;i++){
                if(matriculas[i]==null){
                    matriculas[i] = new Matricula(modalidade, Calendar.getInstance());
                    break;
                }
            }
            return true;
        }else
            return false;
    }
    
    public boolean desmatricular(int matriculaId){
        for(Matricula matricula : matriculas){
            if(matricula.getMatriculaId() == matriculaId){
                matricula.setDataTermino(Calendar.getInstance());
                return true;
            }
        }
        return false;
    }
    
    public String toString(){
        String aux = "";
        aux += "SocioId: "+this.socioId+"\n"+"Nome: "+this.nome+"\n"+"Cpf: "+this.cpf;
        aux += "\n"+"Data de Nascimento: "+this.dataNasc;
        return aux;
    }
}
