package com.example.datastructuresapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.example.datastructuresapp.databinding.ActivityMainBinding
import com.example.datastructuresapp.databinding.ActivityQueueBinding
import java.lang.IndexOutOfBoundsException

class QueueActivity : AppCompatActivity() {


    private lateinit var binding: ActivityQueueBinding
    private var mainQueue: MyQueue<String> = MyQueue()
    lateinit var addInput: String

    private fun setQueueDisplay(){

        clearQueueDisplay()

        try {
            binding.textViewSize.text = mainQueue.size().toString()
            binding.textView1.text = mainQueue.getIndex(0)
            binding.textViewHead.text = mainQueue.getIndex(mainQueue.size() - 1)
            binding.textViewTail.text = mainQueue.getIndex(0)
            binding.textView2.text = mainQueue.getIndex(1)
            binding.textView3.text = mainQueue.getIndex(2)
            binding.textView4.text = mainQueue.getIndex(3)
            binding.textView5.text = mainQueue.getIndex(4)
            binding.textView6.text = mainQueue.getIndex(5)
            binding.textView7.text = mainQueue.getIndex(6)
            binding.textView8.text = mainQueue.getIndex(7)
            binding.textView9.text = mainQueue.getIndex(8)
            binding.textView10.text = mainQueue.getIndex(9)
            binding.textView11.text = mainQueue.getIndex(10)
        } catch (exception: IndexOutOfBoundsException){}

    }

    private fun clearQueueDisplay(){

        try{
            binding.addInput.setText("")
            binding.popOutput.text = ""
            binding.textViewTail.text = ""
            binding.textViewHead.text = ""
            binding.textViewSize.text = ""
            binding.textView1.text = ""
            binding.textView2.text = ""
            binding.textView3.text = ""
            binding.textView4.text = ""
            binding.textView5.text = ""
            binding.textView6.text = ""
            binding.textView7.text = ""
            binding.textView8.text = ""
            binding.textView9.text = ""
            binding.textView10.text = ""
            binding.textView11.text = ""
        } catch(exception: IndexOutOfBoundsException){}
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueueBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.addInput.addTextChangedListener(object: TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                s!!
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s!!
            }

            override fun afterTextChanged(s: Editable?) {
                addInput = s.toString()!!
            }
        })

        binding.btnAdd.setOnClickListener{v  ->

            if(mainQueue.size() <= 10) {
                try {
                    mainQueue.add(addInput)
                    setQueueDisplay()
                } catch (exception: ArrayIndexOutOfBoundsException) {
                }
            } else {
                Toast.makeText(this, "The Queue is full!!", Toast.LENGTH_SHORT).show()
            }

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(v.windowToken, 0)
        }

        binding.btnPop.setOnClickListener {
            try{
                var popPlaceholder = mainQueue.peek()
                mainQueue.remove()
                setQueueDisplay()
                binding.popOutput.text = popPlaceholder
            } catch(exception: ArrayIndexOutOfBoundsException){}
        }

        binding.btnClear.setOnClickListener {
            mainQueue.clear()
            setQueueDisplay()
        }

    }
}