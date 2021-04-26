package com.example.bna.ui.phone;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.bna.R;

import static android.content.ContentValues.TAG;

public class PhoneFragment extends Fragment {@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_phone, container, false);
        Button button = (Button) root.findViewById(R.id.button_call);
        EditText nomer = (EditText) root.findViewById(R.id.edittext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialContactPhone(nomer.getText().toString());
            }
        });
        return root;
    }

    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
}