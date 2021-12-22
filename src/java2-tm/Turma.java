import java.util.ArrayList;
import java.util.List;

public class Turma {
	String codigo;
	int serie;
	List<Estudante> estudantes;
	List<Disciplina> disciplinas;
	
	public Turma(String codigo, int serie) {
		this.codigo = codigo;
		this.serie = serie;		
		this.disciplinas = new ArrayList<>();
		this.estudantes = new ArrayList<>();
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public int getSerie() {
		return serie;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public List<Estudante> getEstudantes() {
		return estudantes;
	}
	
    void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    void addEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }	
    
    

}