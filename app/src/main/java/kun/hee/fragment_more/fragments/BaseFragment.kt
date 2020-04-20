package kun.hee.fragment_more.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {


    var mContext:Context? = null //얜 바로 this를 넣어주면 안 돼.

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mContext = activity
    }

    abstract fun setupEvents()
    abstract fun setValues()

}