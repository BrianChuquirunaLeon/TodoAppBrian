package dev.brianchuquiruna.todoappbrian.addtasks.ui.model

data class TaskModel (val id:Long = System.currentTimeMillis(), val task:String, var selected:Boolean = false)