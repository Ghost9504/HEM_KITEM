package mad.project.hemkitem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class AppHomeActivity extends AppCompatActivity {
MeowBottomNavigation bottomNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_home);

        bottomNav.findViewById(R.id.bottonNac);

        bottomNav.add(new MeowBottomNavigation.Model(1,R.drawable.ic_home));
        bottomNav.add(new MeowBottomNavigation.Model(2,R.drawable.ic_search));
        bottomNav.add(new MeowBottomNavigation.Model(3,R.drawable.ici_list));
        bottomNav.add(new MeowBottomNavigation.Model(4,R.drawable.ic_home));

        bottomNav.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment;

                if(item.getId()==1){
                    fragment=new HomeFragment();

                }else if(item.getId()==2){
                    fragment=new SearchFragment();

                }else if(item.getId()==3){
                    fragment=new ListFragment();

                }else{
                    fragment=new UserFragment();
                }

                loadable(fragment);
            }




        });

        bottomNav.show(1,true);
        bottomNav.setCount(3,"10");


    }
    private void loadable(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView,fragment)
                .commit();
    }

}