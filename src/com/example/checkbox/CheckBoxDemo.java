package com.example.checkbox;

import android.os.Bundle;
import android.app.Activity;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class CheckBoxDemo extends Activity implements CompoundButton.OnCheckedChangeListener  {
    CheckBox cb;
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_check_box_demo);
        cb = (CheckBox)findViewById(R.id.check);
        cb.setOnCheckedChangeListener(this);
    }


	public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {
		// TODO Auto-generated method stub
		if(isChecked){
			cb.setText("This checkbox is: checked");
		}else{
			cb.setText("This checkbox is: unchecked");
		}
	}
    
}
