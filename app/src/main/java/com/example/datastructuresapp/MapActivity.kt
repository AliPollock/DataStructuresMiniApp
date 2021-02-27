package com.example.datastructuresapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.example.datastructuresapp.databinding.ActivityMapBinding
import com.example.datastructuresapp.databinding.ActivityQueueBinding
import java.lang.IndexOutOfBoundsException
import java.lang.NullPointerException

class MapActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMapBinding
    private var mainMap: MyMap = MyMap()
    lateinit var addKeyInput: String
    lateinit var addValueInput: String
    lateinit var removeKeyInput: String
    lateinit var addLoneKeyInput: String
    lateinit var checkKeyInput: String
    lateinit var checkKeyResult: String

    private fun setMapDisplay(){

        clearMapDisplay()

        if(!mainMap.isEmpty()) {
            binding.isEmpty.text = "False"
        }

        try {

            binding.keyTextView1.text = mainMap.getIndex(0).getKey().toString()
            binding.valueTextView1.text = mainMap.getIndex(0).getValue().toString()

            binding.keyTextView2.text = mainMap.getIndex(1).getKey().toString()
            binding.valueTextView2.text = mainMap.getIndex(1).getValue().toString()

            binding.keyTextView3.text = mainMap.getIndex(2).getKey().toString()
            binding.valueTextView3.text = mainMap.getIndex(2).getValue().toString()

            binding.keyTextView4.text = mainMap.getIndex(3).getKey().toString()
            binding.valueTextView4.text = mainMap.getIndex(3).getValue().toString()

            binding.keyTextView5.text = mainMap.getIndex(4).getKey().toString()
            binding.valueTextView5.text = mainMap.getIndex(4).getValue().toString()

            binding.keyTextView6.text = mainMap.getIndex(5).getKey().toString()
            binding.valueTextView6.text = mainMap.getIndex(5).getValue().toString()

            binding.keyTextView7.text = mainMap.getIndex(6).getKey().toString()
            binding.valueTextView7.text = mainMap.getIndex(6).getValue().toString()

            binding.keyTextView8.text = mainMap.getIndex(7).getKey().toString()
            binding.valueTextView8.text = mainMap.getIndex(7).getValue().toString()

            binding.keyTextView9.text = mainMap.getIndex(8).getKey().toString()
            binding.valueTextView9.text = mainMap.getIndex(8).getValue().toString()

            binding.keyTextView10.text = mainMap.getIndex(9).getKey().toString()
            binding.valueTextView10.text = mainMap.getIndex(9).getValue().toString()

            binding.keyTextView11.text = mainMap.getIndex(10).getKey().toString()
            binding.valueTextView11.text = mainMap.getIndex(10).getValue().toString()

        } catch (exception: IndexOutOfBoundsException){}

        try {
            binding.checkKeyResult.text = checkKeyResult
        } catch (exception: UninitializedPropertyAccessException ){}

    }

    private fun clearMapDisplay(){

        try{
            binding.addKeyInput.setText("")
            binding.addValueInput.setText("")
            binding.addLoneKeyInput.setText("")
            binding.removeKeyInput.setText("")
            binding.checkKeyInput.setText("")
            binding.checkKeyResult.text = ""
            binding.isEmpty.text = "True"

            binding.keyTextView1.text = ""
            binding.keyTextView2.text = ""
            binding.keyTextView3.text = ""
            binding.keyTextView9.text = ""
            binding.keyTextView4.text = ""
            binding.keyTextView5.text = ""
            binding.keyTextView6.text = ""
            binding.keyTextView7.text = ""
            binding.keyTextView8.text = ""
            binding.keyTextView10.text = ""
            binding.keyTextView11.text = ""

            binding.valueTextView1.text = ""
            binding.valueTextView2.text = ""
            binding.valueTextView3.text = ""
            binding.valueTextView4.text = ""
            binding.valueTextView5.text = ""
            binding.valueTextView6.text = ""
            binding.valueTextView7.text = ""
            binding.valueTextView8.text = ""
            binding.valueTextView9.text = ""
            binding.valueTextView10.text = ""
            binding.valueTextView11.text = ""

        } catch(exception: IndexOutOfBoundsException){}
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.addKeyInput.addTextChangedListener(object: TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                s!!
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s!!
            }

            override fun afterTextChanged(s: Editable?) {
                addKeyInput = s.toString()!!
            }
        })

        binding.addValueInput.addTextChangedListener(object: TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                s!!
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s!!
            }

            override fun afterTextChanged(s: Editable?) {
                addValueInput = s.toString()!!
            }
        })

        binding.removeKeyInput.addTextChangedListener(object: TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                s!!
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s!!
            }

            override fun afterTextChanged(s: Editable?) {
                removeKeyInput = s.toString()!!
            }
        })

        binding.addLoneKeyInput.addTextChangedListener(object: TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                s!!
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s!!
            }

            override fun afterTextChanged(s: Editable?) {
                addLoneKeyInput = s.toString()!!
            }
        })

        binding.checkKeyInput.addTextChangedListener(object: TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                s!!
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s!!
            }

            override fun afterTextChanged(s: Editable?) {
                checkKeyInput = s.toString()!!
            }
        })


        binding.btnAddPair.setOnClickListener {v ->
            if(this::addValueInput.isInitialized) {
                var addKey: String? = addKeyInput
                var addValue: String? = addValueInput
                if (addKey != null && addValue != null && addValue != "") {
                    mainMap.put(addKey, addValue)
                    setMapDisplay()

                } else {
                    Toast.makeText(this, "You must enter a key and a value", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "You must enter a key and a value", Toast.LENGTH_SHORT).show()
            }

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(v.windowToken, 0)
        }

        binding.btnContainsKey.setOnClickListener {v ->
            var checkKey: String? = checkKeyInput
            if (checkKey != null) {
                checkKeyResult = mainMap.getValue(checkKey).toString()
                setMapDisplay()
            }
            if (checkKeyResult == "" || !this::checkKeyResult.isInitialized){
                Toast.makeText(this, "No such key exists in the map", Toast.LENGTH_SHORT).show()
            }

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(v.windowToken, 0)
        }

        binding.btnRemove.setOnClickListener {v ->
            if(this::removeKeyInput.isInitialized) {
                var removeKey: String? = removeKeyInput
                if (removeKey != null) {
                    mainMap.remove(removeKey)
                    setMapDisplay()
                } else {
                    Toast.makeText(this, "No such key exists in the map", Toast.LENGTH_SHORT).show()
                }
            }

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(v.windowToken, 0)
        }

        binding.btnAddLoneKey.setOnClickListener {v ->
            var addKey: String? = addLoneKeyInput
            if (addKey != null) {
                mainMap.put(addKey)
                setMapDisplay()
            }
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(v.windowToken, 0)
        }

        binding.btnClear.setOnClickListener {
            mainMap.clear()
            setMapDisplay()
        }

    }
}