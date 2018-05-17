package br.com.vitorcesario.pizzaria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun logar(view: View){
        val login = eTLogin.text.toString()
        val senha = eTSenha.text.toString()

        if (login == "FIAP" && senha == "123"){
            val Intent = Intent(this, PedidoActivity::class.java)
            intent.putExtra("usuario", login)
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(this, "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show()
        }
    }
}
