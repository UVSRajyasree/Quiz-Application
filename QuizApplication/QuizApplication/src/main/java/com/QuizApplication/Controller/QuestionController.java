package com.QuizApplication.Controller;

import com.QuizApplication.Entity.Question;
import com.QuizApplication.Service.QuestionSevice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    QuestionSevice questionSevice;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionSevice.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){
        return questionSevice.getQuestionByCategory(category);
    }

    @PostMapping("addQuestion")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionSevice.addQuestion(question);
    }

    @PutMapping("updateQuestion")
    public String updateQuestion(@RequestBody Question question){
        return questionSevice.updateQuestion(question);
    }

    @DeleteMapping("deleteQuestion/{id}")
    public String deleteQuestion(@PathVariable Integer id){
        return questionSevice.deleteQuestion(id);
    }
}
