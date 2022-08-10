package com.example.whatsapp.Adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.R

class ChatAdapter  {

     class reciever(itemView:View): RecyclerView.ViewHolder(itemView)
     {
         var recieverText:TextView

         init {
             recieverText = itemView.findViewById(R.id.recieverText)
         }
     }

    class sender(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        var senderText:TextView

        init {
            senderText = itemView.findViewById(R.id.senderText)
        }
    }
}