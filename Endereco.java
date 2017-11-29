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
public class Endereco {
    private int enderecoId;
    private String rua;
    private int numero;
    private String cep;
    private String cidade;
    private String estado;
    
    public Endereco(String rua, int num, String cep, String cidade, String estado){
        this.enderecoId = ID.idEndereco++;
        this.rua = rua;
        this.numero = num;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    /**
     * @return the enderecoId
     */
    public int getEnderecoId() {
        return enderecoId;
    }

    /**
     * @param enderecoId the enderecoId to set
     */
    public void setEnderecoId(int enderecoId) {
        this.enderecoId = enderecoId;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String toString(){
        String aux = "";
        aux += "EnderecoId: " + this.enderecoId + " Rua: " + this.rua + ", " + this.numero + "\n";
        aux += "Cep: " + this.cep + " Cidade: " + this.cidade + " Estado: " + this.estado + "\n";
        return aux;
    }
    
    public static Endereco criar(){
        int num;
        String rua, cep, cidade, estado;
        System.out.println("Insira o numero da sua residencia: ");
        num = Leitura.lerInt();
        System.out.println("Insira sua rua: ");
        rua = Leitura.lerString();
        System.out.println("Insira o seu cep: ");
        cep = Leitura.lerString();
        System.out.println("Insira sua cidade: ");
        cidade = Leitura.lerString();
        System.out.println("Insira o seu estado: ");
        estado = Leitura.lerString();
        
        return new Endereco(rua, num, cep, cidade, estado);
    }
    
    public static Endereco pesquisarEndereco(int id, Endereco[] enderecos){
	for(Endereco endereco : enderecos){
            if(endereco.getEnderecoId()== id){
		return endereco;
            }
	}
        return null;
    }
}
