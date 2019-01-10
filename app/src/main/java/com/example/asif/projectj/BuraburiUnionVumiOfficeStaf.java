package com.example.asif.projectj;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class BuraburiUnionVumiOfficeStaf extends AppCompatActivity {

    ImageButton uVuSohoKormokorta,uVuUpoSohoKormokorta,officeSohayok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buraburi_union_vumi_office_staf);

        uVuSohoKormokorta=findViewById(R.id.buraburi_union_vumi_office_u_vu_soho_kormokorta);
        uVuUpoSohoKormokorta=findViewById(R.id.buraburi_union_vumi_office_u_vu_upo_soho_kormokorta);
        officeSohayok=findViewById(R.id.buraburi_union_vumi_office_office_sohayok);

        uVuSohoKormokorta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01711957727"));
                startActivity(callIntent);

            }
        });

        uVuUpoSohoKormokorta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01720509365"));
                startActivity(callIntent);

            }
        });

        officeSohayok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01718695155"));
                startActivity(callIntent);

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
                Intent intent=new Intent(BuraburiUnionVumiOfficeStaf.this,AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
