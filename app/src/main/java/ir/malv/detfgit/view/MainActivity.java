package ir.malv.detfgit.view;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;

import ir.malv.detfgit.DividerItemDecoration;
import ir.malv.detfgit.R;
import ir.malv.detfgit.RecyclerAdapter;
import ir.malv.detfgit.Rss;

import ir.malv.detfgit.network.provider.DataProvider;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity implements Callback<Rss> {

    DataProvider dataProvider;


    private List<Rss.Item> items;
    private List<Rss.Channel> channels;
    private List<Rss.Enclosure> enclosures;

    private RecyclerView recyclerView;
    private RecyclerAdapter mAdapter;
    private LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setDefaultToolbar();
        initViews();

        dataProvider.getRss(this);
    }

    /**
     * Initialize XML views.
     */
    private void initViews() {

        dataProvider = DataProvider.getInstance();
        recyclerView = findViewById(R.id.recyclerview);
//        mAdapter = new RecyclerAdapter(items, channels, enclosures);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.setAdapter(mAdapter);

    }


    @Override
    public void onResponse(Call<Rss> call, Response<Rss> response) {
        if (response.isSuccessful()) {
            try {
                Rss rss = response.body();
                if (rss.getChannel() == null) {
                    Toast.makeText(this, "resuly is null", Toast.LENGTH_SHORT).show();
                } else {
                    recyclerView.setAdapter(new RecyclerAdapter(response.body()));
                }
            } catch (NullPointerException e) {
                Log.e("Network result", "Error occurred: " + e.getMessage());
            }
        }
    }

    @Override
    public void onFailure(Call<Rss> call, Throwable t) {
        if (t instanceof IOException) {
            Toast.makeText(MainActivity.this, "Connection Problem !", Toast.LENGTH_SHORT).show();
        }

    }
}


