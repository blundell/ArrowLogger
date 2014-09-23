package com.blundell.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
                printArrowLog();
                promptUser();
            }

            private void printArrowLog() {
                String msg = editText.getText().toString();
                ArrowLog.log(msg);
            }
        });

        final EditText widthEditText = (EditText) findViewById(R.id.prop_log_width_edit_text);
        final EditText heightEditText = (EditText) findViewById(R.id.prop_log_height_edit_text);
        findViewById(R.id.print_pro_log_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printProArrowLog();
                promptUser();
            }

            private void printProArrowLog() {
                String msg = editText.getText().toString();
                int chosenWidth = Integer.valueOf(widthEditText.getText().toString());
                int chosenHeight = Integer.valueOf(heightEditText.getText().toString());
                ProArrowLog.pal().tag("ArrowLog").width(chosenWidth).height(chosenHeight).log(msg).now();
            }
        });
    }

    private void promptUser() {
        Toast.makeText(this, R.string.log_fyi, Toast.LENGTH_SHORT).show();
    }
}
