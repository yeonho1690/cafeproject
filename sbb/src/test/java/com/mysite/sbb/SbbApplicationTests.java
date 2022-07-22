package com.mysite.sbb;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {
	
//    @Autowired
//	private QuestionRepository questionRepository;
//    
    @Autowired
   	private QuestionService questionService;
    
//    @Autowired
//    private AnswerRepository answerRepository;
//    
  //  @Transactional
    @Test
    void testJpa() {
		/*
		 * Question question = new Question(); question.setSubject("sbb�� �����ΰ���?");
		 * question.setContent("sbb�� ���ؼ� �˰� �ͽ��ϴ�.");
		 * question.setCreateDate(LocalDateTime.now());
		 * this.reqQuestionRepository.save(question);
		 * 
		 * Question question2 = new Question(); question2.setSubject("sbb�� �����ΰ���?");
		 * question2.setContent("sbb�� ���ؼ� �˰� �ͽ��ϴ�.");
		 * question2.setCreateDate(LocalDateTime.now());
		 * this.reqQuestionRepository.save(question2);
		 */
//    	  List<Question> all= this.questionRepository.findAll();
//    	  assertEquals(2, all.size());
//    	  
//    	  Question q = all.get(0);
//    	  assertEquals("sbb�� �����ΰ���?", q.getSubject());
//    	  
//    	 Optional<Question> oq= this.questionRepository.findById(3);
//    	 if(oq.isPresent()) {
//    		 Question q = oq.get();
//    		 assertEquals("sbb�� �����ΰ���?", q.getSubject());
//    	 }
    	
//    	Question q = 
//    	    this.questionRepository.findBySubject("sbb�� �����ΰ���?");
//        assertEquals(1, q.getId()); 
    	
//    	Question q = this.questionRepository.findBySubjectAndContent("sbb�� �����ΰ���?", "sbb�� ���ؼ� �˰� �ͽ��ϴ�.");
//    	assertEquals(1, q.getId());
    	
//    	List<Question> qList = this.questionRepository.findBysubjectLike("sbb%");
//    	Question q = qList.get(0);
//    	assertEquals("sbb�� �����ΰ���?", q.getSubject());
//  
//    	Optional<Question> oq = this.questionRepository.findById(1);
//    	assertTrue(oq.isPresent());
//    	Question q = oq.get();
//    	q.setSubject("������ ����");
//    	this.questionRepository.save(q);
    	
//    	assertEquals(2, this.questionRepository.count());
//    	Optional<Question> oq = this.questionRepository.findById(1);
//    	assertTrue(oq.isPresent());
//    	Question q = oq.get();
//    	this.questionRepository.delete(q);
//    	assertEquals(1, this.questionRepository.count());
    	
//    	Optional<Question> oq = this.questionRepository.findById(2);
//    	assertTrue(oq.isPresent());
//    	Question q = oq.get();
//    	
//    	Answer a = new Answer();
//    	a.setContent("�� �ڵ����� �����մϴ�.");
//    	a.setQuestion(q);
//    	a.setCreateDate(LocalDateTime.now());
//    	this.answerRepository.save(a);
//   
    	
//    	Optional<Answer> oa = this.answerRepository.findById(1);
//    	assertTrue(oa.isPresent());
//    	Answer a = oa.get();
//    	assertEquals(2, a.getQuestion().getId());
    	
    	for(int i=1; i<= 300; i++) {
    		String subject = String.format("테스트 데이터입니다:[%03d]", i);
    		String content = "내용무";
    		this.questionService.create(subject, content,null); 
    	}
    }
	@Test
	void contextLoads() {
	}

}
