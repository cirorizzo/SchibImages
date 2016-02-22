package cirorizzo.github.com.schibimages.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import cirorizzo.github.com.schibimages.R;

public class ImagesURLsDataHolder extends RecyclerView.ViewHolder {
    public ImageView imgVw_shib;

    public ImagesURLsDataHolder(View itemView) {
        super(itemView);

        imgVw_shib = (ImageView) itemView.findViewById(R.id.imgVw_shib);
    }
}
