package com.example.projecttherion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.projecttherion.Adaptadores.NegocioAdaptador;
import com.example.projecttherion.Modelos.Negocio;
import com.example.projecttherion.api.IApiService;
import com.example.projecttherion.api.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Business extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NegocioAdaptador adapter;

    IApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        apiService = RetrofitClient.getClient().create(IApiService.class);


        // Inicializar tu adaptador
        adapter = new NegocioAdaptador(new ArrayList<>());
        recyclerView.setAdapter(adapter);

        // Aquí llamas a obtenerNegocios para cargar la lista
        obtenerNegocios();

    }

    // Método para obtener la lista de negocios (puedes ajustarlo según tu lógica)
    private void obtenerNegocios() {

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String token = sharedPreferences.getString("token", "");

        // Hacer la llamada asíncrona
        Call<List<Negocio>> call = apiService.consultarNegocios("Bearer " + token);
        call.enqueue(new Callback<List<Negocio>>() {

            @Override
            public void onResponse(Call<List<Negocio>> call, Response<List<Negocio>> response) {
                if (response.isSuccessful()) {
                    List<Negocio> listaNegocios = response.body();

                    // Aquí puedes procesar la lista de negocios según tus necesidades
                    List<Negocio> negociosModel = convertirNegociosAModelo(listaNegocios);

                    adapter.setNegocios(negociosModel);
                    adapter.notifyDataSetChanged();

                } else {
                    // Manejar respuesta no exitosa
                    System.out.println("Hubo un error");
                }
            }

            @Override
            public void onFailure(Call<List<Negocio>> call, Throwable t) {
                System.out.println("Chispas, hubo un error: " + t);
            }
        });
    }

    // Método para convertir la lista de objetos Negocio a BusinessModel
    private List<Negocio> convertirNegociosAModelo(List<Negocio> listaNegocios) {
        List<Negocio> negociosModel = new ArrayList<>();
        for (Negocio negocio : listaNegocios) {

            // Aquí debes crear lógica para convertir cada objeto Negocio a BusinessModel
            // Por ejemplo, puedes usar el constructor de BusinessModel para hacerlo

            negociosModel.add(new Negocio(negocio.getNeNombre(), negocio.isNeActivo(),negocio.getNeImagen()));
        }
        return negociosModel;
    }
}

