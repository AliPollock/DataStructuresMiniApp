package com.example.datastructuresapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast
import com.example.datastructuresapp.databinding.ActivityQueueBinding
import com.example.datastructuresapp.databinding.ActivityStackBinding
import java.lang.IndexOutOfBoundsException

class StackActivity : AppCompatActivity() {


    private lateinit var binding: ActivityStackBinding
    private var mainStack: MyStack<String> = MyStack()
    lateinit var pushInput: String

    private fun setStackDisplay(){

        clearStackDisplay()
        if(!mainStack.isEmpty()) {
            binding.textViewIsEmpty.text = "False"
        }

        try {
            binding.textViewSize.text = mainStack.size().toString()
            binding.textView1.text = mainStack.getIndex(mainStack.size() - 1)
            binding.textViewTop.text = mainStack.getIndex(mainStack.size() - 1)
            binding.textView2.text = mainStack.getIndex(mainStack.size() - 2)
            binding.textView3.text = mainStack.getIndex(mainStack.size() - 3)
            binding.textView4.text = mainStack.getIndex(mainStack.size() - 4)
            binding.textView5.text = mainStack.getIndex(mainStack.size() - 5)
            binding.textView6.text = mainStack.getIndex(mainStack.size() - 6)
            binding.textView7.text = mainStack.getIndex(mainStack.size() - 7)
            binding.textView8.text = mainStack.getIndex(mainStack.size() - 8)
            binding.textView9.text = mainStack.getIndex(mainStack.size() - 9)
            binding.textView10.text = mainStack.getIndex(mainStack.size() - 10)
            binding.textView11.text = mainStack.getIndex(mainStack.size() - 11)
            binding.textView12.text = mainStack.getIndex(mainStack.size() - 12)
        } catch (exception: IndexOutOfBoundsException){}

    }


    private fun clearStackDisplay(){

        try {
            binding.textViewIsEmpty.text = "True"
            binding.textViewSize.text = ""
            binding.textViewTop.text = ""
            binding.textView1.text = ""
            binding.popOutput.text = ""
            binding.pushInput.setText("")
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
            binding.textView12.text = ""
        } catch (exception: IndexOutOfBoundsException){}
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStackBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setStackDisplay()


        binding.btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.pushInput.addTextChangedListener(object: TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                s!!
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s!!
            }

            override fun afterTextChanged(s: Editable?) {
                pushInput = s.toString()!!
            }
        })

        binding.btnPush.setOnClickListener{v  ->

            if(mainStack.size() <= 11) {

                try {
                    mainStack.push(pushInput)
                    setStackDisplay()
                } catch (exception: ArrayIndexOutOfBoundsException) {
                }
            } else {
                Toast.makeText(this, "The Stack is full!!", Toast.LENGTH_SHORT).show()
            }

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(v.windowToken, 0)
        }



        binding.btnPop.setOnClickListener {
            try{
                var popPlaceholder = mainStack.top()
                mainStack.pop()
                setStackDisplay()
                binding.popOutput.text = popPlaceholder
            } catch(exception: ArrayIndexOutOfBoundsException){}
        }

        binding.btnClear.setOnClickListener {
            mainStack.clear()
            setStackDisplay()
        }




    }
}