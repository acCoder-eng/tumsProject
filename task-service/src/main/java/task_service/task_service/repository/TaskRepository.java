package task_service.task_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import task_service.task_service.entity.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{
    List<Task> findByUserId(Long userId);
    List<Task> findByCompleted(boolean completed);
    List<Task> findByTitleContainingIgnoreCase(String title);
}
