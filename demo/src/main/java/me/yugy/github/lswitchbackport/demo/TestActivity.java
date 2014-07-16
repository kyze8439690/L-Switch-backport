package me.yugy.github.lswitchbackport.demo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

import me.yugy.github.lswitchbackport.library.Switch;

public class TestActivity extends ActionBarActivity {

    private Switch mSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mSwitch = (Switch) findViewById(R.id.switch_view);
        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(TestActivity.this, "On", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(TestActivity.this, "Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
