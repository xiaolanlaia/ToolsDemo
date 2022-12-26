package com.wjf.toolsdemo.ui.page

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.wjf.toolsdemo.R
import com.wjf.toolsdemo.ui.nav.PAGE_Bitmap

/**
 * @Description
 * @Author WuJianFeng
 * @Date 2022/12/22 11:24
 */
@Composable
fun PageMain(navController: NavController) {
    Column(
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Bitmap工具",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .clickable {
                    navController.navigate(PAGE_Bitmap)
                }
                .fillMaxWidth()
                .background(colorResource(id = R.color.teal_200))
                .padding(15.dp)

        )

    }
}