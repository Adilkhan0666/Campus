package com.example.campus;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Main_Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_main_,container,false);

        TextView notice_textView=(TextView)view.findViewById(R.id.notice_textView);
        TextView attendence_textView=(TextView)view.findViewById(R.id.attendence_textView);
        TextView placementUpdate_textView=(TextView)view.findViewById(R.id.placementUpdate_textView);
        TextView academicUpdate_textView=(TextView)view.findViewById(R.id.academicUpdate_textView);
       // TextView adminNoticePanel_textView=(TextView)view.findViewById(R.id.adminNoticePanel_textView);


        notice_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),NoticeActivity.class);
                startActivity(intent);
            }
        });
        academicUpdate_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),AcademicUpdates.class);
                startActivity(intent);
            }
        });
        attendence_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),AttendenceActivity.class);
                startActivity(intent);
            }
        });
        placementUpdate_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),PlacementUpdateActiviy.class);
                startActivity(intent);
            }
        });
//        adminNoticePanel_textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(getActivity(),AdminNoticePanelActivity.class);
//                startActivity(intent);
//            }
//        });



        return view;
    }
}
