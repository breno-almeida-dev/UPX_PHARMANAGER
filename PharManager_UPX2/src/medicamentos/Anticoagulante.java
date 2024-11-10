package medicamentos;

import java.time.LocalDate;
import java.util.List;

public class Anticoagulante extends Medicamento {
	private String tipoDeAcao; // Preventivo ou terapêutico.
	private String condicaoTratada; // Trombose, AVC.
	
	public Anticoagulante(String nome, String categoria, List<String> composicao, int dosagem, String viaDeAdministracao,
            LocalDate dataDeValidade, String fabricante, List<String> efeitosColaterais, String indicacao,
            String tipoDeAcao, String condicaoTratada) {
		super(nome, categoria, composicao, dosagem, viaDeAdministracao, dataDeValidade, fabricante, efeitosColaterais, indicacao);
		this.tipoDeAcao = tipoDeAcao;
		this.condicaoTratada = condicaoTratada;
	}
	
    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Categoria: " + categoria + ", Tipo de Ação: " + tipoDeAcao + ", Condição Tratada: " + condicaoTratada);
    }

}
