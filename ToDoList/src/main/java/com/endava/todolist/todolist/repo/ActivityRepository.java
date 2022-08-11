package com.endava.todolist.todolist.repo;

import com.endava.todolist.todolist.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
}

