package com.shenxuesong.mydouyin.View;


import android.content.Intent;
import android.os.Build;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.shenxuesong.mydouyin.BannerBean.BannerBean;
import com.shenxuesong.mydouyin.HotBean.HotBean;
import com.shenxuesong.mydouyin.Iview.IBanner;
import com.shenxuesong.mydouyin.Iview.IHot;
import com.shenxuesong.mydouyin.SearchBean.ChallengeBean;
import com.shenxuesong.mydouyin.SearchBean.DataBean;
import com.shenxuesong.mydouyin.SearchBean.SearchBean;
import com.shenxuesong.mydouyin.Iview.Isearch;
import com.shenxuesong.mydouyin.R;
import com.shenxuesong.mydouyin.View.GlideImageLoader;

import com.shenxuesong.mydouyin.View.Video.VideoActivity;
import com.shenxuesong.mydouyin.View.search.SearchAdapter.Historical_recordsAdapter;
import com.shenxuesong.mydouyin.View.search.SearchAdapter.SearchAdapter;
import com.shenxuesong.mydouyin.View.search.SearchAdapter.SearchThreeAdapter;
import com.shenxuesong.mydouyin.presenter.BannerPresenter;
import com.shenxuesong.mydouyin.presenter.HotPresenter;
import com.shenxuesong.mydouyin.presenter.SearchPresenter;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity implements Isearch ,IBanner,IHot{
    private SearchPresenter searchPersenter;
    private RecyclerView rlv,secondRlv,threeRlv;
    private List<ChallengeBean> list=new ArrayList<ChallengeBean>();
    private Banner banner;
    private BannerPresenter bannerPersenter;
    private List<String> list_path=new ArrayList<>();//Banner 图集合
    private HotPresenter hotPersenter;
    private int count=5;
    private ScrollView myScrollView;
    private SearchThreeAdapter searchThreeAdapter;
    private boolean loading=false;
    private SwipeRefreshLayout swipeRefreshLayout;
    private ImageView search_botton;
    private EditText editText;
    private List<String> Historical_records=new ArrayList<>();
    private Historical_recordsAdapter historical_recordsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        searchPersenter = new SearchPresenter(this);
        searchPersenter.getSearch();
        bannerPersenter = new BannerPresenter(this);
        bannerPersenter.getBannerBean();
        hotPersenter = new HotPresenter(this);
        hotPersenter. getHotPersenter(count);

        //沉浸式
        cJS();
        rlv = findViewById(R.id.firstRlv);
        secondRlv=findViewById(R.id.secondRlv);
        threeRlv=findViewById(R.id.threeRlv);
        banner = findViewById(R.id.banner);
        myScrollView = findViewById(R.id.mysv);
        swipeRefreshLayout = findViewById(R.id.shaxin);
        search_botton = findViewById(R.id.search_bg);
        editText = findViewById(R.id.search_contion);

        //记录历史记录
        recordContent();

    }

    /**
     * 记录历史内容
     */
    private void recordContent() {
        //搜索的点击事件
        search_botton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取输入的内容
                String content = editText.getText().toString().trim();
                Historical_records.add(content);


            }
        });
        //展示历史记录
        secondRlv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        historical_recordsAdapter = new Historical_recordsAdapter(getApplicationContext(), Historical_records);
        secondRlv.setAdapter(historical_recordsAdapter);

    }

    @Override
    public void showBean(SearchBean searchBean) {
        List<DataBean> data = searchBean.getData();
        for (int i = 0; i < data.size(); i++) {
            ChallengeBean challenge = data.get(i).getChallenge();
            list.add(challenge);
        }
        rlv.setLayoutManager(new GridLayoutManager(this,2));
        SearchAdapter searchAdapter = new SearchAdapter(this, list);
        rlv.setAdapter(searchAdapter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        searchPersenter.jB();
        searchPersenter=null;
        bannerPersenter.jieBang();
        bannerPersenter=null;
        hotPersenter.jieBangHotPersenter();
        hotPersenter=null;
    }

    public void cJS(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
    }

    @Override
    public void showBanner(BannerBean bannerBean) {
        List<BannerBean.BannerBean1> banner1 = bannerBean.getBanner();
        for (int i = 0; i < banner1.size(); i++) {
            BannerBean.BannerBean1 bannerBean1 = banner1.get(i);
            BannerBean.BannerBean1.BannerUrlBean banner_url = bannerBean1.getBanner_url();
            List<String> url_list = banner_url.getUrl_list();

            String s = url_list.get(0);
            //   Log.i("URL",s);
            list_path.add(s);
        }
        banner.setImages(list_path).setImageLoader(new GlideImageLoader()).isAutoPlay(true).start();
    }

    @Override
    public void showHotBean(HotBean hotBean) {
        List<HotBean.CategoryListBean> category_list = hotBean.getCategory_list();

        threeRlv.setLayoutManager(new LinearLayoutManager(this));
        searchThreeAdapter = new SearchThreeAdapter(this,category_list);

        threeRlv.setAdapter(searchThreeAdapter);
        //点击图片
        searchThreeAdapter.setOnItemListenerClick(new SearchThreeAdapter.onItemListenerClick() {
            @Override
            public void onItemClick(String s) {
                Intent intent = new Intent(SearchActivity.this, VideoActivity.class);
                intent.putExtra("url",s);
                startActivity(intent);

            }
        });
        threeRlv.setOnScrollListener(new RecyclerView.OnScrollListener() {
            int lastVisibleItem;
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                //判断RecyclerView的状态 是空闲时，同时，是最后一个可见的ITEM时才加载

                if (newState == RecyclerView.SCROLL_STATE_IDLE && lastVisibleItem + 1 == searchThreeAdapter.getItemCount()) {

                    loadMoreDate();
                    historical_recordsAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                //最后一个可见的ITEM
                lastVisibleItem=layoutManager.findLastVisibleItemPosition();

            }
        });
        //下拉刷新
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadMoreDate();
                swipeRefreshLayout.setRefreshing(false);
            }

        });
        //上拉加载更多
        myScrollView. setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_MOVE: {
                        break;
                    }
                    case MotionEvent.ACTION_DOWN: {
                        loadMoreDate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {
                        //当文本的measureheight 等于scroll滚动的长度+scroll的height

                        if (myScrollView.getChildAt(0).getMeasuredHeight() <= myScrollView.getScrollY() + myScrollView.getHeight()) {

                            loadMoreDate();
                        }


                        break;
                    }
                }
                return false;
            }
        });

    }

    private void loadMoreDate() {
        ++count;
        hotPersenter.getHotPersenter(count);
        searchThreeAdapter.notifyDataSetChanged();
    }

}
