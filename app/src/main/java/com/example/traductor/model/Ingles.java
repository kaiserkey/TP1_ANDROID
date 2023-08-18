package com.example.traductor.model;


import com.example.traductor.R;

import java.util.HashMap;
import java.util.Map;

public class Ingles {
    HashMap<String, String> diccionario = new HashMap<>();
    HashMap<String, Integer> imagenes = new HashMap<>();

    public Ingles() {
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("ave", "bird");
        imagenes.put("dog", R.drawable.dog);
        imagenes.put("cat", R.drawable.cat);
        imagenes.put("bird", R.drawable.bird);
    }

    public String getPalabraTraducida(String pEspanol){
        return diccionario.get(pEspanol);
    }

    public int getImagen(String pIngles){
        return imagenes.get(pIngles);
    }

    public HashMap<String, String> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(HashMap<String, String> diccionario) {
        this.diccionario = diccionario;
    }

    public HashMap<String, Integer> getImagenes() {
        return imagenes;
    }

    public void setImagenes(HashMap<String, Integer> imagenes) {
        this.imagenes = imagenes;
    }
}
