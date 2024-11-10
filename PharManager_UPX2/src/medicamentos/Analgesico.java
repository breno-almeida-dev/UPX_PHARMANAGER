package medicamentos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class Analgesico extends Medicamento {
    private String tipoDor;
    private String atuacao;

    public Analgesico(String nome, String categoria, List<String> composicao, int dosagem, String viaDeAdministracao,
            LocalDate dataDeValidade, String fabricante, List<String> efeitosColaterais, String indicacao,
                      String tipoDor, String atuacao) {
        super(nome, categoria, composicao, dosagem, viaDeAdministracao, dataDeValidade, fabricante, efeitosColaterais, indicacao);
        this.tipoDor = tipoDor;
        this.atuacao = atuacao;
    }
    
    @Override
    public void inserirDados(Connection conexao) throws SQLException {
        String sqlMedicamento = "INSERT INTO medicamentos (nome, categoria, dosagem, viaDeAdministracao, dataDeValidade, fabricante, indicacao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        String sqlAnalgesico = "INSERT INTO analgesico (tipoDor, atuacao) VALUES (?, ?)";

        try (PreparedStatement stmtMedicamento = conexao.prepareStatement(sqlMedicamento);
             PreparedStatement stmtAnalgesico = conexao.prepareStatement(sqlAnalgesico)) {
            
            // Inserir dados na tabela medicamentos
            stmtMedicamento.setString(1, getNome());
            stmtMedicamento.setString(2, getCategoria());
            stmtMedicamento.setInt(3, getDosagem());
            stmtMedicamento.setString(4, getViaDeAdministracao());
            stmtMedicamento.setObject(5, getDataDeValidade());
            stmtMedicamento.setString(6, getFabricante());
            stmtMedicamento.setString(7, getIndicacao());
            stmtMedicamento.executeUpdate();

            // Inserir dados na tabela antifungicos
            stmtAnalgesico.setString(1, tipoDor);
            stmtAnalgesico.setString(2, atuacao);
            stmtAnalgesico.executeUpdate();
        }
    }

    @Override
    public void atualizarDados(Connection conexao, int id) throws SQLException {
        String sqlMedicamento = "UPDATE medicamentos SET nome = ?, categoria = ?, dosagem = ?, viaDeAdministracao = ?, dataDeValidade = ?, fabricante = ?, indicacao = ? WHERE id = ?";
        String sqlAnalgesico = "UPDATE analgesico SET tipoDor = ?, atuacao = ? WHERE id = ?";

        try (PreparedStatement stmtMedicamento = conexao.prepareStatement(sqlMedicamento);
             PreparedStatement stmtAnalgesico = conexao.prepareStatement(sqlAnalgesico)) {
            
            // Atualizar dados na tabela medicamentos
            stmtMedicamento.setString(1, getNome());
            stmtMedicamento.setString(2, getCategoria());
            stmtMedicamento.setInt(3, getDosagem());
            stmtMedicamento.setString(4, getViaDeAdministracao());
            stmtMedicamento.setObject(5, getDataDeValidade());
            stmtMedicamento.setString(6, getFabricante());
            stmtMedicamento.setString(7, getIndicacao());
            stmtMedicamento.setInt(8, id);
            stmtMedicamento.executeUpdate();

            // Atualizar dados na tabela antifungicos
            stmtAnalgesico.setString(1, tipoDor);
            stmtAnalgesico.setString(2, atuacao);
            stmtAnalgesico.setInt(3, id);
            stmtAnalgesico.executeUpdate();
        }
    }

    @Override
    public void deletarDados(Connection conexao, int id) throws SQLException {
        String sqlMedicamento = "DELETE FROM medicamentos WHERE id = ?";
        String sqlAnalgesico = "DELETE FROM analgesico WHERE id = ?";

        try (PreparedStatement stmtMedicamento = conexao.prepareStatement(sqlMedicamento);
             PreparedStatement stmtAnalgesico = conexao.prepareStatement(sqlAnalgesico)) {
            
            // Deletar dados na tabela medicamentos
            stmtMedicamento.setInt(1, id);
            stmtMedicamento.executeUpdate();

            // Deletar dados na tabela antifungicos
            stmtAnalgesico.setInt(1, id);
            stmtAnalgesico.executeUpdate();
        }
    }

    @Override
    public void lerDados(Connection conexao) throws SQLException {
        String sql = "SELECT m.*, a.tipoDor, a.atuacao FROM medicamentos m JOIN analgesico a ON m.id = a.id";

        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Categoria: " + rs.getString("categoria"));
                System.out.println("Tipo de dor: " + rs.getString("tipoDor"));
                System.out.println("Atuação: " + rs.getString("atuacao"));
            }
        }
    }
}
