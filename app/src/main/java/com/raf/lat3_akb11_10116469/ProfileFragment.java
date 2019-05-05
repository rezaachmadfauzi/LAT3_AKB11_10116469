package com.raf.lat3_akb11_10116469;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

/**
 * A simple {@link Fragment} subclass.
 */
        public class ProfileFragment extends Fragment {


            public ProfileFragment() {
                // Required empty public constructor
            }


            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                // Inflate the layout for this fragment
                return inflater.inflate(R.layout.fragment_profile, container, false);
            }

        }
//        view = (RelativeLayout) inflater.inflate(R.layout.fragment_profile, container, false);
//
//        getActivity().setTitle("Daily Activity");
//
//
//        ImageButton btn_about = (ImageButton) view.findViewById(R.id.btn_about);
//        btn_about.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =  new Intent(getActivity(), AboutActivity.class);
//                startActivity(i);
//            }
//        });
//
//        return view;
//    }
//}