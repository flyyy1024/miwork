package com.example.flyyy.miwork;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param word    A List of AndroidFlavor objects to display in a list
     */
    private int mColorId;

    public WordAdapter(Activity context, ArrayList<Word> word, int colorId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, word);
        mColorId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwork_text_view
        TextView miworkTextView = listItemView.findViewById(R.id.miwork_text_view);
        // Get the miwork word from the current Word object and
        // set this text on the name TextView
        miworkTextView.setText(currentWord.getMiworkWord());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        // Get the default word from the current Word object and
        // set this text on the default TextView
        defaultTextView.setText(currentWord.getDefaultWord());

        ImageView imageView = listItemView.findViewById(R.id.image_view);

        //检查是否有图片资源，有显示，没有不显示
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundResource(mColorId);
        //以上代码可简写为：listItemView.findViewById(R.id.linear_layout_text_view).setBackgroundColor(ContextCompat.getColor(getContext(), mColorId));
        //或：int color = ContextCompat.getColor(getContext(), mColorId);
        //    textContainer.setBackgroundResource(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
