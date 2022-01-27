package android.example.childfragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit

class FirstFragment : Fragment(R.layout.first_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnClickMe = view.findViewById<Button>(R.id.btnClickMe)

        btnClickMe.setOnClickListener {
            childFragmentManager.commit {
                setReorderingAllowed(true)
                add<ChildFragment>(R.id.fragmentContainer)
                addToBackStack(null)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        //childFragmentManager.fragmentFactory = MyFragmentFactory("repo")
        super.onCreate(savedInstanceState)


    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        childFragmentManager.fragmentFactory = MyFragmentFactory("repo")

    }
}