package pl.nataliana.apkaoli;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openGit(View view) {
        Intent intentImplicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.github.com/natansalda"));
        try {
            startActivity(intentImplicit);
        } catch (ActivityNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void openLinkedIn(View view) {
        Intent intentImplicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/natalia-nazaruk-1b9a229a/"));
        try {
            startActivity(intentImplicit);
        } catch (ActivityNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

