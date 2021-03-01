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

/**
 * Controller for the Map page.
 */

class MapActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMapBinding
    private var mainMap: MyMap = MyMap()
    lateinit var addKeyInput: String
    lateinit var addValueInput: String
    lateinit var removeKeyInput: String
    lateinit var addLoneKeyInput: String
    lateinit var checkKeyInput: String
    lateinit var checkKeyResult: String

    /**
     * Function to set map display according to current content of mainMap and other fields.
     */

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

    }

    /**
     * Function to reset map display to blank.
     */

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

    /**
     * Function to display the value of the key being checked.
     */

    private fun displayCheckKeyResult(){
        try {
            if (checkKeyResult == "empty") {
                binding.checkKeyResult.text = ""
                Toast.makeText(this, "This key doesn't exist in the map.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "This value of checkKeyResult is $checkKeyResult", Toast.LENGTH_SHORT).show()
                binding.checkKeyResult.text = checkKeyResult
            }
        } catch (exception: UninitializedPropertyAccessException ){}
    }

    /**
     * Function which sets view to activity_map and sets click and change listeners on the view.
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * The click listener for the home button.
         */

        binding.btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        /**
         * The change listener for the addPair button.
         */

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

        /**
         * The change listener for the addValue button.
         */

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

        /**
         * The change listener for the removeKey button.
         */

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

        /**
         * The change listener for the addLoneKey button.
         */

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

        /**
         * The change listener for the checkKey button.
         */

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


        /**
         * The click listener for the addPair button. This will call the add function for the map and display the changed map.
         */

        binding.btnAddPair.setOnClickListener {v ->
            if(this::addValueInput.isInitialized && this::addKeyInput.isInitialized) {
                var addKey: String? = addKeyInput
                var addValue: String? = addValueInput
                if (addKey != null && addValue != null && addValue != "" && addKey != "") {
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

        /**
         * The click listener for the containsKey button. This will call the get function for the map and displays the result.
         */

        binding.btnContainsKey.setOnClickListener {v ->
            var checkKey: String? = checkKeyInput
            if (checkKey != null) {
                checkKeyResult = mainMap.getValue(checkKey).toString()
                setMapDisplay()
                displayCheckKeyResult()
            }
            if (checkKeyResult == "" || !this::checkKeyResult.isInitialized){
                Toast.makeText(this, "No such key exists in the map", Toast.LENGTH_SHORT).show()
                clearMapDisplay()
            }

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(v.windowToken, 0)
        }

        /**
         * The click listener for the removeKey button. This will call the remove function for the map and display the changed map.
         */

        binding.btnRemove.setOnClickListener {v ->
            if(this::removeKeyInput.isInitialized) {
                var removeKey: String? = removeKeyInput
                if (removeKey != null) {
                    var removeReturnValue = mainMap.remove(removeKey)
                    if (removeReturnValue == null){
                        Toast.makeText(this, "No such key exists in the map", Toast.LENGTH_SHORT).show()
                    }
                    setMapDisplay()
                }
            }

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(v.windowToken, 0)
        }

        /**
         * The click listener for the addLoneKey button. This will call the add function for the map and display the changed map.
         */

        binding.btnAddLoneKey.setOnClickListener {v ->
            var addKey: String? = addLoneKeyInput
            if (addKey != null) {
                mainMap.put(addKey)
                setMapDisplay()
            }
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(v.windowToken, 0)
        }

        /**
         * The click listener for the clear button. This will call the clear function for the map and display the changed map.
         */

        binding.btnClear.setOnClickListener {
            mainMap.clear()
            setMapDisplay()
        }

    }
}