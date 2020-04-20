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
//        viewpage가 많아지면 좌우 페이지만 리스트로 만들어서 바로 불러오기때문에
//        멀리있는 페이지 불러올때 시간이 걸릴수도 있다.
        return when (position) {
            0 -> MainFragment()
            1 -> GameListFragment()
            2 -> BoardFragment()
            3 -> GameListFragment()
            else ->  BoardFragment()
        }
    }

        override fun getPageTitle(position: Int): CharSequence? {
//            getCount와 getItem 없으면 오류뜰거야 아마도

            return when (position) {
                0 -> "메인"
                1 -> "게임 리스트"
                2 -> "거래 게시판"
                3 -> "게임 목록"
                else -> "주식시장"
            }
        }

    override fun getCount(): Int {
//        몇 페이지 지원할 거니 ? 우린 2개를 만들었단다.
        return 5
        }
}