package com.rm.lab

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    private lateinit var txtResult: TextView
    private lateinit var btnZero: Button
    private lateinit var btnOne: Button
    private lateinit var btnTwo: Button
    private lateinit var btnThree: Button
    private lateinit var btnFour: Button
    private lateinit var btnFive: Button
    private lateinit var btnSix: Button
    private lateinit var btnSeven: Button
    private lateinit var btnEight: Button
    private lateinit var btnNine: Button
    private lateinit var btnSum: Button
    private lateinit var btnRes: Button
    private lateinit var btnMul: Button
    private lateinit var btnDiv: Button
    private lateinit var btnResult: Button
    private lateinit var btnClean: Button

    private var valueA: Double = 0.0
    private var mode: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        txtResult = findViewById(R.id.txtResult)
        btnZero = findViewById(R.id.btnZero)
        btnOne = findViewById(R.id.btnOne)
        btnTwo = findViewById(R.id.btnTwo)
        btnThree = findViewById(R.id.btnThree)
        btnFour = findViewById(R.id.btnFour)
        btnFive = findViewById(R.id.btnFive)
        btnSix = findViewById(R.id.btnSix)
        btnSeven = findViewById(R.id.btnSeven)
        btnEight = findViewById(R.id.btnEight)
        btnNine = findViewById(R.id.btnNine)
        btnSum = findViewById(R.id.btnSum)
        btnRes = findViewById(R.id.btnRes)
        btnMul = findViewById(R.id.btnMul)
        btnDiv = findViewById(R.id.btnDiv)
        btnResult = findViewById(R.id.btnResult)
        btnClean = findViewById(R.id.btnClean)

        btnZero.setOnClickListener {
            txtResult.append(getString(R.string.zero))
        }

        btnOne.setOnClickListener {
            txtResult.append(getString(R.string.one))
        }

        btnTwo.setOnClickListener {
            txtResult.append(getString(R.string.two))
        }

        btnThree.setOnClickListener {
            txtResult.append(getString(R.string.three))
        }

        btnFour.setOnClickListener {
            txtResult.append(getString(R.string.four))
        }

        btnFive.setOnClickListener {
            txtResult.append(getString(R.string.five))
        }

        btnSix.setOnClickListener {
            txtResult.append(getString(R.string.six))
        }

        btnSeven.setOnClickListener {
            txtResult.append(getString(R.string.seven))
        }

        btnEight.setOnClickListener {
            txtResult.append(getString(R.string.eight))
        }

        btnNine.setOnClickListener {
            txtResult.append(getString(R.string.nine))
        }

        btnSum.setOnClickListener {
            valueA = txtResult.text.toString().toDouble()
            txtResult.text = ""
            mode = 1
        }

        btnRes.setOnClickListener {
            valueA = txtResult.text.toString().toDouble()
            txtResult.text = ""
            mode = 2
        }

        btnMul.setOnClickListener {
            valueA = txtResult.text.toString().toDouble()
            txtResult.text = ""
            mode = 3
        }

        btnDiv.setOnClickListener {
            valueA = txtResult.text.toString().toDouble()
            txtResult.text = ""
            mode = 4
        }

        btnResult.setOnClickListener {
            when (mode) {
                1 -> valueA += txtResult.text.toString().toDouble()
                2 -> valueA -= txtResult.text.toString().toDouble()
                3 -> valueA *= txtResult.text.toString().toDouble()
                4 -> safeDivision(txtResult.text.toString().toDouble())
                else -> {
                    txtResult.text = ""
                }
            }
            mode = 0
        }

        btnClean.setOnClickListener {
            txtResult.text = ""
            valueA = 0.0
            mode = 0
        }

    }

    private fun safeDivision (number: Double) {
        try {
            valueA /= number
        } catch (e:Exception) {
            valueA = 0.0
        }
    }

}