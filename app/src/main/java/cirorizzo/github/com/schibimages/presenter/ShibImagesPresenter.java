package cirorizzo.github.com.schibimages.presenter;

import android.content.Context;

import cirorizzo.github.com.schibimages.model.ImagesURLsData;
import cirorizzo.github.com.schibimages.view.ImagesAdapter;
import cirorizzo.github.com.schibimages.view.MainViewInterface;

public interface ShibImagesPresenter {
    void connect(MainViewInterface mainViewInterface);
    void retrieveData(Context context, ImagesAdapter imagesAdapter, ImagesURLsData imagesURLsData);
}
