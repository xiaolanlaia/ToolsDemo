package com.wjf.toolsdemo.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wjf.modulebitmap.page.PageBitmap
import com.wjf.toolsdemo.ui.page.PageMain

/**
 * @Description
 * @Author WuJianFeng
 * @Date 2022/12/22 11:19
 */
@Composable
fun MyNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = PAGE_MAIN){
        composable(PAGE_MAIN){
            PageMain(navController)
        }

        composable(PAGE_Bitmap){
            PageBitmap(navController)
        }
    }
}