package com.aina.adnd.p0;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button mbtnP1;
    private Button mbtnP3_1;
    private Button mbtnP3_2;
    private Button mbtnP4;
    private Button mbtnP5;
    private Button mbtnP6;

    private static final String MSG = "This button will launch my ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtnP1 = (Button) findViewById(R.id.btn_p1);
        mbtnP3_1 = (Button) findViewById(R.id.btn_p3_1);
        mbtnP3_2 = (Button) findViewById(R.id.btn_p3_2);
        mbtnP4 = (Button) findViewById(R.id.btn_p4);
        mbtnP5 = (Button) findViewById(R.id.btn_p5);
        mbtnP6 = (Button) findViewById(R.id.btn_p6);

        mbtnP1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        MSG + getString(R.string.prj1) + "!", Toast.LENGTH_SHORT).show();
            }
        });

        mbtnP3_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        MSG + getString(R.string.prj3_1) + "!", Toast.LENGTH_SHORT).show();
            }
        });

        mbtnP3_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        MSG + getString(R.string.prj3_2) + "!", Toast.LENGTH_SHORT).show();
            }
        });

        mbtnP4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        MSG + getString(R.string.prj4) + "!", Toast.LENGTH_SHORT).show();
            }
        });

        mbtnP5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        MSG + getString(R.string.prj5) + "!", Toast.LENGTH_SHORT).show();
            }
        });

        mbtnP6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        MSG + getString(R.string.prj6) + "!", Toast.LENGTH_SHORT).show();
            }
        });
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
