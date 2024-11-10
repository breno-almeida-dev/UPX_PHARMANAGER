package medicamentos;

import java.time.LocalDate;
import java.util.List;

public class Diuretico extends Medicamento {
	private String tipo;
	private String condicaoTratada;
	
	public Diuretico(String nome, String categoria, List<String> composicao, int dosagem, String viaDeAdministracao,
            LocalDate dataDeValidade, String fabricante, List<String> efeitosColaterais, String indicacao,
            String tipo, String condicaoTratada) {
		super(nome, categoria, composicao, dosagem, viaDeAdministracao, dataDeValidade, fabricante, efeitosColaterais, indicacao);
		this.tipo = tipo;
		this.condicaoTratada = condicaoTratada;
	}
	
    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Categoria: " + categoria + ", Tipo: " + tipo + ", Condição tratada: " + condicaoTratada);
    }

}
