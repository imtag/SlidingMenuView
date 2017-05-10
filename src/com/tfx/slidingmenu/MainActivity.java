package com.tfx.slidingmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {

	private SlidingMenuView smv;
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		smv = (SlidingMenuView) findViewById(R.id.smv_test);
		tv = (TextView) findViewById(R.id.tv_main_desc);
	}

	// 点击左侧菜单标签
	public void left_tag_click(View v) {
		// v转tv 为了获取内容
		TextView view = (TextView) v;
		tv.setText(view.getText());
		smv.toggle(); //关闭左侧菜单
	}

	// 点击箭头打开或返回 按钮
	public void onToggle(View v) {
		smv.toggle(); 
	}
}
