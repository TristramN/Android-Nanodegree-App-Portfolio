package com.appportfolio.tristramnorman.appportfolio;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AppPortfolioActivity extends Activity implements View.OnClickListener {
    public Button spotifyStreamerBtn;
    public Button scoresAppBtn;
    public Button libAppBtn;
    public Button buildItBiggerBtn;
    public Button xyzReaderBtn;
    public Button myOwnAppBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);

        spotifyStreamerBtn = (Button)findViewById(R.id.spotifyStreamerBtn);
        spotifyStreamerBtn.setOnClickListener(this);
        scoresAppBtn = (Button)findViewById(R.id.scoresAppBtn);
        scoresAppBtn.setOnClickListener(this);
        libAppBtn = (Button)findViewById(R.id.libraryAppBtn);
        libAppBtn.setOnClickListener(this);
        buildItBiggerBtn = (Button)findViewById(R.id.buildItBiggerBtn);
        buildItBiggerBtn.setOnClickListener(this);
        xyzReaderBtn = (Button)findViewById(R.id.xyzReaderBtn);
        xyzReaderBtn.setOnClickListener(this);
        myOwnAppBtn = (Button)findViewById(R.id.myAppBtn);
        myOwnAppBtn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_portfolio, menu);
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

    /***
     * Buttons
     */
    @Override
    public void onClick(View v) {
        CharSequence text = "";
        switch(v.getId()){
            case R.id.spotifyStreamerBtn:
                text = "Launch Spotify Streaming App!";
                break;
            case R.id.scoresAppBtn:
                text = "Launch Scores App!";
                break;
            case R.id.libraryAppBtn:
                text = "Launch Library App!";
                break;
            case R.id.buildItBiggerBtn:
                text = "Launch Build it Bigger App!";
                break;
            case R.id.xyzReaderBtn:
                text = "Launch XYZ Reader App!";
                break;
            case R.id.myAppBtn:
                text = "Launch My App!";
                break;
        }
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
        toast.show();
    }
}
