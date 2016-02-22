package cirorizzo.github.com.schibimages;

import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import cirorizzo.github.com.schibimages.injection.InjectionImagesURLsData;
import cirorizzo.github.com.schibimages.model.ImagesURLsData;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ImagesURLsDataTest {
    private ImagesURLsData imagesURLsData;

    @Before
    public void setUp() throws Exception {
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        MockShibImagesApplication app
                = (MockShibImagesApplication) instrumentation.getTargetContext().getApplicationContext();
        InjectionImagesURLsData injectionImagesURLsData = app.getInjectionImagesURLsData();
        imagesURLsData = injectionImagesURLsData.provideImagesURLsData();
    }

    @Test
    public void getSize() {
        assertTrue(imagesURLsData.getSize() > 0);
    }

    @Test
    public void getPositionNullHigher() {
        assertNull(imagesURLsData.getImageURL(99999));
    }

    @Test
    public void getPositionNullLower() {
        assertNull(imagesURLsData.getImageURL(-99999));
    }

    @Test
    public void getPosition() {
        Random r = new Random();
        assertTrue(!imagesURLsData.getImageURL(r.nextInt(imagesURLsData.getSize() - 1)).isEmpty());
    }

}
