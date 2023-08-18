package com.example.traductor;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.traductor.model.Ingles;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private Context context;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();

    }

    public void traductor(String palabra){
        Ingles palabras = new Ingles();
        if(palabras.getPalabraTraducida(palabra) != null){
            Intent intent = new Intent(context, SegundaActivityTraductor.class);
            intent.putExtra("palabra", palabra);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }else{
            Toast.makeText(context, "Palabra no encontrada", Toast.LENGTH_LONG).show();
        }
    }

}
