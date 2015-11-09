package com.nju.chemtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zxing.activity.CaptureActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class FragmentHist extends Fragment{
	private List<Map<String, String>> mData;
	private ListView listView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }
 
    @Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState)  
    {  
    	View view = inflater.inflate(R.layout.historylist, container, false);
    	listView = (ListView) view.findViewById(R.id.histlist);
    	
    	mData = getData();
        MyAdapter adapter = new MyAdapter(getActivity());
        listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent intent = new Intent();
				intent.setClass(getActivity(), OneChemActivity.class);
				startActivity(intent);
				
			}
        	
        	
		});
        listView.setAdapter(adapter);
        return view;  
    }  
    
    
    private List<Map<String, String>> getData() {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
 
        Map<String, String> map = new HashMap<String, String>();
        map.put("title", "1,2,3-ÈýÂÈ´ú±½");
        map.put("cas", "CAS±àºÅ£º87-61-6");
        list.add(map);
 
        map = new HashMap<String, String>();
        map.put("title", "1,2,3-ÈýÂÈ´ú±½");
        map.put("cas", "CAS±àºÅ£º87-61-6");
        list.add(map);
 
        map = new HashMap<String, String>();
        map.put("title", "1,2,3-ÈýÂÈ´ú±½");
        map.put("cas", "CAS±àºÅ£º87-61-6");
        list.add(map);
         
        return list;
    }
    
    
    
    public final class ViewHolder{
        public TextView title;
        public TextView cas;
    }
     
     
    public class MyAdapter extends BaseAdapter{
 
        private LayoutInflater mInflater;
         
         
        public MyAdapter(Context context){
            this.mInflater = LayoutInflater.from(context);
        }
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return mData.size();
        }
 
        @Override
        public Object getItem(int arg0) {
            // TODO Auto-generated method stub
            return null;
        }
 
        @Override
        public long getItemId(int arg0) {
            // TODO Auto-generated method stub
            return 0;
        }
 
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
             
            ViewHolder holder = null;
            if (convertView == null) {
                 
                holder=new ViewHolder();  
                 
                convertView = mInflater.inflate(R.layout.historyitem, null);
                holder.title = (TextView)convertView.findViewById(R.id.text1);
                holder.cas = (TextView)convertView.findViewById(R.id.text2);
                convertView.setTag(holder);
                 
            }else {
                 
                holder = (ViewHolder)convertView.getTag();
            }
             
             
            holder.title.setText((String)mData.get(position).get("title"));
            holder.cas.setText((String)mData.get(position).get("cas"));
                    
            return convertView;
        }
 
    }
}