package hr.ferit.brunozoric.taskie.persistence

import hr.ferit.brunozoric.taskie.model.Task

interface RepoInterface {


    fun getAllTasks() :List<Task>

    fun removeAllTasks()

    fun removeTask(task :Task)

    fun addTask(task :Task)

    fun changeTask(task :Task)

    fun getTaskBy(id : Long) :Task



}