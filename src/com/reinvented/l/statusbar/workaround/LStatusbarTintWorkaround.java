package com.reinvented.l.statusbar.workaround;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class LStatusbarTintWorkaround extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.l_statusbar_tint_workaround);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.lstatusbar_tint_workaround, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
//		int id = item.getItemId();
		return super.onOptionsItemSelected(item);
	}
}
