package com.takwolf.android.repausedemo;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_new_activity)
    void onBtnNewActivityClick() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @OnClick(R.id.btn_show_dialog)
    void onBtnShowDialogClick() {
        new AlertDialog.Builder(this)
                .setMessage("This is a Dialog.")
                .setPositiveButton("Ok", null)
                .show();
    }

    @OnClick(R.id.btn_open_camera)
    void onBtnOpenCameraClick() {
        startActivity(new Intent(MediaStore.ACTION_IMAGE_CAPTURE));
    }

    @OnClick(R.id.btn_request_permission)
    void onBtnRequestPermissionClick() {
        ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA}, 0);
    }

}
