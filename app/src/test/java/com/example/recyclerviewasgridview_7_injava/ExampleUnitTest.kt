package com.example.recyclerviewasgridview_7_injava

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
import org.junit.Assert
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, (2 + 2).toLong())
    }
}