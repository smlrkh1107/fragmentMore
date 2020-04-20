package kun.hee.fragment_more.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kun.hee.fragment_more.R
import kun.hee.listviewpractice.adapter.AppInfo_Adpater
import kun.hee.listviewpractice.datas.AppInformation

class GameListFragment : Fragment(){

    var mGameAdapter:AppInfo_Adpater = null
    val mGameList = ArrayList<AppInformation>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_game_list,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        mGameList.add(AppInformation("아스팔트8:에어본", "GameLoft", 5))
        mGameList.add(AppInformation("MineCraft ", "Mojang ", 4))
        mGameList.add(AppInformation("아스팔트7:히트", "GameLoft", 4))
        mGameList.add(AppInformation("팔라독 (Paladog)", "FazeCat ", 2))
        mGameList.add(AppInformation("Plants vs. Zombies", "EA Games", 3))
        mGameList.add(AppInformation("스왐피 (Swampy)", "Disney ", 5))
        mGameList.add(AppInformation("리니지 2M", "NCSOFT", 3))
        mGameList.add(AppInformation("리니지M ", "NCSOFT ", 4))
        mGameList.add(AppInformation("AFK아레나", "Lilith Games", 1))

//        this쓰면  오류나서 !!로 강제해야하나벼
        mGameAdapter = AppInfo_Adpater(context!!, R.layout.play_store_list, mGameList)

    }


}