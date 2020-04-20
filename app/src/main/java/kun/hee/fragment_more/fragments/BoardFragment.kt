package kun.hee.fragment_more.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_board.*
import kun.hee.fragment_more.R
import kun.hee.fragment_more.datas.Post
import kun.hee.listviewpractice.adapter.PostAdapter

class BoardFragment:BaseFragment() {

    var mPostAdapter:PostAdapter? = null
    val mPostList = ArrayList<Post>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_board, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mPostList.add(Post("삼성전자",65,"조경진"))
        mPostList.add(Post("페이스북",7,"박혜진"))
        mPostList.add(Post("스타벅스",13,"류건희"))
        mPostList.add(Post("CJ헬로비전",42,"조경진"))
        mPostList.add(Post("아모레퍼시픽",78,"박보검"))
        mPostList.add(Post("테슬라",23,"류건희"))
        mPostList.add(Post("JYP엔터테인먼트",1312,"박진영"))
        mPostList.add(Post("YG엔터테인먼트",888,"양군"))
        mPostList.add(Post("SM엔터테인먼트",231,"이수만"))

        mPostAdapter = PostAdapter(mContext!!, R.layout.post_item_list, mPostList)
        boardListView.adapter = mPostAdapter

    }

}