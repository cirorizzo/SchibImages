package cirorizzo.github.com.schibimages.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import cirorizzo.github.com.schibimages.R;
import cirorizzo.github.com.schibimages.model.ImagesURLsData;
import cirorizzo.github.com.schibimages.model.ImagesURLsDataHolder;

public class ImagesAdapterImpl extends RecyclerView.Adapter<ImagesURLsDataHolder> implements ImagesAdapter {
    private Context context;
    private ImagesURLsData imagesURLsData;

    public ImagesAdapterImpl(Context context) {
        this.context = context;
    }

    @Override
    public ImagesURLsDataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ImagesURLsDataHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.row_card_view, parent, false));
    }

    @Override
    public void onBindViewHolder(ImagesURLsDataHolder holder, int position) {
        Glide.with(context)
                .load(imagesURLsData.getImageURL(position))
                .placeholder(R.mipmap.document_image_cancel)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(holder.imgVw_shib);
    }

    @Override
    public int getItemCount() {
        return (imagesURLsData != null) ? imagesURLsData.getSize() : 0;
    }

    @Override
    public void setData(ImagesURLsData imagesURLsData) {
        this.imagesURLsData = imagesURLsData;
        notifyDataSetChanged();
    }
}
