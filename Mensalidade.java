package Classes;

import java.util.Calendar;

public class Mensalidade{
	private int mensalidadeId;
	private Calendar dataEmissao;
	private float valor;
	private Calendar dataPagamento;

	public Mensalidade(float valor, Calendar dataEmissao){
		this.mensalidadeId = ID.idMensalidade++;
		this.valor = valor;
		this.dataEmissao = dataEmissao;
	}

    /**
     * @return the mensalidadeId
     */
    public int getMensalidadeId() {
        return mensalidadeId;
    }

    /**
     * @param mensalidadeId the mensalidadeId to set
     */
    public void setMensalidadeId(int mensalidadeId) {
        this.mensalidadeId = mensalidadeId;
    }

    /**
     * @return the dataEmissao
     */
    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * @param dataEmissao the dataEmissao to set
     */
    public void setDataEmissao(Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the dataPagamento
     */
    public Calendar getDataPagamento() {
        return dataPagamento;
    }

    /**
     * @param dataPagamento the dataPagamento to set
     */
    public void setDataPagamento(Calendar dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    public String toString(){
        String aux = "";
        aux += "MesalidadeId: "+this.mensalidadeId+"\n"+"Valor: R$"+this.valor+"\n";
        aux += "Data Emissão: "+this.dataEmissao+"\n"+"Data Pagamento: "+this.dataPagamento;
        return aux;
    }
}