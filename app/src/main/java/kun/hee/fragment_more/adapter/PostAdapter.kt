package kun.hee.listviewpractice.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kun.hee.fragment_more.R
import kun.hee.fragment_more.datas.Post
import kun.hee.listviewpractice.datas.AppInformation

class PostAdapter(context:Context, resId:Int, list:ArrayList<Post> ):ArrayAdapter<Post>(context, resId, list) {
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow =convertView
//        tempRow?.Let{ NULL이 아닐떄,}.Let{NULL 일때}
        if(tempRow == null) {
            tempRow = inf.inflate(R.layout.post_item_list, null)
        }
//        tempRow?.Let{
//        }.Let{ tempRow = inf.inflate(R.layout.play_store_list, null)}
//

        val row = tempRow!!
//      ★ 요기 위에 하나도 모르겠음 ★



        return row

    }








}