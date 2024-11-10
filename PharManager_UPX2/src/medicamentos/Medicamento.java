package medicamentos;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

abstract class Medicamento {
	protected String nome; // Nome do medicamento.
	protected String categoria; // Analgésico, Antibiótico, Anti-inflamatório, etc.
	protected List<String> composicao; // Principais substâncias químicas.
	protected int dosagem; // Quantidade por unidade (mg, mL, etc.).
	protected String viaDeAdministracao; // Oral, injetável, tópica, etc.
	protected LocalDate dataDeValidade; // Validade do medicamento.
	protected String fabricante; // Empresa produtora.
	protected List<String> efeitosColaterais; // Possíveis reações adversas.
	protected String indicacao; // Doenças ou condições tratadas.
	
	
    public Medicamento(String nome, String categoria, List<String> composicao, int dosagem, String viaDeAdministracao,
            LocalDate dataDeValidade, String fabricante, List<String> efeitosColaterais, String indicacao) {
		this.nome = nome;
		this.categoria = categoria;
		this.composicao = composicao;
		this.dosagem = dosagem;
		this.viaDeAdministracao = viaDeAdministracao;
		this.dataDeValidade = dataDeValidade;
		this.fabricante = fabricante;
		this.efeitosColaterais = efeitosColaterais;
		this.indicacao = indicacao;
	}
    
    // Métodos abstratos para CRUD
    public abstract void inserirDados(Connection conexao) throws SQLException;
    public abstract void atualizarDados(Connection conexao, int id) throws SQLException;
    public abstract void deletarDados(Connection conexao, int id) throws SQLException;
    public abstract void lerDados(Connection conexao) throws SQLException;

    //Setters
    protected void setNome(String nome) { 
    	this.nome = nome; 
	}
    protected void setCategoria(String categoria) { 
    	this.categoria = categoria; 
	}
    protected void setComposicao(List<String> composicao) { 
    	this.composicao = composicao; 
	}
    protected void setDosagem(int dosagem) { 
    	this.dosagem = dosagem; 
	}
    protected void setViaDeAdministracao(String viaDeAdministracao) { 
    	this.viaDeAdministracao = viaDeAdministracao; 
	}
    protected void setDataDeValidade(LocalDate dataDeValidade) { 
    	this.dataDeValidade = dataDeValidade; 
	}
    protected void setFabricante(String fabricante) { 
    	this.fabricante = fabricante; 
	}
    protected void setEfeitosColaterais(List<String> efeitosColaterais) { 
    	this.efeitosColaterais = efeitosColaterais; 
	}
    protected void setIndicacao(String indicacao) { 
    	this.indicacao = indicacao; 
	}
    
    //Getters
    protected String getNome() { 
    	return nome; 
	}
    protected String getCategoria() { 
    	return categoria; 
	}
    protected List<String> getComposicao() { 
    	return composicao; 
	}
    protected int getDosagem() { 
    	return dosagem; 
	}
    protected String getViaDeAdministracao() { 
    	return viaDeAdministracao; 
	}
    protected LocalDate getDataDeValidade() { 
    	return dataDeValidade; 
	}
    protected String getFabricante() { 
    	return fabricante; 
	}
    protected List<String> getEfeitosColaterais() { 
    	return efeitosColaterais; 
	}
    protected String getIndicacao() { 
    	return indicacao; 
	}
}
