package com.order.foododeringsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DeleteUser extends AppCompatActivity {
    EditText Name;
    Button delete;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_user);
        Name = findViewById(R.id.etName);
        delete=findViewById(R.id.btnSubmit);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = Name.getText().toString();
                if (name.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter Your Name", Toast.LENGTH_SHORT).show();
                }
                else {
                    HashMap<String, String> params = new HashMap<>();
                    params.put("name", name);
                    editUserProfil(params);
                }
            }
        });
    }

    private void editUserProfil(HashMap<String, String> params) {
        final ProgressDialog progressDialog = new ProgressDialog(DeleteUser.this);
        progressDialog.setTitle("Please wait");
        progressDialog.setMessage("Registering...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        NetworkService networkService = NetworkClient.getClient().create(NetworkService.class);
        Call<DeleteUserResponseModel> deleteUserProfilCall = networkService.deleteUser(params);
        deleteUserProfilCall.enqueue(new Callback<DeleteUserResponseModel>() {
            @Override
            public void onResponse(@NonNull Call<DeleteUserResponseModel> call, @NonNull Response<DeleteUserResponseModel> response) {
                DeleteUserResponseModel responseBody = response.body();
                if (responseBody != null) {
                    if (responseBody.getSuccess().equals("1")) {
                        Toast.makeText(DeleteUser.this, responseBody.getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(DeleteUser.this, Admin_page2.class);
                        startActivity(intent);
                        finish();
                    } else if (responseBody.getSuccess().equals("0")) {
                        Toast.makeText(getApplicationContext(), responseBody.getMessage(), Toast.LENGTH_SHORT).show();
                    } else if (responseBody.getSuccess().equals("2")) {
                        Toast.makeText(getApplicationContext(), responseBody.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                progressDialog.dismiss();
            }


            @Override
            public void onFailure(@NonNull Call<DeleteUserResponseModel> call, @NonNull Throwable t) {
                progressDialog.dismiss();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_menu, menu);
        MenuItem item1 = menu.findItem(R.id.item2);
        item1.setVisible(false);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item){
        // Handle menu item clicks here.
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.item1:
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}