package com.example.riding;

import static android.content.ContentValues.TAG;

import androidx.annotation.LongDef;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.riding.databinding.ActivityMapsBinding;

import java.io.IOException;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    private Geocoder geocoder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        geocoder=new Geocoder(this);
//---------------------------------------------------------------------------------------------------
        View button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform login logic

                // Start the new activity



                    Intent intent = new Intent(MapsActivity.this, MainActivity4.class);
                    startActivity(intent);



            }
        });

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String loc1;
        Intent intent1 = getIntent();
        loc1=intent1.getStringExtra("dataname1");
        try {
            List<Address> addresses =geocoder.getFromLocationName(loc1,1);
             Address address1=addresses.get(0);
             LatLng data1=new LatLng(address1.getLatitude(),address1.getLongitude());
            MarkerOptions markerOptions1=new MarkerOptions()
                    .position(data1)
                    .title(address1.getLocality());
            mMap.addMarker(markerOptions1);
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(data1,11));
        } catch (IOException e) {
            e.printStackTrace();
        }

//        -----------------------------------------------------------------------------------


        String loc2;
        Intent intent2 = getIntent();
        loc2=intent2.getStringExtra("dataname2");
        try {
            List<Address> addresses =geocoder.getFromLocationName(loc2,1);
            Address address2=addresses.get(0);
            LatLng data2=new LatLng(address2.getLatitude(),address2.getLongitude());
            MarkerOptions markerOptions2=new MarkerOptions()
                    .position(data2)
                    .title(address2.getLocality());
            mMap.addMarker(markerOptions2);
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(data2,11));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}