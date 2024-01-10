package com.example.cinemagic2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cinemagic2.databinding.ActivityPaymentBinding;
import com.example.cinemagic2.databinding.ActivitySignUpBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {
    FirebaseDatabase db;
    ActivitySignUpBinding binding;
    DatabaseReference reference;

    EditText editTextEmail,editTextPassword;
    Button register;
    FirebaseAuth mAuth;
    ProgressBar progressBar;
    TextView login_now;
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mAuth= FirebaseAuth.getInstance();
        progressBar=findViewById(R.id.progressBar);
        editTextEmail=findViewById(R.id.email);
        editTextPassword=findViewById(R.id.password);
        register=findViewById(R.id.btn_register);
        login_now=findViewById(R.id.login_now_text);
        login_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                finish();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE );
                String email,password;
                email=String.valueOf(editTextEmail.getText());
                String sanitizedEmail = email.replace(".", "_dot_")
                        .replace("#", "_hash_")
                        .replace("$", "_dollar_")
                        .replace("[", "_leftBracket_")
                        .replace("]", "_rightBracket_")
                        .replace("@", "_at_");
                password=String.valueOf(editTextPassword.getText());
                if(TextUtils.isEmpty(email)){
                    Toast.makeText(SignUp.this, "Enter Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(SignUp.this, "Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }

                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (task.isSuccessful()) {



                                    Users user=new Users(email);
                                    db=FirebaseDatabase.getInstance();
                                    reference=db.getReference("Users");
                                    reference.child(sanitizedEmail).setValue(null).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            Toast.makeText(SignUp.this, "Account Created", Toast.LENGTH_SHORT).show();
                                        }
                                    });

                                } else {
                                    // If sign in fails, display a message to the user.

                                    Toast.makeText(SignUp.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

    }
}