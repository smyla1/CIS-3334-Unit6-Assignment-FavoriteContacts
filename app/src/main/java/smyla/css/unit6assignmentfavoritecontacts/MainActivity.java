package smyla.css.unit6assignmentfavoritecontacts;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final int PERMISSION_REQUEST_CODE = 1;
    TextView tvContact1;
    TextView tvContact2;
    TextView tvContact3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvContact1 = (TextView) findViewById(R.id.tvContact1);
        tvContact2 = (TextView) findViewById(R.id.tvContact2);
        tvContact3 = (TextView) findViewById(R.id.tvContact3);

        tvContact1.setText(getString(R.string.first_contact) + " " + getString(R.string.first_number));
        tvContact2.setText(getString(R.string.second_contact) + " " + getString(R.string.second_number));
        tvContact3.setText(getString(R.string.third_contact) + " " + getString(R.string.third_number));

        setupButtonClickEventsCall();
        setupButtonClickEventsSMS();

        setupButton2ClickEventsCall();
        setupButton2ClickEventsSMS();

        setupButton3ClickEventsCall();
        setupButton3ClickEventsSMS();


    }

       private void setupButtonClickEventsCall() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        Button btnCall = (Button) findViewById(R.id.button1Call);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @RequiresApi(api = Build.VERSION_CODES.M)
            public void onClick(View v) {
                // Do something in response to button click
                // textViewStatus.setText("Code should display website for performance 1");
                String dial = "tel:" + getString(R.string.first_number);
                Uri call = Uri.parse(dial);
                Intent callIntent = new Intent(Intent.ACTION_CALL, call);
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }

            }
        });

    }

    private void setupButtonClickEventsSMS() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        Button btnSms = (Button) findViewById(R.id.button1SMS);
        btnSms.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @RequiresApi(api = Build.VERSION_CODES.M)
            public void onClick(View v) {
                // Do something in response to button click
                // textViewStatus.setText("Code should display website for performance 1");
                String sms = "sms:" + getString(R.string.first_number);
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse(sms));
                sendIntent.putExtra("sms_body", "Hi am on the way");
                startActivity(sendIntent);

            }
        });

    }


    private void setupButton2ClickEventsCall() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        Button btnCall = (Button) findViewById(R.id.button2Call);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @RequiresApi(api = Build.VERSION_CODES.M)
            public void onClick(View v) {
                // Do something in response to button click
                // textViewStatus.setText("Code should display website for performance 1");
                String dial = "tel:" + getString(R.string.second_number);
                Uri call = Uri.parse(dial);
                Intent callIntent = new Intent(Intent.ACTION_CALL, call);
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }

            }
        });

    }

    private void setupButton2ClickEventsSMS() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        Button btnSms = (Button) findViewById(R.id.button2SMS);
        btnSms.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @RequiresApi(api = Build.VERSION_CODES.M)
            public void onClick(View v) {
                // Do something in response to button click
                // textViewStatus.setText("Code should display website for performance 1");
                String sms = "sms:" + getString(R.string.second_number);
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse(sms));
                sendIntent.putExtra("sms_body", "Hi am on the way");
                startActivity(sendIntent);

            }
        });

    }


    private void setupButton3ClickEventsCall() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        Button btnCall = (Button) findViewById(R.id.button3Call);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @RequiresApi(api = Build.VERSION_CODES.M)
            public void onClick(View v) {
                // Do something in response to button click
                // textViewStatus.setText("Code should display website for performance 1");
                String dial = "tel:" + getString(R.string.third_number);
                Uri call = Uri.parse(dial);
                Intent callIntent = new Intent(Intent.ACTION_CALL, call);
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }

            }
        });

    }

    private void setupButton3ClickEventsSMS() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        Button btnSms = (Button) findViewById(R.id.button3SMS);
        btnSms.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @RequiresApi(api = Build.VERSION_CODES.M)
            public void onClick(View v) {
                // Do something in response to button click
                // textViewStatus.setText("Code should display website for performance 1");
                String sms = "sms:" + getString(R.string.third_number);
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse(sms));
                sendIntent.putExtra("sms_body", "Hi am on the way");
                startActivity(sendIntent);

            }
        });

    }
}
