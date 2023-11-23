package com.example.projecttherion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.projecttherion.DTO.AuthResponse;
import com.example.projecttherion.DTO.ClientRequest;
import com.example.projecttherion.api.IApiService;
import com.example.projecttherion.api.RetrofitClient;

public class SignClient extends AppCompatActivity {

    EditText nombre, appat, apmat, correo, contrasenna, numero1, numero2;

    Button boton;

    IApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_client);

        // Inicializar apiService
        apiService = RetrofitClient.getClient().create(IApiService.class);

        nombre = findViewById(R.id.clNombre);
        appat = findViewById(R.id.clAppat);
        apmat = findViewById(R.id.clAppmat);
        correo = findViewById(R.id.clCorreo);
        contrasenna = findViewById(R.id.clContrasenna);
        numero1 = findViewById(R.id.clNumero1);
        numero2 = findViewById(R.id.clNumero2);
        boton = findViewById(R.id.registrarClienteButton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Se hizo Click");
                registrarCliente();

            }
        });
    }

    private void registrarCliente(){

        System.out.println("Se Comenzó el metodo");

         String clNombre = nombre.getText().toString();
         String clAppat = appat.getText().toString();
         String clApmat = apmat.getText().toString();
         String clCorreo = correo.getText().toString();
         String clContrasenna = contrasenna.getText().toString();
         String clNumero1 = numero1.getText().toString();
         String clNumero2 = numero2.getText().toString();


        System.out.println("Datos que se han metido: " + clNombre + clApmat + clApmat + clCorreo + clContrasenna + clNumero1 + clNumero2);
         //Crear ClientRequest

        ClientRequest clientRequest = new ClientRequest(clNombre, clAppat, clApmat,clCorreo,clContrasenna, clNumero1, clNumero2);

        System.out.println(clientRequest.getClNombre());

        //Realizar la llamada
        Call<AuthResponse> call = apiService.registrarClient(clientRequest);

        System.out.println("Se hizo la llamada");

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
            public void onFailure(retrofit2.Call<AuthResponse> call, Throwable t) {
                // Manejar el error de la llamada, por ejemplo, mostrar un mensaje de error
                System.out.println("Fallo la App :(");
                t.printStackTrace();  // Imprime el stack trace del error
            }
        });
    }
}