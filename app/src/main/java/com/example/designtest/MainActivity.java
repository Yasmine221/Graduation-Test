package com.example.designtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView hotDrinkCard, coldDrinkCard, pizzaCard, pastaCard, sandwichCard, sweetsCard;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.categories);

        hotDrinkCard = findViewById(R.id.hotDrinkCard);
        coldDrinkCard = findViewById(R.id.coldDrinkCard);
        pizzaCard = findViewById(R.id.pastaCard);
        pastaCard = findViewById(R.id.pastaCard);
        sandwichCard = findViewById(R.id.sandwichCard);
        sweetsCard = findViewById(R.id.sweetsCard);


        hotDrinkCard.setOnClickListener(this);
        coldDrinkCard.setOnClickListener(this);
        pizzaCard.setOnClickListener(this);
        pastaCard.setOnClickListener(this);
        sandwichCard.setOnClickListener(this);
        sweetsCard.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.hotDrinkCard:

                hotDrinkCard.setVisibility(View.GONE);
                coldDrinkCard.setVisibility(View.GONE);
                pastaCard.setVisibility(View.GONE);
                sandwichCard.setVisibility(View.GONE);
                sweetsCard.setVisibility(View.GONE);
                pizzaCard.setVisibility(View.GONE);

                Fragment fragment1 = new HotDrinksFragment();
                FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                fragmentTransaction1.replace(R.id.container,fragment1).commit();
                break;

            case R.id.coldDrinkCard:

                hotDrinkCard.setVisibility(View.GONE);
                coldDrinkCard.setVisibility(View.GONE);
                pastaCard.setVisibility(View.GONE);
                sandwichCard.setVisibility(View.GONE);
                sweetsCard.setVisibility(View.GONE);
                pizzaCard.setVisibility(View.GONE);

                Fragment fragment2 = new ColdDrinksFragment();
                FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                fragmentTransaction2.replace(R.id.container,fragment2).commit();
                break;

            case R.id.pizzaCard:

                hotDrinkCard.setVisibility(View.GONE);
                coldDrinkCard.setVisibility(View.GONE);
                pastaCard.setVisibility(View.GONE);
                sandwichCard.setVisibility(View.GONE);
                sweetsCard.setVisibility(View.GONE);
                pizzaCard.setVisibility(View.GONE);

                Fragment fragment3 = new PizzaFragment();
                FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                fragmentTransaction3.replace(R.id.container,fragment3).commit();
                break;

            case R.id.pastaCard:
                hotDrinkCard.setVisibility(View.GONE);
                coldDrinkCard.setVisibility(View.GONE);
                pizzaCard.setVisibility(View.GONE);
                pastaCard.setVisibility(View.GONE);
                sandwichCard.setVisibility(View.GONE);
                sweetsCard.setVisibility(View.GONE);

                Fragment fragment4 = new PastaFragment();
                FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
                fragmentTransaction4.replace(R.id.container,fragment4).commit();
                break;

            case R.id.sandwichCard:

                hotDrinkCard.setVisibility(View.GONE);
                coldDrinkCard.setVisibility(View.GONE);
                pastaCard.setVisibility(View.GONE);
                sandwichCard.setVisibility(View.GONE);
                sweetsCard.setVisibility(View.GONE);
                pizzaCard.setVisibility(View.GONE);


                Fragment fragment5 = new SandwichFragment();
                FragmentTransaction fragmentTransaction5 = getSupportFragmentManager().beginTransaction();
                fragmentTransaction5.replace(R.id.container,fragment5).commit();
                break;

            case R.id.sweetsCard:

                hotDrinkCard.setVisibility(View.GONE);
                coldDrinkCard.setVisibility(View.GONE);
                pastaCard.setVisibility(View.GONE);
                sandwichCard.setVisibility(View.GONE);
                sweetsCard.setVisibility(View.GONE);
                pizzaCard.setVisibility(View.GONE);


                Fragment fragment6 = new SweetsFragment();
                FragmentTransaction fragmentTransaction6 = getSupportFragmentManager().beginTransaction();
                fragmentTransaction6.replace(R.id.container,fragment6).commit();
                break;

            default:
                break;
        }
    }

}