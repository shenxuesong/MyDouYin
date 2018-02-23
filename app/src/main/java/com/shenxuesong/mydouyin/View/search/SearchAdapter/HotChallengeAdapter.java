package com.shenxuesong.mydouyin.View.search.SearchAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.facebook.drawee.view.SimpleDraweeView;
import com.shenxuesong.mydouyin.HotBean.HotBean;
import com.shenxuesong.mydouyin.R;


import java.util.List;

/**
 * Created by Dell on 2018/2/22.
 */

public class HotChallengeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<HotBean.CategoryListBean.AwemeListBean> list;
    public HotChallengeAdapter(Context context, List<HotBean.CategoryListBean.AwemeListBean> list) {
        this.context=context;
        this.list=list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.hotchallenge, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder vh = (MyViewHolder) holder;
        HotBean.CategoryListBean.AwemeListBean awemeListBean = list.get(position);
        final String s1 = awemeListBean.getVideo().getPlay_addr().getUrl_list().get(0);
        List<String> url_list = awemeListBean.getVideo().getOrigin_cover().getUrl_list();
        for (int i = 0; i < url_list.size(); i++) {
            String s = url_list.get(i);
            vh.sdv.setImageURI(s);
        }

        vh.ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemListenerClick.onItemClick(s1);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{

        private final SimpleDraweeView sdv;
        private LinearLayout ll;
        public MyViewHolder(View itemView) {
            super(itemView);
         sdv = itemView.findViewById(R.id.hotsdv);
         ll=itemView.findViewById(R.id.ll);
        }
    }
    public interface onItemListenerClick{
        void onItemClick(String s);
    }
    private onItemListenerClick onItemListenerClick;
    public void setOnItemListenerClick(onItemListenerClick onItemListenerClick){
        this.onItemListenerClick=  onItemListenerClick;
    }
}
