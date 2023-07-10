package com.example.dam_uc4_parillo;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
//import com.example.dam_uc4_parillo.placeholder.PlaceholderContent;

/**
 * A fragment representing a list of Items.
 */
public class NotaFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 2;
    private List<Nota> notaList;
    private MyNotaRecyclerViewAdapter adapterNotas;

    private NotasInteractionListener mListener;


    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public NotaFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static NotaFragment newInstance(int columnCount) {
        NotaFragment fragment = new NotaFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
                int numeroColumnas = (int) (dpWidth / 180);
                recyclerView.setLayoutManager(new StaggeredGridLayoutManager(numeroColumnas,StaggeredGridLayoutManager.VERTICAL));

            }
            notaList = new ArrayList<>();

            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));
            notaList.add(new Nota("Urgente1","Estudiar para la evaluación de la UC4 - Caso: Notas y Listas",true, android.R.color.holo_blue_light));

            adapterNotas = new MyNotaRecyclerViewAdapter(notaList,mListener);
            recyclerView.setAdapter(adapterNotas);


            //recyclerView.setAdapter(new MyNotaRecyclerViewAdapter(PlaceholderContent.ITEMS));
        }
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof NotasInteractionListener){
            mListener = (NotasInteractionListener) context;
        }else{
            throw new RuntimeException(context.toString()
                    + "Debe implementarse NotasInteractionListener");
        }
    }

}