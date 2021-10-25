package com.rcustodio.philippinesconstitution1987;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomArticlesAdapter extends ArrayAdapter<ArticleDataModel> implements View.OnClickListener {

    private ArrayList<ArticleDataModel> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView txtTitle;
        TextView txtDescrition;

    }

    public CustomArticlesAdapter(ArrayList<ArticleDataModel> data, Context context) {
        super(context, R.layout.custom_articles_listview_row, data);
        this.dataSet = data;
        this.mContext=context;

    }


    @Override
    public void onClick(View view) {

    }

    private int lastPosition = -1;


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        ArticleDataModel dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.custom_articles_listview_row, parent, false);
            viewHolder.txtTitle = (TextView) convertView.findViewById(R.id.articleTitleId);
            viewHolder.txtDescrition = (TextView) convertView.findViewById(R.id.articleDescriptionID);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;

        viewHolder.txtTitle.setText(dataModel.getTitle());
        viewHolder.txtDescrition.setText(dataModel.getDescription());
        // Return the completed view to render on screen
        return convertView;
    }


}
