package com.fengzi.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fengzi.R

/**
 *    author : fenzili
 *    e-mail : 291924028@qq.com
 *    date   : 2019/12/23 23:07
 *    pkn    : com.fengzi.ui.home
 *    desc   :
 */
class TaskAdapter(private val itemClick: () -> Unit) : RecyclerView.Adapter<TaskViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder =
        TaskViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_task,
                parent,
                false
            )
        )

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            itemClick.invoke()
        }
    }


}


class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)