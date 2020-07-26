package com.example.semaforo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

        view.findViewById<Button>(R.id.buttonRed).setOnClickListener { view ->
            Snackbar.make(view, "Soy un botón Amarillo", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        view.findViewById<Button>(R.id.buttonYel).setOnClickListener { view ->
            Snackbar.make(view, "Soy un botón Amarillo", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        view.findViewById<Button>(R.id.buttonGre).setOnClickListener { view ->
            Snackbar.make(view, "Soy un botón Verde", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}