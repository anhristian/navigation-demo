package com.ebookfrenzy.navigationdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.ebookfrenzy.navigationdemo.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
  }
}
