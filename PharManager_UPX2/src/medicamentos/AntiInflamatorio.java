package medicamentos;

import java.time.LocalDate;
import java.util.List;

public class AntiInflamatorio extends Medicamento {
	private String tipo; // Esteroidal ou não esteroidal (AINE).
	private String finalidade; // Redução de dor, inflamação ou ambos.
	
	public AntiInflamatorio(String nome, String categoria, List<String> composicao, int dosagem, String viaDeAdministracao,
            LocalDate dataDeValidade, String fabricante, List<String> efeitosColaterais, String indicacao,
            String tipo, String finalidade) {
		super(nome, categoria, composicao, dosagem, viaDeAdministracao, dataDeValidade, fabricante, efeitosColaterais, indicacao);
		this.tipo = tipo;
		this.finalidade = finalidade;
	}
	
    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Categoria: " + categoria + ", Tipo: " + tipo + ", Finalidade: " + finalidade);
    }
}
