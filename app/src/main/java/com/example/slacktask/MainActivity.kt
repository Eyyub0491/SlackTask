package com.example.slacktask

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private var priceText1: EditText? = null
    private var radioAmazing: RadioButton? = null
    private var radioGood: RadioButton? = null
    private var radioOkay: RadioButton? = null
    private var roundSwitch: Switch? = null
    private var buttonCalc: Button? = null
    private var resultText: TextView? = null
    private var radioGroup1: RadioGroup? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initId()
        initOnClick()

//        var priceText2 = (priceText1?.getText()).toString()
        radioGood?.setOnCheckedChangeListener() { _: CompoundButton, b: Boolean ->
            if (b) {
                buttonCalc?.setOnClickListener() {
                    var priceText = (priceText1?.getText()).toString().toDouble()
                    var price = priceText * 0.18 * 100 / 100
                    resultText?.text = ("Tip Amount $$price")
                    roundSwitch?.setOnCheckedChangeListener() { _: CompoundButton, isChecked ->
                        buttonCalc?.setOnClickListener() {
                            if (!isChecked) {
                                var price1 = (priceText * 0.18) * 100 / 100
                                resultText?.text = ("Tip Amount $$price1")
                            }
                            if (isChecked) {
                                var price = (priceText * 0.18).roundToInt().toDouble()
                                resultText?.text = ("Tip Amount $$price")
                            }
                        }
                    }
                }
            }
            radioOkay?.setOnCheckedChangeListener() { _: CompoundButton, b: Boolean ->
                if (b) {
                    buttonCalc?.setOnClickListener() {
                        var priceText = (priceText1?.getText()).toString().toDouble()
                        var price = (priceText * 0.15) * 100 / 100
                        resultText?.text = ("Tip Amount $$price")
                        roundSwitch?.setOnCheckedChangeListener() { _: CompoundButton, isChecked ->
                            buttonCalc?.setOnClickListener() {
                                if (!isChecked) {
                                    var price1 = (priceText * 0.15) * 100 / 100
                                    resultText?.text = ("Tip Amount $$price1")
                                }
                                if (isChecked) {
                                    var price = (priceText * 0.15).roundToInt().toDouble()
                                    resultText?.text = ("Tip Amount $$price")
                                }
                            }
                        }
                    }
                }
            }
        }
        radioAmazing?.setOnCheckedChangeListener() { _: CompoundButton, b: Boolean ->
            if (b) {
                buttonCalc?.setOnClickListener() {
                    var priceText2 = (priceText1?.getText()).toString()

                    var priceText = (priceText1?.getText()).toString().toDouble()
                    var price = priceText * 0.2
                    resultText?.text = ("Tip Amount $$price")
                    roundSwitch?.setOnCheckedChangeListener() { _, isChecked ->
                        buttonCalc?.setOnClickListener() {
                            if (!isChecked) {
                                var price1 = priceText * 0.2
                                resultText?.text = ("Tip Amount $$price1")
                            }
                            if (isChecked) {
                                var price = ((priceText) * 0.2).roundToInt().toDouble()
                                resultText?.text = ("Tip Amount $$price")


                            }
                        }
                    }

                }
            }
        }
    }

    private fun initId() {
        priceText1 = findViewById(R.id.textPrice)
        radioAmazing = findViewById(R.id.radioAmazing)
        radioGood = findViewById(R.id.radioGood)
        radioOkay = findViewById(R.id.radioOkay)
        roundSwitch = findViewById(R.id.switch1)
        buttonCalc = findViewById(R.id.buttonCalculate)
        resultText = findViewById(R.id.textTip)
        radioGroup1 = findViewById(R.id.radioGroup2)
    }
        
    private fun initOnClick(){
        buttonCalc?.setOnClickListener() {
            if (priceText1 == null) {
                resultText?.text = "You did not enter the price"
            } else{

            }
        }
    }
}