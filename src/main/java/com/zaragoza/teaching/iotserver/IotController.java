package com.zaragoza.teaching.iotserver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IotController {

	@Autowired
	  private Environment environment;
	  
	  @Autowired
	  private MessageRepository repository;
	  
	  @GetMapping("/message-exchange/from/{student_id}/")
	  public List<Message> retrieveExchangeValue(@PathVariable long student_id){
	    
	    List<Message> messages = repository.findById(student_id);
	    
	    return messages;
	  }
	  
	  @GetMapping("/message-exchange/messages/")
	  public List<Message> retrieveMessages(){
		    
		    List<Message> messages = repository.findLastTen();
		    
		    return messages;
	  }
	  @PostMapping("/message-exchange/messages/")
	  public void retrieveMessages(@RequestBody Message message) {
		  repository.save(message);
	  }
	  
	  @GetMapping("/HelloWorld")
	  public String helloWorld(){
	    
	    return "HelloWorld !";
	  }
		 
	  
	  @GetMapping("/error")
	  public String error(){
	    
	    return "This is the error page, for when nothing is working.";
	  }
}
