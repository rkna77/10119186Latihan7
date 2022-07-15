package com.example.a10119186latihan7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{

    List<Post> postList;
    Context context;

    public PostAdapter(Context context, List<Post> posts){
        this.context = context;
        postList = posts;
    }
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_items, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = postList.get(position);
        holder.name.setText("Nama Pahlawan = " + post.getName());
        holder.birth_year.setText("Tahun Lahir = " + post.getBirth_year());
        holder.death_year.setText("Tahun Meninggal = " + post.getDeath_year());
        holder.description.setText("Deskripsi Pahlawan = " + post.getDescription());

    }
    @Override
    public int getItemCount() {
        return postList.size();
    }


    public class  PostViewHolder extends RecyclerView.ViewHolder{
        TextView name,birth_year, death_year, description;
        public PostViewHolder(@NonNull View itemView)  {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            birth_year = itemView.findViewById(R.id.birth_year);
            death_year = itemView.findViewById(R.id.death_year);
            description = itemView.findViewById(R.id.description);
        }
    }
}
