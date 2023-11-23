package com.example.projecttherion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projecttherion.DTO.AuthResponse;
import com.example.projecttherion.DTO.DuennoRequest;
import com.example.projecttherion.api.IApiService;
import com.example.projecttherion.api.RetrofitClient;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignOwner extends AppCompatActivity {

    Button duRegistrarButton;
    TextInputEditText duAppat, duContrasenna, duEmail ,dunNombre ,duApmat;
    IApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_owner);

        duRegistrarButton = findViewById(R.id.duRegistrarButton);
        dunNombre = findViewById(R.id.dunNombre);
        duAppat = findViewById(R.id.duAppat);
        duApmat = findViewById(R.id.duApmat);
        duEmail = findViewById(R.id.duEmail);
        duContrasenna = findViewById(R.id.duContrasenna);

        apiService = RetrofitClient.getClient().create(IApiService.class);

        duRegistrarButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Se hizo click");
                registrarDuenno();
            }
        });
    }

    private void registrarDuenno(){

        System.out.println("Se ejecutó El Metodo");

        String nombre = dunNombre.getText().toString();
        String appat = duAppat.getText().toString();
        String apmat = duApmat.getText().toString();
        String correo = duEmail.getText().toString();
        String contrasenna = duContrasenna.getText().toString();

        // Crear un objeto DuennoRequest con los datos ingresados por el usuario
        DuennoRequest duennoRequest = new DuennoRequest(nombre, appat, apmat, correo, contrasenna);

        System.out.println("El request es: " + duennoRequest);

        // Realizar la llamada al endpoint de registro
        Call<AuthResponse> call = apiService.registrarDuenno(duennoRequest);

        System.out.println("El call es: " + call);

        call.enqueue(new Callback<AuthResponse>() {
            @Override
            public void onResponse(Call<AuthResponse> call, Response<AuthResponse> response) {
                if (response.isSuccessful()) {
                    AuthResponse authResponse = response.body();
                    if (authResponse != null && authResponse.getToken() != null) {
                        String token = authResponse.getToken();

                        // Almacenar el token en SharedPreferences
                        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("token", token);
                        editor.apply();

                        // Ahora puedes usar el token según sea necesario

                        System.out.println("Yupi, si se pudo. Token: " + token);

                    } else {
                        System.out.println("Respuesta exitosa, pero el token es nulo o no válido.");
                    }
                } else {
                    // Manejar la respuesta de error, por ejemplo, mostrar un mensaje al usuario
                    System.out.println("Algo falló " + response);
                }
            }

            @Override
            public void onFailure(Call<AuthResponse> call, Throwable t) {
                // Manejar el error de la llamada, por ejemplo, mostrar un mensaje de error
                System.out.println("Fallo la App :(");
                t.printStackTrace();  // Imprime el stack trace del error
            }
        });
    }
}