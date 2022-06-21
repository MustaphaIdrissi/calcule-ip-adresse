package com.iptv.calculip;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;
import android.widget.EditText;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.iptv.calculip.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
     String [] Benerrz={};
     int nbres=8;
    EditText t1,t2,t3,t4,t5;
    TextView t6,t7,t8,t9,t10,t11;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    Adressip apii=new Adressip();
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);





        t1=(EditText) findViewById(R.id.idt1);
        t2=(EditText) findViewById(R.id.idt2);
        t3=(EditText) findViewById(R.id.idt3);
        t4=(EditText) findViewById(R.id.idt4);
        t5=(EditText) findViewById(R.id.idt5);
        t6=(TextView) findViewById(R.id.idt6);
        t7=(TextView) findViewById(R.id.idt7);
        t8=(TextView) findViewById(R.id.idt8);
        t9=(TextView) findViewById(R.id.idt9);
        t10=(TextView) findViewById(R.id.idt10);
        t11=(TextView) findViewById(R.id.idt11);


        t5.setText(Integer.toString(nbres));


        b1=(Button) findViewById(R.id.cal1);
        b1.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {




                String Benerrz1 = benie(t1.getText().toString());
                String Benerrz2 = benie(t2.getText().toString());
                String Benerrz3 = benie(t3.getText().toString());
                String Benerrz4 = benie(t4.getText().toString());
                nbres=Integer.parseInt(t5.getText().toString());
                String sb=t1.getText().toString()+"."+t2.getText().toString()+"."+t3.getText().toString()+"."+t4.getText().toString();
                String sbt=Benerrz1+""+Benerrz2+""+Benerrz3+""+Benerrz4;

                t6.setText(sb);
                String ma=apii.maskk(sbt,nbres);
                t7.setText(ma);

                t8.setText(apii.BRODCST(sbt,nbres));
                t9.setText(apii.Premierip(sbt,nbres));
                t10.setText(apii.lastip(sbt,nbres));
                t11.setText(apii.Nbpc(nbres));
            }
        });

    }


    public String benie(String dec){
        int stringt1 =Integer.parseInt(dec);
        String benerr = Integer.toBinaryString(stringt1);
        String zero="0";
        if(8>benerr.length()){
            int maxl=8-benerr.length();
            for(int i=1;i<maxl;i++) {
                zero="0"+zero;
            }

            return zero+""+benerr;
            }
        else {
            return benerr;
        }




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}