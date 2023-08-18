package com.example.traductor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.traductor.databinding.ActivityMainBinding;
import com.example.traductor.databinding.ActivitySegundaTraductorBinding;
import com.example.traductor.model.Ingles;

public class SegundaActivityTraductor extends AppCompatActivity {

    private SegundaActivityTraductorViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySegundaTraductorBinding binding = ActivitySegundaTraductorBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_segunda_traductor);
        setContentView(binding.getRoot());

        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(SegundaActivityTraductorViewModel.class);

        vm.getInglesM().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String ingles) {
                binding.etPalabraIngles.setText(ingles);
            }
        });

        vm.getFotoM().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.imagen.setImageResource(integer);
            }
        });

        vm.traducirPalabra(getIntent().getStringExtra("palabra"));
    }
}