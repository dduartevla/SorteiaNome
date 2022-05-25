package ufjf.dcc.debora.sorteianome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ArrayList<String> nomes = new ArrayList<>();

    public void adicionaNome(View origem){

        //Captura o nome digitado
        EditText editTextNome = findViewById(R.id.editTextNome);

        //Trabalha o nome capturado
        String nome = editTextNome.getText().toString();

        //Adiciona na lista
        nomes.add(nome);

        //Limpa campo de nome
        editTextNome.setText("Insira novo nome");

        //Atualiza contagem de nomes
        int cont = nomes.size();
        TextView editTextCont = findViewById(R.id.textViewQtdAdicionados);
        editTextCont.setText(cont+"");

    }

    public void sorteiaNome(View origem){

        //Fazendo o sorteio
        Random rand = new Random();
        int max = nomes.size();

        int posicao = rand.nextInt(max);;

        //Informando nome sorteado na tela

        TextView nomeSorteado = findViewById(R.id.textViewNomeSortado);
        nomeSorteado.setText(nomes.get(posicao));
    }
}