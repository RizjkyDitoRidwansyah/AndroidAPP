package com.ditoa4app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Maps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuaplikasi);
        CardView mapsCardView = findViewById(R.id.cdMenu6);
        mapsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleMaps();
            }
        });
    }

    // Open Google Maps when called
    private void openGoogleMaps() {
        String uri = "geo:latitude,longitude?q=latitude,longitude(label)";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setPackage("com.google.android.apps.maps");

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            String mapsUrl = "http://maps.google.com/maps?q=latitude,longitude";
            Intent mapsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapsUrl));
            startActivity(mapsIntent);
        }
    }
}
