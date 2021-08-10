package br.edu.infnet.model.domain;

public class Aluno {
	private String nome;
	private String email; 
	private String obs; 
	private String regiao; 
	private String curso; 
	private String[] disciplina;
	private String senha;
	
	public Aluno(String nome, String email) {
		this.nome=nome;
		this.email=email;
	}
	
	@Override
	public String toString() {
		return String.format("[%s] O usuário %s (%s) da região %s está inscrito nas modalidades: %d \n",
				curso, nome, email, regiao, disciplina.length);
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String[] getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String[] disciplina) {
		this.disciplina = disciplina;
	} 
	
	
}
