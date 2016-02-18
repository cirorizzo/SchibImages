package cirorizzo.github.com.schibimages.injection;

import cirorizzo.github.com.schibimages.presenter.ShibImagesPresenterImpl;

public class InjectionShibImagesPresenterImpl {
    private ShibImagesPresenterImpl shibImagesPresenter = null;

    protected ShibImagesPresenterImpl createShibImagesPresenterImpl() {
        return new ShibImagesPresenterImpl();
    }

    public ShibImagesPresenterImpl provideShibImagesPresenterImpl() {
        shibImagesPresenter = (shibImagesPresenter == null) ? createShibImagesPresenterImpl() : shibImagesPresenter;
        return shibImagesPresenter;
    }

}
