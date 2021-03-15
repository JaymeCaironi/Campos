package com.example.campos;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.campos.ui.main.SectionsPagerAdapter;

import dao.DatabaseHelper;
import dao.Produto;
import dao.Usuario;
import dao.Venda;


public class MainActivity extends AppCompatActivity {

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        db = new DatabaseHelper(getApplicationContext());

        Usuario u1 = new Usuario (1, "Cli1", "Cidade1");
        Usuario u2 = new Usuario (4, "Cli14", "Cidade4");

        long  u1_id = db.createUsuario(u1);
        long  u2_id = db.createUsuario(u2);


        Produto pro1 = new Produto(1, "Produto 1", 5);
        Produto pro2 = new Produto(2, "Produto 2", 10);
        Produto pro3 = new Produto(3, "Produto 3", 15);
        Produto pro4 = new Produto(4, "Produto 4", 20);

        long  pro1_id = db.createProduto(pro1);
        long  pro2_id = db.createProduto(pro2);
        long  pro3_id = db.createProduto(pro3);
        long  pro4_id = db.createProduto(pro4);


        Venda ven1 = new Venda(1, "1615828539497", 5, 5);
        Venda ven2 = new Venda(2, "1615828539497", 1, 10);
        Venda ven3 = new Venda(3, "1615828539497", 1, 15);
        Venda ven4 = new Venda(4, "1615828539497", 5, 5);
        Venda ven5 = new Venda(5, "1615828539497", 1, 10);
        Venda ven6 = new Venda(6, "1615828539497", 10, 6);
        Venda ven7 = new Venda(7, "1615828539497", 2, 15);

        long  ven1_id = db.createVenda(ven1);
        long  ven2_id = db.createVenda(ven2);
        long  ven3_id = db.createVenda(ven3);
        long  ven4_id = db.createVenda(ven4);
        long  ven5_id = db.createVenda(ven5);
        long  ven6_id = db.createVenda(ven6);
        long  ven7_id = db.createVenda(ven7);

    }
}