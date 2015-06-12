package com.nicolasposada.sandwichcubano;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Publicidad extends ActionBarActivity {

    private static DataBaseManager Manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicidad);
        Manager = new DataBaseManager(this);
    }

    public static DataBaseManager getManager() {
        return Manager;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_publicidad, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_coord){
            Intent t = new Intent(this,MainActivity.class);
            startActivity(t);
        }else if (id == R.id.action_map){
            Intent t = new Intent(this,mapa.class);
            startActivity(t);
        }

        return super.onOptionsItemSelected(item);
    }
}
