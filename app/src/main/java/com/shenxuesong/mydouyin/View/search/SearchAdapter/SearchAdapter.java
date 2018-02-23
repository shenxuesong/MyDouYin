package com.shenxuesong.mydouyin.View.search.SearchAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shenxuesong.mydouyin.SearchBean.ChallengeBean;
import com.shenxuesong.mydouyin.R;

import java.util.List;

/**
 * Created by Dell on 2018/2/22.
 */

public class SearchAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<ChallengeBean> list;
    public SearchAdapter(Context context,List<ChallengeBean> list) {
        this.context=context;
        this.list=list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.searchadapter, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder vh = (MyViewHolder) holder;
        ChallengeBean challengeBean = list.get(position);
        if(challengeBean!=null){
            String cha_name = challengeBean.getCha_name();
            vh.textView.setText(cha_name);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{

        private final TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.searchadaptertv);
        }
    }
}
