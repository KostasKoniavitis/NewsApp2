package com.example.newsapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {


    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news articles.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news items
        News currentNews = getItem(position);


        // Find the TextView with view section name
        TextView sectionNameView = (TextView) listItemView.findViewById(R.id.section_name);
        // Display the location of the current news in that TextView
        sectionNameView.setText(currentNews.getSectionName());

        // Find the TextView with view title of the news article
        TextView webTitleView = (TextView) listItemView.findViewById(R.id.web_title);
        // Display the title of the current news in that TextView
        webTitleView.setText(currentNews.getWebTitle());

        // Find the TextView with view name of the author
        TextView authorNameView = (TextView) listItemView.findViewById(R.id.author_name);
        // Display the author of the current news in that TextView
        if (currentNews.getAuthorName() != null) {
            authorNameView.setText(currentNews.getAuthorName());
        }else {
            authorNameView.setVisibility(View.GONE);
        }

        // Find the TextView with view ID publication date
        TextView dateView = (TextView) listItemView.findViewById(R.id.web_publication_date);

        if (currentNews.getWebPublicationDate() != null ){
            // Display the date of the current news in that TextView
            dateView.setText(currentNews.getWebPublicationDate());
        }else {
            dateView.setVisibility(View.GONE);
        }

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}
