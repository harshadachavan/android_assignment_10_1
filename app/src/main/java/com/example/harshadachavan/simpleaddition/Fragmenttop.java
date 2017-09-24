package com.example.harshadachavan.simpleaddition;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Harshada Chavan on 9/24/2017.
 */

public class Fragmenttop extends Fragment {

    private static EditText edittext;

    FragmenttopListener activityCallback;

    public interface FragmenttopListener {
        public void onButtonClick(String text);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCallback = (FragmenttopListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement onFragmenttopListener");
        }
    }
    //The onCreateView() method has been modified to obtain references to the EditText and Button views in the layout.
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_top,
                container, false);

        edittext = (EditText) view.findViewById(R.id.editText1);

        //Define button as final. Capture the onclick event for this fragment
        //Once a reference to the button has been obtained it is used to set up an onClickListener on the button
        //which is configured to call a method named buttonClicked() when a click event is detected.
        final Button button =
                (Button) view.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonClicked(v);
            }
        });

        return view;
    }

    public void buttonClicked (View view) {
        activityCallback.onButtonClick(edittext.getText().toString());
    }
}
