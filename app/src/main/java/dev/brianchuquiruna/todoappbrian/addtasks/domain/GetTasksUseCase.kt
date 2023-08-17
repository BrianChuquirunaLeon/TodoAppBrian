package dev.brianchuquiruna.todoappbrian.addtasks.domain

import dev.brianchuquiruna.todoappbrian.addtasks.data.TaskRepository
import dev.brianchuquiruna.todoappbrian.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(
    private val taskRepository: TaskRepository
){
    operator fun invoke():Flow<List<TaskModel>>{
        return taskRepository.tasks
    }
}