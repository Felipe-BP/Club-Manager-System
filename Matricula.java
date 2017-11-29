package Classes;

import java.util.Calendar;

public class Matricula{
	private int matriculaId;
	private Modalidade modalidade;
	private Calendar dataInicio;
	private Calendar dataTermino;

	public Matricula(Modalidade modalidade, Calendar dataInicio){
		this.matriculaId = ID.idMatricula++;
		this.modalidade = modalidade;
		this.dataInicio = dataInicio;
	}

	public void setMatriculaId(int matriculaId){
		this.matriculaId = matriculaId;
	}

	public int getMatriculaId(){
		return this.matriculaId;
	}

	public Modalidade getModalidade(){
		return this.modalidade;
	}

	public void setDataInicio(Calendar dataInicio){
		this.dataInicio = dataInicio;
	}

	public Calendar getDataInicio(){
		return this.dataInicio;
	}

	public void setDataTermino(Calendar dataTermino){
		this.dataTermino = dataTermino;
	}

	public Calendar getDataTermino(){
		return this.dataTermino;
	}
        
        public String toString(){
            String aux = "";
            aux += "MatriculaID: "+this.matriculaId+"\n"+"Modalidade: "+this.modalidade+"\n";
            aux += "Data Inicio"+this.dataInicio+"\n"+"Data Termino: "+this.dataTermino;
            return aux;
        }
}