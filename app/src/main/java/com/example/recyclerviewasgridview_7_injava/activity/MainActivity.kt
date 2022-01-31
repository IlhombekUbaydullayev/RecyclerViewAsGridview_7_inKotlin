package com.example.recyclerviewasgridview_7_injava.activity

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.recyclerviewasgridview_7_injava.R
import com.example.recyclerviewasgridview_7_injava.adapter.CustomAdapter.CustomViewHolder
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewasgridview_7_injava.adapter.CustomAdapter
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recyclerviewasgridview_7_injava.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private var context: Context? = null
    private var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        val members = prepareMemberList()
        refreshAdapter(members)
    }

    private fun initView() {
        context = this
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView!!.setLayoutManager(GridLayoutManager(this,3))
    }

    private fun prepareMemberList(): List<Member> {
        val members: ArrayList<Member> = ArrayList()
        for (i in 0..29) {
            members.add(Member("Ilhombek$i", "Ubaydullayev$i"))
        }
        return members
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomAdapter(this, members)
        recyclerView!!.setAdapter(adapter)
    }


}