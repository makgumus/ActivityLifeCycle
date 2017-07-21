package com.androidedu.kodluyoruzakademi.activitylifecycle;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MethodOdeviActivity extends AppCompatActivity {
    private final String MAIN_TAG = "Software Developer";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_odevi);
        Log.e(MAIN_TAG,"onCreate");
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.e(MAIN_TAG,"onContentChanged");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MAIN_TAG,"onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(MAIN_TAG,"onRestoreInstanceState");
        //Null döndüğü için çalışmıyor.Activity yeniden çalıştığında çalışır.
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.e(MAIN_TAG,"onPostCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MAIN_TAG,"onResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(MAIN_TAG,"onPostResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(MAIN_TAG,"onAttachedToWindow");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.e(MAIN_TAG,"onCreateOptionsMenu");
        return super.onCreateOptionsMenu(menu);
        //seçenekler menüsünü ilk kez oluşturmak için kullanılır
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.e(MAIN_TAG,"onPrepareOptionsMenu");
        return super.onPrepareOptionsMenu(menu);
        //seçenekler menüsünde ayarlama yapmak için kullanılır.
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MAIN_TAG,"onPause");
        //Activity arka planda durduğunda çalışır.onResume un tersidir
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(MAIN_TAG,"onSaveInsatanceState");
        //Yeni bir activity'ye geçildiğinde eski aktivity'den veri kaybı yaşamamamızı sağlar.
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MAIN_TAG,"onStop");
        //activity görüntülenemediğinde çağrılır.
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MAIN_TAG,"onDestroy");
        //onStop metodundan sonra çalışır activity çalışma esnasında çalışmaz.
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Log.e(MAIN_TAG,"onUserInteraction");
        //kullanıcı ekranı kullandığında çağırılır.
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Log.e(MAIN_TAG,"onUserLeaveHint");
        //kullanıcı activity i arka plana almak istediğinde çalışır.
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(MAIN_TAG,"onActivityResult");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MAIN_TAG,"onRestart");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(MAIN_TAG,"onAttachFragment");
        //activity e fragment eklemede çağrılır
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(MAIN_TAG,"onConfigurationChanged");
        //config ayarlarından haberdar olmak için kullanılır.activityde görüntülenir.
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.e(MAIN_TAG,"onBackPressed");
        //geri tuş fonksiyonudur.
    }
}


