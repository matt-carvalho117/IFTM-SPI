package ramdom.numbers.generator.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SorteioController {

    @GetMapping("/")
    public String sortearNumeros(Model model) {
        Random random = new Random();
        List<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            numeros.add(random.nextInt(60));
        }
        
        model.addAttribute("numerosSorteados", numeros);
        return "index";
    }

    
}
