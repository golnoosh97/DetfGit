package ir.malv.detfgit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private Rss rss;

    public RecyclerAdapter(Rss rss) {
        this.rss = rss;
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView title;
        //public TextView managingEditor;
        public TextView description;
        public ImageView url;
        public TextView pubDate;
        public TextView link;
        public TextView enclosure;
     //   public TextView length ;
      //  public TextView type ;
       // public TextView url ;


        public  MyViewHolder(View view)
        {
            super(view);

            title = (TextView) view.findViewById(R.id.title);
           // managingEditor= (TextView) view.findViewById(R.id.managingEditor);
            description = (TextView) view.findViewById(R.id.description);
            link  = (TextView) view.findViewById(R.id.link);
            pubDate= (TextView) view.findViewById(R.id.pubDate);
          //  enclosure= (TextView) view.findViewById(R.id.enclosure);

        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//
//        holder.title.setText(items.get(position).getTitle());
//       // holder.managingEditor.setText(channels.get(position).getManagingEditor());
//        holder.description.setText(items.get(position).getDescription());
//        holder.link.setText(items.get(position).getLink());
//       // holder.lastBuildDate.setText(channels.get(position).getLastBuildDate());
//        //holder.item.setText(channels.get(position).getItem());
//       // holder.generator.setText(channels.get(position).getGenerator());
//       // holder.webMaster.setText(channels.get(position).getWebMaster());
//        //holder.author.setText(items.get(position).getAuthor());
//        holder.pubDate.setText(items.get(position).getPubDate());
     //   holder.enclosure.setText(items.get(position).getEnclosure());
        //holder.length.setText(enclosures.get(position).getLength());
       // holder.type.setText(enclosures.get(position).getType());
        //holder.url.setText(enclosures.get(position).getUrl());
    }

   @Override
    public int getItemCount() {

        return rss.getChannel().item.size();
//        return items.size();
    }

}

