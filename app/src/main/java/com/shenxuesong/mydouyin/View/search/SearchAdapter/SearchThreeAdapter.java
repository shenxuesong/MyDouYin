package com.shenxuesong.mydouyin.View.search.SearchAdapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.shenxuesong.mydouyin.HotBean.HotBean;
import com.shenxuesong.mydouyin.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 2018/2/22.
 */

public class SearchThreeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private    List<HotBean.CategoryListBean>  list;
    private List<String >  photourl=new ArrayList<>();//热门图片的路径
    private String desc;
    private int play_count;
    private String s;

    public SearchThreeAdapter(Context context,    List<HotBean.CategoryListBean> list) {
        this.context=context;
        this.list=list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.searchthreeadapter, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final MyViewHolder vh = (MyViewHolder) holder;

        HotBean.CategoryListBean categoryListBean = list.get(position);
        List<HotBean.CategoryListBean.AwemeListBean> aweme_list = categoryListBean.getAweme_list();
        for (int i = 0; i <aweme_list.size() ; i++) {
            HotBean.CategoryListBean.AwemeListBean.VideoBean.OriginCoverBean origin_cover = aweme_list.get(i).getVideo().getOrigin_cover();
            List<String> url_list = origin_cover.getUrl_list();
            desc = aweme_list.get(i).getDesc();
            play_count = aweme_list.get(i).getStatistics().getPlay_count();


        }
        HotBean.CategoryListBean.ChallengeInfoBean challenge_info = categoryListBean.getChallenge_info();
        if (challenge_info!=null){
            String cha_name = challenge_info.getCha_name();
            if (cha_name!=null){
                vh.titleTv.setText(cha_name+"\n"+desc);

            }
        }

        //创建LinearLayoutManager 对象
        LinearLayoutManager layoutmanager = new LinearLayoutManager(context);
        layoutmanager.setOrientation(LinearLayoutManager.HORIZONTAL);
        //设置RecyclerView 布局
        vh.HotRLV.setLayoutManager(layoutmanager);
        HotChallengeAdapter hotChallengeAdapter = new HotChallengeAdapter(context, aweme_list);
        vh.HotRLV.setAdapter(hotChallengeAdapter);
        vh.sum.setText(play_count+">");

        hotChallengeAdapter.setOnItemListenerClick(new HotChallengeAdapter.onItemListenerClick() {
            @Override
            public void onItemClick(final String s) {
                vh.ll.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        onItemListenerClick.onItemClick(s);

                    }
                });
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{

        private  RecyclerView HotRLV;
        private  TextView titleTv,sum;
         private LinearLayout ll;
        public MyViewHolder(View itemView) {
            super(itemView);
            sum=itemView.findViewById(R.id.sum);
            titleTv = itemView.findViewById(R.id.threetitle);
            HotRLV=itemView.findViewById(R.id.hotRLV);
            ll=(LinearLayout)itemView.findViewById(R.id.lla);
        }
    }

    public interface onItemListenerClick{
        void onItemClick(String s);
    }
    private onItemListenerClick onItemListenerClick;
    public void setOnItemListenerClick(onItemListenerClick onItemListenerClick){
        this.onItemListenerClick=onItemListenerClick;
    }
}
