package co.com.demo.arquitectura.modular.questions.services;

import co.com.demo.arquitectura.modular.model.models.Question;
import co.com.demo.arquitectura.modular.model.repository.QuestionRepository;
import co.com.demo.arquitectura.modular.questions.DTO.QuestionDTO;
import co.com.demo.arquitectura.modular.questions.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServices {

    @Autowired
    private QuestionRepository questionRepository;
    private QuestionMapper questionMapper = new QuestionMapper();

    public List<QuestionDTO> listarPregunta(){
        var dto = questionMapper.listaDTOQUestion(questionRepository.findAll());
        return dto;
    }

}
