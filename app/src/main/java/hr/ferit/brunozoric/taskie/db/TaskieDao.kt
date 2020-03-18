package hr.ferit.brunozoric.taskie.db

import androidx.room.*
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.OnConflictStrategy.REPLACE
import hr.ferit.brunozoric.taskie.model.Task

@Dao
interface TaskieDao {

    @Query ("SELECT * FROM Task")
    fun loadAll() : MutableList<Task>

    @Delete
    fun deleteTask(task: Task)

    @Query ("DELETE FROM Task")
    fun deleteAllTasks()

    @Insert(onConflict = IGNORE)
    fun insertTask(task: Task) : Long

    @Update(onConflict = REPLACE)
    fun updateTask(task :Task)

    @Query("SELECT  * FROM Task WHERE TaskDbId = :TaskId" )
    fun getTask(TaskId : Long) : Task








}