package medicamentos;

import java.time.LocalDate;
import java.util.List;

public class Antiviral extends Medicamento {
	private String tipoDeVirus; // Herpes, Influenza, HIV.
	private String mecanismoDeAcao; // Inibição de replicação viral.
	
	
	public Antiviral(String nome, String categoria, List<String> composicao, int dosagem, String viaDeAdministracao,
            LocalDate dataDeValidade, String fabricante, List<String> efeitosColaterais, String indicacao,
            String tipoDeVirus, String mecanismoDeAcao) {
		super(nome, categoria, composicao, dosagem, viaDeAdministracao, dataDeValidade, fabricante, efeitosColaterais, indicacao);
		this.tipoDeVirus = tipoDeVirus;
		this.mecanismoDeAcao = mecanismoDeAcao;
	}
	
    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Categoria: " + categoria + ", Tipo de vírus: " + tipoDeVirus + ", Mecanismo de ação: " + mecanismoDeAcao);
    }
}
