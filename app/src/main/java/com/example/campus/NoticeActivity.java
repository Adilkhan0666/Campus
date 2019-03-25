package com.example.campus;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class NoticeActivity extends AppCompatActivity  implements MyRecyclerViewAdapter.ItemClickListener {
    private DatabaseReference fdb;
    MyRecyclerViewAdapter adapter;
    private TextView noticeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);


//        fdb= FirebaseDatabase.getInstance().getReference().child("Notice");
//
//        noticeTextView=(TextView)findViewById(R.id.display_notice_text);
//        fdb.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                String s=dataSnapshot.getValue().toString();
//                noticeTextView.setText(s);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//

        DatabaseReference mref=FirebaseDatabase.getInstance().getReference().child("Notice");
        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                ArrayList<String> animalNames = (ArrayList<String>) dataSnapshot.getValue();
                RecyclerView recyclerView = findViewById(R.id.rvAnimals);
                recyclerView.setLayoutManager(new LinearLayoutManager(NoticeActivity.this));
                adapter = new MyRecyclerViewAdapter(NoticeActivity.this, animalNames);
                adapter.setClickListener(NoticeActivity.this);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}

