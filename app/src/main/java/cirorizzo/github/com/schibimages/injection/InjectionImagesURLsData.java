package cirorizzo.github.com.schibimages.injection;

import cirorizzo.github.com.schibimages.model.ImagesURLsData;

public class InjectionImagesURLsData {
    private ImagesURLsData imagesURLsData = null;

    protected ImagesURLsData createImagesURLsData() {
        return new ImagesURLsData();
    }

    public ImagesURLsData provideImagesURLsData() {
        imagesURLsData = (imagesURLsData == null) ? createImagesURLsData() : imagesURLsData;
        return imagesURLsData;
    }
}
