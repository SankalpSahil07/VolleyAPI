package com.example.volleyapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
   //MainActivity mainActivity;
   List<UserModel> allUserModelList;

   public UserAdapter(List<UserModel> allUserModelList){
     // this.mainActivity = mainActivity;
      this.allUserModelList = allUserModelList;
   }

   @NonNull
   @Override
   public UserHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
      return new UserHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_user, parent, false));
   }

   @Override
   public void onBindViewHolder(@NonNull UserHolder holder, int position) {
      holder.textView.setText(allUserModelList.get(position).getTitle());
   }

   @Override
   public int getItemCount() {
      return allUserModelList.size();
   }
   class UserHolder extends RecyclerView.ViewHolder{
      TextView textView;

      public UserHolder(@NonNull View itemView) {
         super(itemView);
         textView = itemView.findViewById(R.id.itemText);

      }
   }
}
