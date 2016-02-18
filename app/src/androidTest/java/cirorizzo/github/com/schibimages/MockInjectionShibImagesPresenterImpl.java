package cirorizzo.github.com.schibimages;

import org.mockito.Mockito;

import cirorizzo.github.com.schibimages.injection.InjectionShibImagesPresenterImpl;
import cirorizzo.github.com.schibimages.presenter.ShibImagesPresenterImpl;

public class MockInjectionShibImagesPresenterImpl extends InjectionShibImagesPresenterImpl {
    @Override
    protected ShibImagesPresenterImpl createShibImagesPresenterImpl() {
        return Mockito.mock(ShibImagesPresenterImpl.class);
    }
}
