package com.blundell.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.blundell.logger.arrow.ArrowLog;
import com.blundell.logger.arrow.ProArrowLog;

public class DemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        final EditText editText = (EditText) findViewById(R.id.input_log_edit_text);
        findViewById(R.id.print_log_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = editText.getText().toString();
                ArrowLog.log(msg);
            }
        });
        findViewById(R.id.print_pro_log_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = editText.getText().toString();
                ProArrowLog.pal().tag("ArrowLog").width(3).height(10).log(msg).now();
            }
        });
    }
}
