package org.wrabz.todo_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wrabz.todo_app.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
