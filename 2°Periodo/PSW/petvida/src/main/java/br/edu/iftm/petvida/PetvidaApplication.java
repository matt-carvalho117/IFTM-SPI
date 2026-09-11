package br.edu.iftm.petvida;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.edu.iftm.petvida.model.Animal;
import br.edu.iftm.petvida.model.Tutor;
import br.edu.iftm.petvida.repository.AnimalRepository;
import br.edu.iftm.petvida.repository.TutorRepository;

@SpringBootApplication
public class PetvidaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetvidaApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(TutorRepository tutorRepo, AnimalRepository animalRepo) {
        return args -> {
            // 1. Cadastrar os tutores
            Tutor t1 = new Tutor(117, "Matt", "(11) 98888-1111");
            tutorRepo.salvar(t1);

            // 2. Cadastrar os animais associados aos tutores
            Animal a1 = new Animal(47, "Mynerva", "Cachorro", 4, t1);
            animalRepo.salvar(a1);
            Tutor marina = new Tutor(1, "Marina Alves", "34 99101-0001");
            Tutor carlos = new Tutor(2, "Carlos Prado", "34 99101-0002");
            Tutor meuTutor = new Tutor(111, "Seu Nome", "34 91111-1111");

            tutorRepo.salvar(marina);
            tutorRepo.salvar(carlos);
            tutorRepo.salvar(meuTutor);

            animalRepo.salvar(new Animal(2, "Mimi", "gato", 3, marina));
            animalRepo.salvar(new Animal(3, "Thor", "cao", 1, carlos));
            animalRepo.salvar(new Animal(4, "Lila", "gato", 11, carlos));
            animalRepo.salvar(new Animal(111, "Pet_11", "cao", 11, meuTutor));

            System.out.println("Tabelas criadas pelo schema.sql e dados inseridos via JDBC API!");
        };
    }
}
