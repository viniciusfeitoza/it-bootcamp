import java.time.LocalDate;

public class Estudante {
	String nome;
	LocalDate dataNascimento;
	String matricula;
	int serie;
	
	
    public Estudante (String matricula, String nome, String dateOfBirth, int serie) {
        this.matricula = matricula;
    	this.nome = nome;
        this.dataNascimento = LocalDate.parse(dateOfBirth);
        this.serie = serie;
    }


	@Override
	public String toString() {
		return nome;
	}
    
    
}