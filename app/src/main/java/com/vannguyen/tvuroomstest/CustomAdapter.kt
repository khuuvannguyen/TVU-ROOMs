package com.vannguyen.tvuroomstest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var context: Context, var mangPhong : ArrayList<Phong>) : BaseAdapter() {
    class ViewHolder(row : View){
        var textviewPhong : TextView
        var imageviewPhong : ImageView
        init {
            textviewPhong = row.findViewById(R.id.textview_phong) as TextView
            imageviewPhong = row.findViewById(R.id.imageview_phong) as ImageView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View?
        var viewHolder : ViewHolder
        if(convertView == null){
            var layoutinflater : LayoutInflater = LayoutInflater.from(context)
            view = layoutinflater.inflate(R.layout.tim_phong,null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }
        var phong : Phong = getItem(position) as Phong
        viewHolder.textviewPhong.text = phong.ten
        viewHolder.imageviewPhong.setImageResource(phong.hinhanh)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return mangPhong.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return mangPhong.size
    }
}
