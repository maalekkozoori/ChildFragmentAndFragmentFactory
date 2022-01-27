package android.example.childfragment

import android.util.Log
import androidx.fragment.app.Fragment

class ChildFragment(val repository : String): Fragment(R.layout.fragment_child) {

    init {
        Log.d("CildFragmenr",repository)
    }

}