package Classes;

public class Modalidade{
	private int modalidadeId, frequenciaSemanal;
	private float preco;
	private String nome;

	public Modalidade(int frequenciaSemanal, float preco, String nome){
		this.modalidadeId = ID.idModalidade++;
		this.frequenciaSemanal = frequenciaSemanal;
		this.preco = preco;
		this.nome = nome;
	}

         /**
         * @return the modalidadeId
         */
        public int getModalidadeId() {
            return modalidadeId;
        }

         /**
         * @param modalidadeId the modalidadeId to set
         */
        public void setModalidadeId(int modalidadeId) {
            this.modalidadeId = modalidadeId;
        }

         /**
         * @return the frequenciaSemanal
         */
        public int getFrequenciaSemanal() {
            return frequenciaSemanal;
        }

         /**
         * @param frequenciaSemanal the frequenciaSemanal to set
         */
        public void setFrequenciaSemanal(int frequenciaSemanal) {
            this.frequenciaSemanal = frequenciaSemanal;
        }

         /**
         * @return the preco
         */
        public float getPreco() {
            return preco;
        }

         /**
         * @param preco the preco to set
         */
        public void setPreco(float preco) {
            this.preco = preco;
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
    
	public static Modalidade criar(){
		String nm;
		float custo;
		int presencaSemanal;
		System.out.println("Insira seu nome: ");
		nm = Leitura.lerString();
		System.out.println("Insira a frequencia Semanal: ");
		presencaSemanal = Leitura.lerInt();
		System.out.println("Insira o preco da Modalidade: ");
		custo = Leitura.lerFloat();
		return new Modalidade(presencaSemanal, custo, nm);
	}

	public static Modalidade pesquisarModalidade(int id, Modalidade[] modalidades){
            for(Modalidade modalidade : modalidades){
                if(modalidade.getModalidadeId()==id){
                    return modalidade;
                }
            }
            return null;
	}
        
        public String toString(){
            String aux = "";
            aux += "ModalidadeId: "+this.modalidadeId+"\n"+"Preco: R$"+this.preco+"\n";
            aux += "Nome: "+this.nome+"\n"+"Frequencia Semanal: "+this.frequenciaSemanal;
            return aux;
        }

}