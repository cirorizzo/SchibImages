package cirorizzo.github.com.schibimages.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import cirorizzo.github.com.schibimages.model.ImagesURLsData;

public class ImagesAdapter extends RecyclerView.Adapter<ImagesURLsData> {
    private Context context;

    public ImagesAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ImagesURLsData onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ImagesURLsData holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
