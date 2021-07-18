package co.com.demo.arquitectura.modular.questions.mapper;

import co.com.demo.arquitectura.modular.model.models.Question;
import co.com.demo.arquitectura.modular.questions.DTO.QuestionDTO;

import java.util.List;
import java.util.stream.Collectors;

public class QuestionMapper {

    public QuestionDTO questionToDTO(Question question){
        return new QuestionDTO(question.getId(), question.getUserId(),question.getQuestion() ,question.getType(), question.getCategory());
    }

    public Question dtoToQuestion(QuestionDTO questionDTO){
        var question = new Question();
        question.setId(questionDTO.getId());
        question.setUserId(questionDTO.getUserId());
        question.setQuestion(questionDTO.getQuestion());
        question.setType(questionDTO.getType());
        question.setCategory(questionDTO.getCategory());
        return question;
    }

    public List<QuestionDTO> listaDTOQUestion(List<Question> list){
        var listDTO = list.stream().map(it-> questionToDTO(it)).collect(Collectors.toUnmodifiableList());
        return listDTO;
    }
}
