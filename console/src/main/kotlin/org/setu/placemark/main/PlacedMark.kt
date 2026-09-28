package org.setu.placemark.main

data class PlacedMark(
    val id: Long = 0L,
    val title: String,
    val desc: String,
    val x: Double,
    val y: Double
)