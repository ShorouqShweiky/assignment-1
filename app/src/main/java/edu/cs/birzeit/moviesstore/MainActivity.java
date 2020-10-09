package edu.cs.birzeit.moviesstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import edu.cs.birzeit.moviesstore.model.IMovieData;
import edu.cs.birzeit.moviesstore.model.Movie;
import edu.cs.birzeit.moviesstore.model.MovieFactory;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private EditText txtMessage,txtMessageres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        populateSpinner();
    }

    private void populateSpinner() {
        MovieFactory factory = new MovieFactory();
        IMovieData objMovie = factory.getModel();

        String[] cats = objMovie.getGenre();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, cats);

        spinner.setAdapter(adapter);

    }

    public void btnSearchOnClick(View view) {

        MovieFactory factory = new MovieFactory();
        IMovieData objMovie = factory.getModel();

        String item  = "";

        item = spinner.getSelectedItem().toString();

        List<Movie> Movies = objMovie.getMovies(item);

        String str = "";
        for(Movie b:Movies){
            str+=b.getTitle() + "\n" +b.getYear() + "\n"+b.getGenre() + "\n";
        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();



    }
  }