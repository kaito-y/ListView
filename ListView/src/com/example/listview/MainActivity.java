package com.example.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	//リストビューに表示するデータ
	String[] words = new String[] {
			"aaa","bbb","ccc","ddd","eee",
			"fff","ggg","hhh","iii","jjj"
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//アダプタを用意して配列wordsを紐付けます
		ArrayAdapter<String> la = 
				new ArrayAdapter<String>(this,
						android.R.layout.simple_list_item_1,words);
		
		//「main.xml」のListViewにアレイアダプタをセットします
		ListView lv = (ListView)findViewById(R.id.listview);
		lv.setAdapter(la);
	}

}
