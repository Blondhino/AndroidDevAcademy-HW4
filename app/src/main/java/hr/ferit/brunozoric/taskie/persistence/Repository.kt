package hr.ferit.brunozoric.taskie.persistence

import hr.ferit.brunozoric.taskie.Taskie
import hr.ferit.brunozoric.taskie.db.DaoProvider
import hr.ferit.brunozoric.taskie.model.Priority
import hr.ferit.brunozoric.taskie.model.Task

class Repository : RepoInterface{


    private  var db : DaoProvider = DaoProvider.getInstance(Taskie.getAppContext())
   private var taskieDao = db.taskieDao()

    override fun getAllTasks(): MutableList<Task> {
       return taskieDao.loadAll()
    }

    override fun removeAllTasks() {
        taskieDao.deleteAllTasks()
    }

    override fun removeTask(task: Task) {
        taskieDao.deleteTask(task)
    }

    override fun addTask(task: Task) {
        taskieDao.insertTask(task)
    }

    override fun changeTask(task: Task) {
        taskieDao.updateTask(task)
    }

    override fun getTaskBy(id: Long) : Task {
        return taskieDao.getTask(id)
    }


}