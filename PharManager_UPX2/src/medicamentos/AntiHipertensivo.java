package medicamentos;

import java.time.LocalDate;
import java.util.List;

public class AntiHipertensivo extends Medicamento {
	private String mecanismoDeAcao;
	
	
	public AntiHipertensivo(String nome, String categoria, List<String> composicao, int dosagem, String viaDeAdministracao,
            LocalDate dataDeValidade, String fabricante, List<String> efeitosColaterais, String indicacao,
            String mecanismoDeAcao) {
		super(nome, categoria, composicao, dosagem, viaDeAdministracao, dataDeValidade, fabricante, efeitosColaterais, indicacao);
		this.mecanismoDeAcao = mecanismoDeAcao;		
	}
	
    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Categoria: " + categoria + ", Efeitos colaterais: " + efeitosColaterais + ", Mecanismo de Ação: " + mecanismoDeAcao);
    }
}
