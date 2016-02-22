package cirorizzo.github.com.schibimages.presenter;

import android.content.Context;
import android.support.annotation.NonNull;

import cirorizzo.github.com.schibimages.R;
import cirorizzo.github.com.schibimages.model.ImagesURLsData;
import cirorizzo.github.com.schibimages.utility.NetworkController;
import cirorizzo.github.com.schibimages.view.ImagesAdapter;
import cirorizzo.github.com.schibimages.view.MainViewInterface;

public class ShibImagesPresenterImpl implements ShibImagesPresenter {
    private MainViewInterface mainViewInterface;

    @Override
    public void connect(@NonNull MainViewInterface mainViewInterface) {
        this.mainViewInterface = mainViewInterface;
    }


    /*
        This Method could be an AsyncTask/Thread in case of Network calling or any kind of
        long process can issued with UI Thread and causing ANR
        This is not the case 'cause ImagesURLsData class has got persistent data set already
     */
    @Override
    public void retrieveData(Context context, ImagesAdapter imagesAdapter, ImagesURLsData imagesURLsData) {
        if ((imagesURLsData != null) && (imagesAdapter != null)) {
            if (new NetworkController().isConnected(context)) {
                imagesAdapter.setData(imagesURLsData);
            } else {
                mainViewInterface.setUIMessage(context.getString(R.string.no_network));
            }
        } else {
            mainViewInterface.setUIMessage(context.getString(R.string.no_data));
        }
    }

}
