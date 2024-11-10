package medicamentos;

import java.time.LocalDate;
import java.util.List;

public class Vacina extends Medicamento{
	private String tipoDeVacina; // Inativada, atenuada, mRNA.
	private String doencaAlvo; // Gripe, Sarampo, COVID-19.
	
	public Vacina(String nome, String categoria, List<String> composicao, int dosagem, String viaDeAdministracao,
            LocalDate dataDeValidade, String fabricante, List<String> efeitosColaterais, String indicacao,
            String tipoDeVacina, String doencaAlvo) {
		super(nome, categoria, composicao, dosagem, viaDeAdministracao, dataDeValidade, fabricante, efeitosColaterais, indicacao);
		this.tipoDeVacina = tipoDeVacina;
		this.doencaAlvo = doencaAlvo;
	}
	
    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Categoria: " + categoria + ", Tipo de Vacina: " + tipoDeVacina + ", Doença Alvo: " + doencaAlvo);
    }
}
