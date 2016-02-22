package cirorizzo.github.com.schibimages;

import android.app.Application;

import cirorizzo.github.com.schibimages.injection.InjectionImagesURLsData;
import cirorizzo.github.com.schibimages.injection.InjectionShibImagesPresenterImpl;

public class ShibImagesApplication extends Application {
    private final InjectionShibImagesPresenterImpl injectionShibImagesPresenterImpl = createInjectionShibImagesPresenterImpl();
    private final InjectionImagesURLsData injectionImagesURLsData = createInjectionImagesURLsData();

    protected InjectionShibImagesPresenterImpl createInjectionShibImagesPresenterImpl() {
        return new InjectionShibImagesPresenterImpl();
    }

    public InjectionShibImagesPresenterImpl getInjectionShibImagesPresenterImpl() {
        return injectionShibImagesPresenterImpl;
    }

    protected InjectionImagesURLsData createInjectionImagesURLsData() {
        return new InjectionImagesURLsData();
    }

    public InjectionImagesURLsData getInjectionImagesURLsData() {
        return injectionImagesURLsData;
    }

}
