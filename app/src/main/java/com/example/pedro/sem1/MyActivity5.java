package com.example.pedro.sem1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.pedro.sem1.R;

public class MyActivity5 extends ActionBarActivity {

    public void MyActivity(View view)
    {
        Intent intent = new Intent(this, MyActivity.class);
        startActivity(intent);
    }

    public void MyActivity3(View view)
    {
        Intent intent = new Intent(this, MyActivity3.class);
        startActivity(intent);
    }

    public void MyActivity2(View view)
    {
        Intent intent = new Intent(this, MyActivity2.class);
        startActivity(intent);
    }

    public void MyActivity4(View view)
    {
        Intent intent = new Intent(this, MyActivity4.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity5);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_activity5, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
