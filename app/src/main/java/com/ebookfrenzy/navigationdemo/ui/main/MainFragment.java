package com.ebookfrenzy.navigationdemo.ui.main;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.Navigation;
import com.ebookfrenzy.navigationdemo.R;

public class MainFragment extends Fragment {

  private MainViewModel mViewModel;

  public static MainFragment newInstance() {
    return new MainFragment();
  }

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.main_fragment, container, false);
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
//Obtains a reference to the navigation controller
    Button button = getView().findViewById(R.id.button);

    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        Navigation.findNavController(view).navigate(R.id.mainToSecond);
      }
    });

    //Obtains a reference to the action abject, sets message argument,
    // call the navigate(), passing through the action object.
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        EditText userText = getView().findViewById(R.id.userText);
        MainFragmentDirections.MainToSecond action = MainFragmentDirections.mainToSecond();

        action.setMessage(userText.getText().toString());
        Navigation.findNavController(view).navigate(action);

      }
    });
  }
}
