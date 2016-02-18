package cirorizzo.github.com.schibimages;

import android.app.Application;

import cirorizzo.github.com.schibimages.injection.InjectionShibImagesPresenterImpl;

public class ShibImagesApplication extends Application {
    private final InjectionShibImagesPresenterImpl injectionShibImagesPresenter = createInjection();

    protected InjectionShibImagesPresenterImpl createInjection() {
        return new InjectionShibImagesPresenterImpl();
    }

    public InjectionShibImagesPresenterImpl getInjection() {
        return injectionShibImagesPresenter;
    }

}
