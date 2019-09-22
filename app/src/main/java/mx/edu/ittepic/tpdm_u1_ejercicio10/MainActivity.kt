package mx.edu.ittepic.tpdm_u1_ejercicio10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var user : EditText?=null
    var pass : EditText?=null
    var boton1 : Button?=null
    var arrayUser = arrayOf("roberto","pablo","tapia","karen","benigno")
    var arrayPass = arrayOf("password","password","password","password","password")
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user = findViewById(R.id.usuario)
        pass = findViewById(R.id.contraseña)
        boton1 = findViewById(R.id.aut)


        boton1?.setOnClickListener {
            if(user?.text.toString().equals(arrayUser.get(0)) && pass?.text.toString().equals(arrayPass.get(0))){
                Toast.makeText(this, "Aceptado", Toast.LENGTH_LONG).show()
                var otraActiviti = Intent( this,Main2Activity::class.java)
                startActivity(otraActiviti)
            }
            else
                if(user?.text.toString().equals(arrayUser.get(1)) && pass?.text.toString().equals(arrayPass.get(1))) {
                    Toast.makeText(this, "Aceptado", Toast.LENGTH_LONG).show()
                }
                else
                    if(user?.text.toString().equals(arrayUser.get(2)) && pass?.text.toString().equals(arrayPass.get(2))) {
                        Toast.makeText(this, "Aceptado", Toast.LENGTH_LONG).show()
                    }
                    else
                        if(user?.text.toString().equals(arrayUser.get(3)) && pass?.text.toString().equals(arrayPass.get(3))) {
                            Toast.makeText(this, "Aceptar", Toast.LENGTH_LONG).show()
                        }
                        else
                            if(user?.text.toString().equals(arrayUser.get(4)) && pass?.text.toString().equals(arrayPass.get(4))){
                                Toast.makeText(this, "Aceptado", Toast.LENGTH_LONG).show()
                            }
            else{
                Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()
                count ++
                if(count >= 3){
                    finish()
                }
            }


        }

    }

}
