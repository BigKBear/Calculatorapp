package com.praticelogin.bigkbear.addition;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v)
    {
        //create 2 edit text variables for the two text fields
        EditText a1 = (EditText) findViewById(R.id.TFnum1);
        EditText a2 = (EditText) findViewById(R.id.TFnum2);

        //result label textview
        TextView tv = (TextView) findViewById(R.id.Lresult);

        double num1, num2, ans;
        boolean flag = false;//no division by 0 error
        num1 = Double.parseDouble(a1.getText().toString());
        num2 = Double.parseDouble(a1.getText().toString());
        ans = 0;

        switch (v.getId()){
        case R.id.Badd:
            ans = num1 + num2;
        break;
        case R.id.Bsub:
            ans = num1 - num2;
        break;
        case R.id.Bmult:
            ans = num1 * num2;
        break;
        case R.id.Bdiv:
            if(num2 == 0)
                flag = true;
            else
                ans = num1 / num2;
        break;
        }
        tv.setText(ans+"");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
