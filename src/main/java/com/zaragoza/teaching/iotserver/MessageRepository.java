package com.zaragoza.teaching.iotserver;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MessageRepository extends JpaRepository<Message, Long>{
	List<Message> findById(long student_id);
	
	@Query(value = "select * from message",
		   nativeQuery = true)
	List<Message> findAllMessages();
	
	@Query(value = "select top (20) * from message	Order by id DESC",
			   nativeQuery = true)
		List<Message> findLast20();
	
}
