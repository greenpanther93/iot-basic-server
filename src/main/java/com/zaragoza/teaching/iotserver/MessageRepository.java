package com.zaragoza.teaching.iotserver;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long>{
	List<Message> findById(long student_id);
}
