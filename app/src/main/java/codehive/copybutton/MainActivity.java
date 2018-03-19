package codehive.copybutton;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import codehive.copybuttonlibrary.CopyButtonLibrary;

public class MainActivity extends AppCompatActivity {



    private ImageView textbtn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textbtn = (ImageView) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        textbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyButtonLibrary copyButtonLibrary = new CopyButtonLibrary(getApplicationContext(),textView);
                copyButtonLibrary.init();
            }
        });


    }
}
