package cirorizzo.github.com.schibimages.injection;

import cirorizzo.github.com.schibimages.presenter.ShibImagesPresenterImpl;

public class InjectionShibImagesPresenterImpl {
    private ShibImagesPresenterImpl shibImagesPresenterImpl = null;

    protected ShibImagesPresenterImpl createShibImagesPresenterImpl() {
        return new ShibImagesPresenterImpl();
    }

    public ShibImagesPresenterImpl provideShibImagesPresenterImpl() {
        shibImagesPresenterImpl = (shibImagesPresenterImpl == null) ? createShibImagesPresenterImpl() : shibImagesPresenterImpl;
        return shibImagesPresenterImpl;
    }

}
