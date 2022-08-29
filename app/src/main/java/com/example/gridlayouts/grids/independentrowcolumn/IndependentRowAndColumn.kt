package com.example.gridlayouts.grids.independentrowcolumn

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun IndependentRowAndColumn(){
    val list = (1..10).map { it.toString() }
Log.d("ListCreated",list.toString())
    LazyColumn {
        itemsIndexed((1..5).map { it.toString() }) { _, row ->
            LazyRow {
                itemsIndexed(list) { _, column ->

                    Card(
                        backgroundColor = Color.LightGray,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(4.dp)
                    ) {
                        Text(
                            text = "Row: $row\nCol: $column",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                }
            }
        }
    }
}