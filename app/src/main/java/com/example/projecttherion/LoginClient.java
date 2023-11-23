package com.example.projecttherion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.projecttherion.DTO.AuthResponse;
import com.example.projecttherion.DTO.LoginRequest;
import com.example.projecttherion.api.IApiService;
import com.example.projecttherion.api.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginClient extends AppCompatActivity {

    EditText contrasennaI, emailI;

    IApiService apiService;
    Button next4;
    Button next5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_client);

        //Iniciar Servicio
        apiService = RetrofitClient.getClient().create(IApiService.class);

        contrasennaI = findViewById(R.id.contrasenna);
        emailI = findViewById(R.id.email);

        next4=(Button) findViewById(R.id.button6);

        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("Se hizo click");
                loginCliente();
            }
        });
        next5=(Button) findViewById(R.id.button23);

        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginClient.this, SignClient.class);
                startActivity(i);
            }
        });
    }

    private void loginCliente(){

        System.out.println("Se inicio el metodo");

        String email = emailI.getText().toString();
        String contrasenna = contrasennaI.getText().toString();

        //Crear un objeto login

        LoginRequest loginRequest = new LoginRequest(email, contrasenna);

        Call<AuthResponse> call = apiService.loginClient(loginRequest);

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

                        Intent i = new Intent(LoginClient.this, SearchBusiness.class);
                        startActivity(i);

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