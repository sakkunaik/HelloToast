package com.example.android.hellotoast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private	int	mCount	=	0;
    private TextView mShowCount;
    String str="The count is:";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.textView2);
        }

    public void showToast(View view)
    {
        Toast	toast=Toast.makeText(this,	R.string.toast_massage,	Toast.LENGTH_LONG);
        toast.show();

        @SuppressLint("ResourceType") Toast	toast1=Toast.makeText(this,	str+mCount,	Toast.LENGTH_LONG);
        toast1.show();


    }


    public void countUp(View view)
    {

        mCount++;
        if	(mShowCount	!=	null)
            mShowCount.setText(Integer.toString(mCount));


    }
}
