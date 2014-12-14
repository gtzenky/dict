package com.example.android.searchabledict;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class WordsListViewAdapter extends ArrayAdapter<Word> {

  Context context;
  
  public  WordsListViewAdapter(Context context, int resourceId, List<Word> items) {
    super(context, resourceId, items);
    this.context = context;
  }
  
  private class ViewHolder {
    TextView wordArea;
    TextView definitionArea;
  }
  
  public View getView(int position, View convertView, ViewGroup parent) {
    Word word = getItem(position);
    LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
    ViewHolder holder = null;
    
    if (convertView == null) {
      convertView = mInflater.inflate(R.layout.result, parent);
      holder = new ViewHolder();
      holder.wordArea = (TextView) convertView.findViewById(R.id.word);
      holder.definitionArea = (TextView) convertView.findViewById(R.id.definition);
      convertView.setTag(holder);
    } else {
      holder = (ViewHolder) convertView.getTag();
    }
    holder.wordArea.setText(word.getWord());
    holder.definitionArea.setText(word.getIndex());
    
    return convertView;
  }
}
