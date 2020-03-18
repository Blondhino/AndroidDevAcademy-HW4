package hr.ferit.brunozoric.taskie.model

import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity
data class Task(
    @PrimaryKey (autoGenerate = true)
    var TaskDbId: Long? = null,
    val title: String,
    val description: String,
    val priority: Int
)