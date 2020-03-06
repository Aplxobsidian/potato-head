package lzk.com.example.potatoman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView arms,ears,eyebrows,eyes,glasses,hat,mouth,mustache,nose,shoes;
    CheckBox carms,cears,ceyebrows,ceyes,cglasses,chat,cmouth,cmustache,cnose,cshoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms=findViewById(R.id.parms);
        ears=findViewById(R.id.pears);
        eyebrows=findViewById(R.id.peyebrows);
        eyes=findViewById(R.id.peyes);
        glasses=findViewById(R.id.pglasses);
        hat=findViewById(R.id.phat);
        mouth=findViewById(R.id.pmouth);
        mustache=findViewById(R.id.pmustache);
        nose=findViewById(R.id.pnose);
        shoes=findViewById(R.id.pshoes);

        carms=findViewById(R.id.carms);
        cears=findViewById(R.id.cears);
        ceyebrows=findViewById(R.id.ceyebrows);
        ceyes=findViewById(R.id.ceyes);
        cglasses=findViewById(R.id.cglasses);
        chat=findViewById(R.id.chat);
        cmouth=findViewById(R.id.cmouth);
        cmustache=findViewById(R.id.cmustache);
        cnose=findViewById(R.id.cnose);
        cshoes=findViewById(R.id.cshoes);


        carms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    arms.setVisibility(View.VISIBLE);
                }else {
                    arms.setVisibility(View.INVISIBLE);
                }
            }
        });

        cears.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    ears.setVisibility(View.VISIBLE);
                }else {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        ceyebrows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    eyebrows.setVisibility(View.VISIBLE);
                }else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });

        ceyes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    eyes.setVisibility(View.VISIBLE);
                }else {
                    eyes.setVisibility(View.INVISIBLE);
                }
            }
        });
        cglasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    glasses.setVisibility(View.VISIBLE);
                }else {
                    glasses.setVisibility(View.INVISIBLE);
                }
            }
        });
        chat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    hat.setVisibility(View.VISIBLE);
                }else {
                    hat.setVisibility(View.INVISIBLE);
                }
            }
        });

        cmouth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    mouth.setVisibility(View.VISIBLE);
                }else {
                    mouth.setVisibility(View.INVISIBLE);
                }
            }
        });

        cmustache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    mustache.setVisibility(View.VISIBLE);
                }else {
                    mustache.setVisibility(View.INVISIBLE);
                }
            }
        });
        cnose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    nose.setVisibility(View.VISIBLE);
                }else {
                    nose.setVisibility(View.INVISIBLE);
                }
            }
        });
        cshoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    shoes.setVisibility(View.VISIBLE);
                }else {
                    shoes.setVisibility(View.INVISIBLE);
                }
            }
        });

    }











}
