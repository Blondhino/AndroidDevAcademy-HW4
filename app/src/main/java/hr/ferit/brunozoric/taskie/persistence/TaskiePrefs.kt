package hr.ferit.brunozoric.taskie.persistence

import android.content.Context
import android.preference.PreferenceManager
import hr.ferit.brunozoric.taskie.Taskie
import java.security.AccessController.getContext

object TaskiePrefs {

    const val KEY="SAVING_KEY"

    private fun sharedPrefs()= PreferenceManager.getDefaultSharedPreferences(Taskie.getAppContext())

    fun store(key : String, value :Int){
        val editor = sharedPrefs().edit()
        editor.putInt(key,value).apply()
    }

    fun getInt(key:String, defaultValue:Int) : Int? =
            sharedPrefs().getInt(key,defaultValue)

}


