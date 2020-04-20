package kun.hee.fragment_more.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kun.hee.fragment_more.fragments.BoardFragment
import kun.hee.fragment_more.fragments.GameListFragment
import kun.hee.fragment_more.fragments.MainFragment

class MyFragPagerAdapter(fm:FragmentManager) :FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
//       getView 각각의 줄에 없던걸 뿌려줄꺼야. ListView의 getView와비슷
        return when (position) {
            0 -> { MainFragment()}
            1 -> { GameListFragment()}
            else -> { BoardFragment() }
        }
    }

        override fun getPageTitle(position: Int): CharSequence? {

            return when (position) {
                0 -> "메인"
                1 -> "게임리스트"
                else -> "주식시장"
            }
        }

    override fun getCount(): Int {
//        몇 페이지 지원할 거니 ? 우린 2개를 만들었단다.
        return 3
        }
}