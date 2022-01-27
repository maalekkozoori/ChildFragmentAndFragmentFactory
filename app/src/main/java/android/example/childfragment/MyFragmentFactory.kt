package android.example.childfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

class MyFragmentFactory(val repository: String) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment =
        when (loadFragmentClass(classLoader, className)) {
            ChildFragment::class.java -> ChildFragment(repository)
            else -> super.instantiate(classLoader, className)
        }
}