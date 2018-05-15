package com.examples.scs.scs1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*Pentru primul tutorial*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //These 3 lines are used to:
        // 1. Create a string that will replace the original "Hello World!" String in the view
        // 2. Find the textfield responsible for the display of that message by using its ID that we assigned in the xml
        // R  = Resources . id = the ID category from the resources folder where the ids of the components are stored.
        // 3. Find the button that will change the text of the textfield.
        final String onClickString = "I just clicked a button!";
        final TextView hello = findViewById(R.id.helloWorld);
        Button button = findViewById(R.id.button);

        // 4. For the people that had worked with java event listeners, this should be pretty straight forward.
        // All we do is add a "onClickListener", pretty obvious, to the button, so that when the button is pressed
        // the method 'onClick' from within the new class we instantiate is called and we can set the text.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               hello.setText(onClickString);
            }
        });
    }
}
