package hr.ferit.brunozoric.taskie.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.Dao
import androidx.room.RoomDatabase
import hr.ferit.brunozoric.taskie.model.Task

@Database(entities = [Task::class], version = 1)
abstract class DaoProvider : RoomDatabase(){

    abstract fun taskieDao() : TaskieDao

    companion object {
        private var instance : DaoProvider? = null

        fun getInstance(context : Context) : DaoProvider {

            if (instance == null) {
                instance = Room.databaseBuilder(
                    context. applicationContext,
                    DaoProvider:: class.java,
                    "TaskieDB"
                ).allowMainThreadQueries().build()
            }
            return instance as DaoProvider

        }
    }

}