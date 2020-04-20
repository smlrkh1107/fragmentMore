package kun.hee.fragment_more.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*
import kun.hee.fragment_more.R

class MainFragment :Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        Main액티비티의 onCreate에 대응되는 함수임.
        okBtn.setOnClickListener {
            val inputMsg = messageEdt.text.toString()
            contentTxt.text = inputMsg
        }

    }

}