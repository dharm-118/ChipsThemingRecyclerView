package com.example.chipsthemingrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.chipsthemingrecyclerview.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) : Unit {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        buttonOnClickListners(binding)


    }

    private fun buttonOnClickListners(binding: ActivityMainBinding) = with(binding){
        val bottomSheetFragment = BottomSheetFragment()
        uiModalBottomSheet.setOnClickListener {
            bottomSheetFragment.show(supportFragmentManager,"BottomSheetDialog")
        }
    }
}