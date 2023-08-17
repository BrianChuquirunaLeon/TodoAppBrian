package dev.brianchuquiruna.todoappbrian.addtasks.data.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.brianchuquiruna.todoappbrian.addtasks.data.TaskDao
import dev.brianchuquiruna.todoappbrian.addtasks.data.TodoDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {
    @Singleton
    @Provides
    fun provideTodoDatabase(@ApplicationContext appContext: Context): TodoDatabase {
        return Room.databaseBuilder(appContext, TodoDatabase::class.java, "TaskDatabase").build()
    }
    @Singleton
    @Provides
    fun provideTaskDao(todoDatabase: TodoDatabase):TaskDao{
        return todoDatabase.taskDao()
    }
}