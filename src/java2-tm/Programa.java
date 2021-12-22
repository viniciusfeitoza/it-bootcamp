
public class Programa {
	
	public static void main(String[] args) {
		
		Estudante a = new Estudante("00001", "Vinicius", "1999-03-03", 9);
		Estudante b = new Estudante("00002", "Pedro", "1995-07-14", 9);
		Estudante c = new Estudante("00003", "Carlos", "2001-06-22", 9);
		Estudante d = new Estudante("00004", "Julia", "2002-07-31", 9);
		Estudante e = new Estudante("00005", "Alexandre", "1997-01-02", 8);
		
		Disciplina matematica = new Disciplina("Matematica", 40);
		Disciplina portugues = new Disciplina("Portugues", 20);
		Disciplina historia = new Disciplina("Historia", 40);
		Disciplina geografia = new Disciplina("Geografia", 30);
		
		Turma turmaA = new Turma("A", 9);
		Turma turmaB = new Turma("B", 9);
		
		turmaA.addDisciplina(matematica);
		turmaA.addDisciplina(portugues);
		turmaB.addDisciplina(historia);
		turmaB.addDisciplina(geografia);
		
		turmaA.addEstudante(a);
		turmaA.addEstudante(b);
		turmaA.addEstudante(c);
		turmaB.addEstudante(d);
		turmaB.addEstudante(e);

		Turma[] turmas = {turmaA, turmaB};
		
        for (Turma turma : turmas) {
            System.out.printf("A turma %s possui os %d alunos: %s \n", turma.getCodigo(), turma.getEstudantes().size(), turma.getEstudantes());
            System.out.printf("E as %d disciplinas: %s \n\n", turma.getDisciplinas().size(), turma.getDisciplinas());
        }		
	}
}
