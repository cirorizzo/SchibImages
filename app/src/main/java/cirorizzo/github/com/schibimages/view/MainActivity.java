package cirorizzo.github.com.schibimages.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import cirorizzo.github.com.schibimages.R;
import cirorizzo.github.com.schibimages.presenter.ShibImagesPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainViewInterface {
    private RecyclerView containerRecyclerView;
    private ImagesAdapter imagesAdapter;
    private ShibImagesPresenterImpl shibImagesPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();

        connectingToPresenter();
    }


    private void initRecyclerView() {
        containerRecyclerView = (RecyclerView) findViewById(R.id.data_recycler_view);
        containerRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        imagesAdapter = new ImagesAdapter(this);
        containerRecyclerView.setAdapter(imagesAdapter);
    }

    private void connectingToPresenter() {

    }
}
