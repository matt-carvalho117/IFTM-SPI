package br.edu.iftm.petvida.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.edu.iftm.petvida.model.Animal;
import br.edu.iftm.petvida.model.Tutor;
@Repository
public class AnimalRepository {
    private final JdbcTemplate jdbc;
    public AnimalRepository(JdbcTemplate jdbc) { this.jdbc = jdbc; }

    public Animal buscarPorId(int id) {
        String sql = "SELECT a.*, t.nome as t_nome, t.telefone FROM animal a JOIN tutor t ON a.tutor_id_tutor = t.id_tutor WHERE a.id_animal = ?";
        return jdbc.queryForObject(sql, (rs, rowNum) -> {
            Tutor t = new Tutor(rs.getInt("tutor_id_tutor"), rs.getString("t_nome"), rs.getString("telefone"));
            return new Animal(rs.getInt("id_animal"), rs.getString("nome"), rs.getString("especie"), rs.getInt("idade"), t);
        }, id);
    }

    public int contarAnimais() {
        return jdbc.queryForObject("SELECT COUNT(*) FROM animal", Integer.class);
    }

    public double mediaIdade() {
        return jdbc.queryForObject("SELECT CAST(AVG(idade) AS DOUBLE) FROM animal", Double.class);
    }

    public String animalMaisVelho() {
        return jdbc.queryForObject("SELECT nome FROM animal ORDER BY idade DESC LIMIT 1", String.class);
    }

    public int contarAnimaisDoTutor(int idTutor) {
        return jdbc.queryForObject("SELECT COUNT(*) FROM animal WHERE tutor_id_tutor = ?", Integer.class, idTutor);
    }

    public void salvar(Animal animal) {
        jdbc.update("INSERT INTO animal (id_animal, nome, especie, idade, tutor_id_tutor) VALUES (?, ?, ?, ?, ?)",
            animal.getId(), animal.getNome(), animal.getEspecie(), animal.getIdade(), animal.getTutor().getId());
    }
}