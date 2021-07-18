package co.com.demo.arquitectura.modular.application;

import co.com.demo.arquitectura.modular.questions.DTO.QuestionDTO;
import co.com.demo.arquitectura.modular.questions.services.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/question")
public class Application {

    @Autowired
    private QuestionServices questionServices;

    @GetMapping("/list")
    public ResponseEntity<List<QuestionDTO>> lsitQuestion(){
        return new ResponseEntity<>(questionServices.listarPregunta(), HttpStatus.OK);
    }
}
