    package com.example.my_tests

    import android.os.Bundle
    import androidx.activity.enableEdgeToEdge
    import androidx.annotation.BinderThread
    import androidx.appcompat.app.AppCompatActivity
    import androidx.core.view.ViewCompat
    import androidx.core.view.WindowInsetsCompat
    import com.example.my_tests.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            enableEdgeToEdge()
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.btnPlus.setOnClickListener {

                val num1 = binding.editTextNumber1.text.toString().toIntOrNull()
                val num2 = binding.editTextNumber2.text.toString().toIntOrNull()

                if (num1 == null || num2 == null) {
                    binding.txtResult.text = "Введите числа"
                } else {
                    binding.txtResult.text = (num1 + num2).toString()
                }
            }
            binding.btnMultiply.setOnClickListener {

                val num1 = binding.editTextNumber1.text.toString().toIntOrNull()
                val num2 = binding.editTextNumber2.text.toString().toIntOrNull()

                if (num1 == null || num2 == null) {
                    binding.txtResult.text = "Введите числа"
                } else {
                    binding.txtResult.text = (num1 * num2).toString()
                }
            }
            binding.btnMinus.setOnClickListener {

                val num1 = binding.editTextNumber1.text.toString().toIntOrNull()
                val num2 = binding.editTextNumber2.text.toString().toIntOrNull()

                if (num1 == null || num2 == null) {
                    binding.txtResult.text = "Введите числа"
                } else {
                    binding.txtResult.text = (num1 - num2).toString()
                }
            }
            binding.btnDivision.setOnClickListener {

                val num1 = binding.editTextNumber1.text.toString().toIntOrNull()
                val num2 = binding.editTextNumber2.text.toString().toIntOrNull()

                if (num1 == null || num2 == null) {
                    binding.txtResult.text = "Введите числа"
                }else if(num2==0){
                    binding.txtResult.text="Нельзя делить \nна 0"
                } else {
                    binding.txtResult.text = (num1 / num2).toString()
                }
            }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
    }
}