package com.example.asif.projectj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainButtonOneActivity extends AppCompatActivity {

    Button mapButton,kendroOJogaJog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button_one);

        mapButton=findViewById(R.id.map_button);
        kendroOJogaJog=findViewById(R.id.kendro_o_zogazog_button);


        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneActivity.this,MainButtonOneLevelOneActivity.class);
                startActivity(intent);
            }
        });

        kendroOJogaJog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainButtonOneActivity.this,MainButtonOneLevelTwoActivity.class);
                startActivity(intent);
            }
        });

    }

    ///set menu with java file
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.about:
                Intent intent=new Intent(MainButtonOneActivity.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
