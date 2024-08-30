package com.example.travel.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travel.Adapters.CategoryAdapter;
import com.example.travel.Adapters.PopularDomain;
import com.example.travel.Adapters.PupolarAdapter;
import com.example.travel.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterPopular,adapterCat;
    private RecyclerView recyclerViewPopular,recyclerViewCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        initRecycleView();
    }

    private void initRecycleView() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("Mar caible logo","Miami Beach","Thi is 2 beds\n" +
                "nvnjondndendjv jjcdnvcdv  denensnc scc jncns",2,true,4.8,"pic1",true,1000));
        items.add(new PopularDomain("Mirissa Beach","Mirissa Beach","iononeojnojandojfnovndojn\n" +
                "dcnnndadakdc",1,false,5,"pic2",false,2500));
        items.add(new PopularDomain("Galle Fort ","DS;MKSAKLF","DAVKANVJBVKJBIADBCIOBAJBACOJBSAOJNBCBBSD\n" +
                "OUHOUAOHOUNDACN",3,true,4.3,"pic3",true,30000));

        recyclerViewPopular=findViewById(R.id.view_pop);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        adapterPopular = new PupolarAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);


        ArrayList<PopularDomain> catsList = new ArrayList<>();
        catsList.add(new PopularDomain("effaf", "cat1"));
        catsList.add(new PopularDomain("afddffa", "cat2"));
        catsList.add(new PopularDomain("adffa", "cat3"));
        catsList.add(new PopularDomain("afdfaffa", "cat4"));
        catsList.add(new PopularDomain("affafaf", "cat5"));


        recyclerViewCategory=findViewById(R.id.view_cat);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterCat=new CategoryAdapter(catsList);
        recyclerViewCategory.setAdapter(adapterCat);
    }
}