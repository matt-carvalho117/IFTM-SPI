package br.edu.iftm.petvida;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TutorRepository {
    @Autowired
    private JdbcTemplate jdbc;
    public void salvar(Tutor tutor) {
        String sql = "INSERT INTO tutor (id_tutor, nome, telefone) VALUES (?, ?, ?)";
        jdbc.update(sql, tutor.getId(), tutor.getNome(), tutor.getTelefone());
    }

    public List<Tutor> buscarTodos() {
        return jdbc.query("SELECT * FROM tutor", (rs, rowNum) -> 
            new Tutor(rs.getInt("id_tutor"), rs.getString("nome"), rs.getString("telefone"))
        );
    }

    public Tutor buscarPorId(Integer id) {
        List<Tutor> resultados = jdbc.query("SELECT * FROM tutor WHERE id_tutor = ?", (rs, rowNum) -> 
            new Tutor(rs.getInt("id_tutor"), rs.getString("nome"), rs.getString("telefone"))
        , id);
        return resultados.isEmpty() ? null : resultados.get(0);
    }
}
