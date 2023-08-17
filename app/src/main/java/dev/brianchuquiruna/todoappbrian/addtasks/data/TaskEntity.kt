package dev.brianchuquiruna.todoappbrian.addtasks.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_entity")
data class TaskEntity(
    @PrimaryKey
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "task") val task: String,
    @ColumnInfo(name = "selected") var selected: Boolean = false
)