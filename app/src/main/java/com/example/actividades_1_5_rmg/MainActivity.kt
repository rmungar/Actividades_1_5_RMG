package com.example.actividades_1_5_rmg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.actividades_1_5_rmg.screens.Actividad1
import com.example.actividades_1_5_rmg.screens.Actividad2
import com.example.actividades_1_5_rmg.screens.Actividad3
import com.example.actividades_1_5_rmg.screens.Actividad4
import com.example.actividades_1_5_rmg.screens.Actividad5Elevada
import com.example.actividades_1_5_rmg.ui.theme.Actividades_1_5_RMGTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Actividades_1_5_RMGTheme {
                //Actividad1()
                //Actividad2()
                //Actividad3()
                //Actividad4()
                Actividad5Elevada()
            }
        }
    }
}

