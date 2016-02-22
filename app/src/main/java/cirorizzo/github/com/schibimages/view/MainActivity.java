package cirorizzo.github.com.schibimages.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import cirorizzo.github.com.schibimages.R;
import cirorizzo.github.com.schibimages.ShibImagesApplication;
import cirorizzo.github.com.schibimages.injection.InjectionImagesURLsData;
import cirorizzo.github.com.schibimages.injection.InjectionShibImagesPresenterImpl;
import cirorizzo.github.com.schibimages.model.ImagesURLsData;
import cirorizzo.github.com.schibimages.presenter.ShibImagesPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainViewInterface {
    private RecyclerView containerRecyclerView;
    private ImagesAdapterImpl imagesAdapterImpl;
    private ShibImagesPresenterImpl shibImagesPresenterImpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();

        connectingToPresenter();

        getImages();
    }

    private void initRecyclerView() {
        containerRecyclerView = (RecyclerView) findViewById(R.id.data_recycler_view);
        containerRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        imagesAdapterImpl = new ImagesAdapterImpl(this);
        containerRecyclerView.setAdapter(imagesAdapterImpl);
    }

    private void connectingToPresenter() {
        if (shibImagesPresenterImpl == null) {
            shibImagesPresenterImpl = injectWhitSquarePresenter();
        }
        shibImagesPresenterImpl.connect(this);
    }

    private ShibImagesPresenterImpl injectWhitSquarePresenter() {
        ShibImagesApplication shibImagesApplication = (ShibImagesApplication) getApplication();
        InjectionShibImagesPresenterImpl injectionShibImagesPresenterImpl = shibImagesApplication.getInjectionShibImagesPresenterImpl();

        return injectionShibImagesPresenterImpl.provideShibImagesPresenterImpl();
    }

    private ImagesURLsData injectImagesURLsData() {
        ShibImagesApplication shibImagesApplication = (ShibImagesApplication) getApplication();
        InjectionImagesURLsData injectionImagesURLsData = shibImagesApplication.getInjectionImagesURLsData();

        return injectionImagesURLsData.provideImagesURLsData();
    }

    private void getImages() {
        shibImagesPresenterImpl.retrieveData(getApplicationContext(), imagesAdapterImpl, injectImagesURLsData());
    }

    @Override
    public void setUIMessage(final String message) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
