package cirorizzo.github.com.schibimages;

import cirorizzo.github.com.schibimages.injection.InjectionShibImagesPresenterImpl;

public class MockShibImagesApplication extends ShibImagesApplication {
    @Override
    protected InjectionShibImagesPresenterImpl createInjectionShibImagesPresenterImpl() {
        return new MockInjectionShibImagesPresenterImpl();
    }
}
