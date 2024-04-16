package com.example.navigation_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.sql.RowId

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // NavController 초기화
        navController = findNavController(R.id.nav_host_fragment)

        // BottomNavigationView 설정
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.setupWithNavController(navController)

        // 네비게이션바 버튼 클릭 리스터
        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.bottom_item_first -> { // 첫번째 버튼 클릭 시
                    navController.navigate(R.id.firstFragment) // 첫번째 프래그먼트로 이동
                }
                R.id.bottom_item_second -> { // 두번째 버튼 클릭 시
                    navController.navigate(R.id.secondFragment) // 두번째 프래그먼트로 이동
                }
            }
            it.onNavDestinationSelected(navController)

        }

    }

}