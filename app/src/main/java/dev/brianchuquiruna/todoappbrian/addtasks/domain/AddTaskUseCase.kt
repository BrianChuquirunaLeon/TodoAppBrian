package dev.brianchuquiruna.todoappbrian.addtasks.domain

import dev.brianchuquiruna.todoappbrian.addtasks.data.TaskRepository
import dev.brianchuquiruna.todoappbrian.addtasks.ui.model.TaskModel
import javax.inject.Inject

class AddTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke (taskModel: TaskModel){
        taskRepository.add(taskModel)
    }
}