package com.example.mymapsapps;

import androidx.fragment.app.FragmentActivity;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mymapsapps.databinding.ActivityNearbyMapsBinding;

import java.io.IOException;
import java.util.List;

public class NearbyMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityNearbyMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityNearbyMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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

        // Add a marker in Bandar_Machang and move the camera
        LatLng UiTM_MACHANG = new LatLng(5.7570, 102.2735);
        mMap.addMarker(new MarkerOptions().position(UiTM_MACHANG).title("Marker in UiTM_MACHANG"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UiTM_MACHANG));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(UiTM_MACHANG, 20));

        LatLng Bandar_Machang = new LatLng(5.7649, 102.2210);
        mMap.addMarker(new MarkerOptions().position(Bandar_Machang).title("Marker in Bandar_Machang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bandar_Machang));

        LatLng BankIslam_Machang = new LatLng(5.7643, 102.2188);
        mMap.addMarker(new MarkerOptions().position(BankIslam_Machang).title("Marker in BankIslam_Machang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BankIslam_Machang));

        LatLng PusatIslam_UiTMMachang = new LatLng(5.7585, 102.2737);
        mMap.addMarker(new MarkerOptions().position(PusatIslam_UiTMMachang).title("Marker in PusatIslam_UiTMMachang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PusatIslam_UiTMMachang));

        LatLng AsramaPuteri_TuanHaji = new LatLng(5.7573, 102.2729);
        mMap.addMarker(new MarkerOptions().position(AsramaPuteri_TuanHaji).title("Marker in AsramaPuteri_TuanHaji"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AsramaPuteri_TuanHaji));

        LatLng Perpustakaan_TengkuAnis = new LatLng(5.7594, 102.2749);
        mMap.addMarker(new MarkerOptions().position(Perpustakaan_TengkuAnis).title("Marker in Perpustakaan_TengkuAnis"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Perpustakaan_TengkuAnis));

        LatLng SevenEleven = new LatLng(5.7640, 102.2191);
        mMap.addMarker(new MarkerOptions().position(SevenEleven).title("Marker in SevenEleven"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SevenEleven));

        LatLng Petron_Machang = new LatLng(5.7645, 102.2150);
        mMap.addMarker(new MarkerOptions().position(Petron_Machang).title("Marker in Petron_Machang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Petron_Machang));

        LatLng MySarah_Hostel = new LatLng(5.7554, 102.2684);
        mMap.addMarker(new MarkerOptions().position(MySarah_Hostel).title("Marker in MySarah_Hostel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MySarah_Hostel));

        LatLng Kolej_TDM = new LatLng(5.7664, 102.2760);
        mMap.addMarker(new MarkerOptions().position(Kolej_TDM).title("Marker in Kolej_TDM"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kolej_TDM));

        LatLng Kolej_TAR = new LatLng(5.7592, 102.2736);
        mMap.addMarker(new MarkerOptions().position(Kolej_TAR).title("Marker in Kolej_TAR"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kolej_TAR));

        LatLng Mee_Celup = new LatLng(5.8171, 102.2563);
        mMap.addMarker(new MarkerOptions().position(Mee_Celup).title("Marker in Mee_Celup"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mee_Celup));

        LatLng Kolej_DatoOnn = new LatLng(5.7636, 102.2752);
        mMap.addMarker(new MarkerOptions().position(Kolej_DatoOnn).title("Marker in Kolej_DatoOnn"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kolej_DatoOnn));

        LatLng Masjid_AlBakti = new LatLng(5.7564, 102.2786);
        mMap.addMarker(new MarkerOptions().position(Masjid_AlBakti).title("Marker in Masjid_AlBakti"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Masjid_AlBakti));

        LatLng Kg_Belukar = new LatLng(5.7536, 102.2761);
        mMap.addMarker(new MarkerOptions().position(Kg_Belukar).title("Marker in Kg_Belukar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kg_Belukar));
    }
    public void onMapSearch(View view) {
        EditText locationSearch= (EditText) findViewById(R.id.editText);
        String location = locationSearch.getText().toString();
        List<Address> addressList= null;

        if (location != null || !location.equals("")) {
            Geocoder geocoder= new Geocoder(this);
            try {
                addressList= geocoder.getFromLocationName(location, 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Address address= addressList.get(0);
            LatLng latLng= new LatLng(address.getLatitude(), address.getLongitude());
            mMap.addMarker(new MarkerOptions().position(latLng).title("Marker"));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 18));
        }
    }
}