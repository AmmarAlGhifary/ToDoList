package com.blogspot.yourfavoritekaisar.todolist.fragment.add

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.blogspot.yourfavoritekaisar.todolist.R

class AddFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        setHasOptionsMenu(true)

        return inflater.inflate(R.layout.fragment_add, container, false)

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.add_fragment_menu, menu)
    }
}