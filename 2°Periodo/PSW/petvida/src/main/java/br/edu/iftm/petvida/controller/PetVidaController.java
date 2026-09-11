package br.edu.iftm.petvida.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.iftm.petvida.model.Animal;
import br.edu.iftm.petvida.model.Tutor;
import br.edu.iftm.petvida.repository.AnimalRepository;
import br.edu.iftm.petvida.repository.TutorRepository;

@Controller
public class PetVidaController {

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private TutorRepository tutorRepository;


    @GetMapping("/ficha_11")
    public String ficha(Model model) {
        
        Animal meuAnimal = animalRepository.buscarPorId(47);
        
        model.addAttribute("animal", meuAnimal);
        return "ficha"; 
    }

  
    @GetMapping("/tutor_11")
    public String tutor(Model model) {
      
        Tutor meuTutor = tutorRepository.buscarPorId(117);
        

        int quantidadeDeAnimais = animalRepository.contarAnimaisDoTutor(117);
        
        model.addAttribute("tutor", meuTutor);
        model.addAttribute("quantidadeAnimais", quantidadeDeAnimais);
        return "tutor";
    }

  
    @GetMapping("/resumo_11")
    public String resumo(Model model) {
      
        int totalAnimais = animalRepository.contarAnimais();
        double mediaIdade = animalRepository.mediaIdade();
        String animalMaisVelho = animalRepository.animalMaisVelho();
        
       
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = agora.format(formatador);
        
        model.addAttribute("totalAnimais", totalAnimais);
        model.addAttribute("mediaIdade", mediaIdade);
        model.addAttribute("animalMaisVelho", animalMaisVelho);
        model.addAttribute("dataHora", dataHoraFormatada);
        
        return "resumo"; 
    }
}