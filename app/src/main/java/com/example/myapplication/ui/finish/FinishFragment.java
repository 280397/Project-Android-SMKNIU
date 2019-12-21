package com.example.myapplication.ui.finish;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.adapter.FinishListAdapter;
import com.example.myapplication.model.DataKembaliItem;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FinishFragment extends Fragment {
    String kode, id_user_pjmm,id;
    private Button btn;
    FinishListAdapter adapter;
    RecyclerView recyclerView;
    ProgressBar progressBar;
    Button finish_btnadmin;
    TextView denda;
    private List<DataKembaliItem> finish;
    private FinishViewModel finishViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        finishViewModel =
                ViewModelProviders.of(this).get(FinishViewModel.class);


        View root = inflater.inflate(R.layout.fragment_finish, container, false);
        recyclerView = root.findViewById(R.id.rv_finish_list);

        finish_btnadmin =root.findViewById(R.id.finish_btnadmin);
       denda = root.findViewById(R.id.id_denda);
        btn = (Button) root.findViewById(R.id.finish_btnscan);
        progressBar = root.findViewById(R.id.progadd);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent intent = new Intent(getActivity(), ScanActivity.class);
////                startActivity(intent);
//            }
//        });

//        finish_btnadmin.setOnClickListener(new View.OnClickListener() {
//
//                    Intent i = new Intent(getActivity(), ScanAdminAddActivity.class);
//                    startActivity(i);
//
//        });


        return root;
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        progressBar.setVisibility(View.VISIBLE);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        recyclerView.setAdapter(adapter);
//    }
}
