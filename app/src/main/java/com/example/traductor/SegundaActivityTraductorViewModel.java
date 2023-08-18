package com.example.traductor;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.traductor.model.Ingles;

import java.util.HashMap;
import java.util.Map;

public class SegundaActivityTraductorViewModel extends AndroidViewModel {
    private Context context;
    private MutableLiveData<String>  inglesM;
    private MutableLiveData<Integer> fotoM;

    public SegundaActivityTraductorViewModel(@NonNull Application application) {
        super(application);
        this.context = application.getApplicationContext();
    }

    public LiveData<String> getInglesM(){
        if(inglesM == null){
            inglesM = new MutableLiveData<String>();
        }

        return inglesM;
    }

    public LiveData<Integer> getFotoM(){
        if(fotoM == null){
            fotoM = new MutableLiveData<Integer>();
        }

        return fotoM;
    }

    public void traducirPalabra(String palabraEs){
        Ingles ingles = new Ingles();

        inglesM.setValue(ingles.getPalabraTraducida(palabraEs));
        fotoM.setValue(ingles.getImagen(ingles.getPalabraTraducida(palabraEs)));

    }


}
