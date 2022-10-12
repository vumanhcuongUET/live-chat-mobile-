package com.example.livechat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.example.inapplivechat.ChatWindowActivity;
import com.example.inapplivechat.ChatWindowConfiguration;
import com.example.inapplivechat.ChatWindowUtils;

public class MainActivity extends AppCompatActivity {

    String licenceNumber = "14037057";
    String groupId = "5";
    ChatWindowConfiguration windowConfig = new ChatWindowConfiguration.Builder()
            .setLicenceNumber(licenceNumber)
            .setGroupId(groupId)
            .setVisitorEmail("vumanhcuong8bdt@gmail.com")
            .setVisitorName("Cuong")
            .build();
    ActivityResultLauncher<Intent> editConfigActivityResultLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startFullScreenWindowExample();
    }

    public void startFullScreenWindowExample(View view) {
        final Intent intent = new Intent(this, FullScreenWindowActivityExample.class);
        intent.putExtra("config", windowConfig);
        startActivity(intent);
    }
    public void startFullScreenWindowExample() {
        final Intent intent = new Intent(this, FullScreenWindowActivityExample.class);
        intent.putExtra("config", windowConfig);
        startActivity(intent);
    }
}