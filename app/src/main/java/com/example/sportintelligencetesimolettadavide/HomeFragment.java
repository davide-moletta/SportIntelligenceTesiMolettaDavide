package com.example.sportintelligencetesimolettadavide;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    private Toast toast;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Controller per gestire la navigazione tra i vari fragment
        NavController navController = Navigation.findNavController(view);

        //Ogni textView prende l'id dichiarato nel file xml
        TextView tennisButton = view.findViewById(R.id.tennisButton);
        TextView soccerButton = view.findViewById(R.id.soccerButton);
        TextView volleyButton = view.findViewById(R.id.volleyButton);
        TextView basketButton = view.findViewById(R.id.basketButton);

        //Creo il toast da mostrare
        toast = Toast.makeText(getContext(), "NON ANCORA IMPLEMENTATO", Toast.LENGTH_SHORT);

        tennisButton.setOnClickListener(v -> {
            //Se l'utente clicca sul pulsante tennis il controller naviga verso il fragment specificato
            navController.navigate(R.id.action_homeFragment_to_tennisFragment);
        });

        soccerButton.setOnClickListener(v -> {
            //Mostra il toast con il messaggio "NON ANCORA IMPLEMENTATO"
            toast.show();
        });

        volleyButton.setOnClickListener(v -> {
            //Mostra il toast con il messaggio "NON ANCORA IMPLEMENTATO"
            toast.show();
        });

        basketButton.setOnClickListener(v -> {
            //Mostra il toast con il messaggio "NON ANCORA IMPLEMENTATO"
            toast.show();
        });
    }
}