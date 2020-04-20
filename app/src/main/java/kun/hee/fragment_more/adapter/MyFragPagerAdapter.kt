package kun.hee.fragment_more.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kun.hee.fragment_more.fragments.GameListFragment
import kun.hee.fragment_more.fragments.MainFragment

class MyFragPagerAdapter(fm:FragmentManager) :FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
//       getView 각각의 줄에 없던걸 뿌려줄꺼야. ListView의 getView와비슷
        if (position==0){
            return MainFragment() //1
        }
        else {
            return GameListFragment() //2
        }
    }

    override fun getCount(): Int {
//        몇 페이지 지원할 거니 ? 우린 2개를 만들었단다.
        return 2
        }
}